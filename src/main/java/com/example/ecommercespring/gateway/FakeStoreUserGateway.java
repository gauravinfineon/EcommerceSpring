package com.example.ecommercespring.gateway;
import com.example.ecommercespring.dto.UserDTO;
import com.example.ecommercespring.gateway.api.FakeStoreUserApi;
import com.example.ecommercespring.dto.FakeStoreUserResponseDTO;
import retrofit2.Call;
import org.springframework.stereotype.Component;
import com.example.ecommercespring.gateway.IUserGateway;
import retrofit2.Retrofit;
import retrofit2.Response;

@Component
public class FakeStoreUserGateway implements IUserGateway {
    private final FakeStoreUserApi fakeStoreUserApi;
    public FakeStoreUserGateway(FakeStoreUserApi fakeStoreUserApi) {
        this.fakeStoreUserApi = fakeStoreUserApi;
    }

    @Override
    public UserDTO getUserById(Long id) throws Exception {
        // Call the API using Retrofit
        Response<FakeStoreUserResponseDTO> response = fakeStoreUserApi.getFakeUser(id).execute();

        // Check if the response is successful
        if (!response.isSuccessful()) {
            throw new Exception("HTTP Error: " + response.code() + ", Message: " + response.message());
        }

        // Get the body of the response
        FakeStoreUserResponseDTO body = response.body();

        // Validate the body and extract the user
        if (body == null || body.getUser() == null) {
            throw new Exception("User not found in the response");
        }

        return body.getUser();
    }


}