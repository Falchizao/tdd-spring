package com.example.testdrivendevelopment.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootTest
public class ComissionTest {

    @TestConfiguration
    static class ComissionConfiguration{

        @Bean
        public Comission comissao(){
            return new Comission();
        }
    }

    @Autowired
    Comission comission;

    @Test
    public void deve_calcular_100_reais_de_comissao_para_venda_de_1000(){ //Snake case
        //TDD
        //Arrange --Preparation
        
        double sellValue = 1000.0;
        double comissionValue = 100.00;

        //Act --Action
        Double value = comission.calcular(sellValue);

        //Assert -- Confirmation
        Assertions.assertEquals(comissionValue, value);
    }


    @Test
    public void deve_calcular_30_reais_de_comissao_para_venda_de_2000(){ //Snake case
        //TDD
        //Arrange --Preparation
        
        double sellValue = 2000.0;
        double comissionValue = 300.00;

        //Act --Action
        Double value = comission.calcular(sellValue);

        //Assert -- Confirmation
        Assertions.assertEquals(comissionValue, value);
    }
    
}
