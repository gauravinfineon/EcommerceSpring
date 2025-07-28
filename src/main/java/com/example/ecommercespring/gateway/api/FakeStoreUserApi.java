package com.example.ecommercespring.gateway.api;
import com.example.ecommercespring.dto.FakeStoreUserResponseDTO;
import retrofit2.Call;
import retrofit2.http.*;
public interface FakeStoreUserApi {
    @GET("users/{id}")
    Call<FakeStoreUserResponseDTO> getFakeUser(@Path("id") Long id);

    
}
