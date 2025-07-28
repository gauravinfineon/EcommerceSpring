package com.example.ecommercespring.gateway.api;
import java.io.IOException;

import com.example.ecommercespring.dto.FakeStoreProductResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
public interface FakeStoreProductApi {
    @GET("products/{id}")
    Call<FakeStoreProductResponseDTO> getFakeProduct(@Path("id") Long id);
}