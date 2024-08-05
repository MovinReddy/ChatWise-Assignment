package com.example.chatwise;

import com.google.gson.annotations.SerializedName;

import java.util.List;

class ProductsResponse {
    @SerializedName("products")
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }
}
