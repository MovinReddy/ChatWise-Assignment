package com.example.chatwise;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ProductService {
    @GET("products")
    Call<ProductsResponse> getProducts();
}
