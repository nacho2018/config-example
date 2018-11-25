package com.example.service;

public class AccountServicePro implements AccountService{

    @Override
    public String getId() {
        return "11111_PRO";
    }

    @Override
    public String getOffice() {
        return "OFFI_425252_PRO";
    }

    @Override
    public boolean isActive() {
        return true;
    }
}
