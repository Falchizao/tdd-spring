package com.example.testdrivendevelopment.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.testdrivendevelopment.model.Product;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@WebMvcTest
public class ProductControllerTest {

    //MockMVC

    //Mockito

    //Mock == Product fictício
    @Autowired
    private ProductController productController;

    @Autowired
    private MockMvc mockMVC;

    @BeforeEach
    public void setup(){ //Exec antes de all
        this.mockMVC = MockMvcBuilders.standaloneSetup(productController).build();

    }

    @Test
    public void deve_retornar_status_200_ok_ao_obter_todos_os_produtos() throws Exception{

        //Arrange --Preparation
        //List<Product> product = new ArrayList<Product>();
        var requestBuilder = MockMvcRequestBuilders.get("/api/product");

        //Act --Action
        this.mockMVC.perform(requestBuilder)
        //Assert --Confirmation
        .andExpect(MockMvcResultMatchers.status().isOk());
        

        
    }
    
}
