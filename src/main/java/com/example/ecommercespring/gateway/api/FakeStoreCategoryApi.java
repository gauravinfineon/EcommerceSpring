package com.example.ecommercespring.gateway.api;

import java.io.IOException;

import com.example.ecommercespring.dto.FakeStoreCategoryResponseDTO;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface FakeStoreCategoryApi {

    @GET("products/category")
    Call<FakeStoreCategoryResponseDTO> getAllFakeCategories() throws IOException;
}