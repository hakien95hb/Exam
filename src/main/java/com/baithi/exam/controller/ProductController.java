package com.baithi.exam.controller;

import com.baithi.exam.entity.Product;
import com.baithi.exam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping(method = RequestMethod.GET, value = "/create")
    public String create(Model model){
        model.addAttribute("product", new Product());
        return "product/form";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public String store(Product product){
        productService.create(product);
        return "product/form";
    }


    @RequestMapping(method = RequestMethod.GET, value = "/list")
    public String showListProduct(Model model){
        model.addAttribute("listProduct", productService.getList(1, 10));
        return "product/list";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public String getDetai(@PathVariable long id, Model model){
        model.addAttribute("product", productService.getDetail(id));
        return "product/detail";
    }


}