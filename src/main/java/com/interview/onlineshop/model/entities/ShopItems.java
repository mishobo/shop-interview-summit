package com.interview.onlineshop.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "shop_items")
public class ShopItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String itemname;
    private String stockcode ;
    private Double priceperunit ;

    public ShopItems() {}

    public ShopItems(String itemname, String stockcode, Double priceperunit) {
        this.itemname = itemname;
        this.stockcode = stockcode;
        this.priceperunit = priceperunit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getStockcode() {
        return stockcode;
    }

    public void setStockcode(String stockcode) {
        this.stockcode = stockcode;
    }

    public Double getPriceperunit() {
        return priceperunit;
    }

    public void setPriceperunit(Double priceperunit) {
        this.priceperunit = priceperunit;
    }
}
