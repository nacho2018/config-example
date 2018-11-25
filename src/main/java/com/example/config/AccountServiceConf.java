package com.example.config;

import com.example.service.AccountService;
import com.example.service.AccountServiceDes;
import com.example.service.AccountServicePro;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AccountServiceConf {

    @Bean
    @Profile("des")
    public AccountService accountServiceDes(){
        return new AccountServiceDes();
    }
    @Bean
    @Profile("pro")
    public AccountService accountServicePro(){

        return new AccountServicePro();
    }
}
