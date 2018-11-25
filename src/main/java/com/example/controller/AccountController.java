package com.example.controller;

import com.example.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class AccountController {


    private AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService){

        this.accountService = accountService;
    }
    public String getId(){

        return this.accountService.getId();

    }
    public String  getOffice(){

        return this.accountService.getOffice();
    }

    public boolean isActive(){

        return this.accountService.isActive();
    }
}
