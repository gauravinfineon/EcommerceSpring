package com.example.ecommercespring.gateway;
import com.example.ecommercespring.dto.CategoryDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;
@Component("gaurav")
// @Primary
public class FakeStoreRestTemplateGateway implements ICategoryGateway {

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
         return new ArrayList<>(); // Placeholder for actual implementation
    }

    // Define methods to interact with the Fake Store API using restTemplate
}