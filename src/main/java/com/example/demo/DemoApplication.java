package com.example.demo;

import com.example.controller.AccountController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example")
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
        AccountController controller = (AccountController)ctx.getBean("accountController");

        System.out.println("Account id " + controller.getId());
        System.out.println("Office name  " + controller.getOffice());
        System.out.println("Account active  " + controller.isActive());

    }
}
