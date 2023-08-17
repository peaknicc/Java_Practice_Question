package com.ohgiraffers.hw3.model.vo;

import com.ohgiraffers.hw3.controller.ProductController;

public class ProductDTO {
    private int pId;
    private String pName;
    private int price;
    private double tax;
    ProductController count;

    public ProductDTO() {
    }

    public ProductDTO(int pId, String pName, int price, double tax) {
        this.pId = pId;
        this.pName = pName;
        this.price = price;
        this.tax = tax;
        ProductController.count++;
    }

    public String information() {
        return null;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "제품 번호 : " + pId +
                " 제품명 : " + pName +
                " 제품 가격 : " + price +
                " 제품 세금 : " + tax;
    }
}
