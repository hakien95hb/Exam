package com.baithi.exam.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sale {
    @Id
    private  long id;
    private long saleman_Id;
    private long product_Id;
    private String salemanName;
    private long dos;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSaleman_Id() {
        return saleman_Id;
    }

    public void setSaleman_Id(long saleman_Id) {
        this.saleman_Id = saleman_Id;
    }

    public long getProduct_Id() {
        return product_Id;
    }

    public void setProduct_Id(long product_Id) {
        this.product_Id = product_Id;
    }

    public String getSalemanName() {
        return salemanName;
    }

    public void setSalemanName(String salemanName) {
        this.salemanName = salemanName;
    }

    public long getDos() {
        return dos;
    }

    public void setDos(long dos) {
        this.dos = dos;
    }
}
