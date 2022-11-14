package io.github.bluething.playground.security.ssf2022one.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@DisplayName("Given demo url")
@SpringBootTest
@AutoConfigureMockMvc
public class DemoControllerTest {
    @Autowired
    private MockMvc mockMvc;

    private static final String BASE_URL = "/hello";

    @DisplayName("When we call hello endpoint without any credential then the api will return unauthorized response code")
    @Test
    public void getHelloWithoutCredentialMustReturnUnAuthorizedError() throws Exception {
        mockMvc.perform(get(BASE_URL)).andExpect(status().isUnauthorized());
    }
}
