package com.example.service;


public class AccountServiceDes implements AccountService{
    @Override
    public String getId() {
        return "11111_DES";
    }

    @Override
    public String getOffice() {
        return "OFFI_425252_DES";
    }

    @Override
    public boolean isActive() {
        return false;
    }
}
