package com.user.usermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UserManagementApplication {
    @GetMapping("/")
    public String home() {
        return "<h1>Home ssAbde  xdaaa</h1>";
    }

    public static void main(String[] args) {
        SpringApplication.run(UserManagementApplication.class, args);
    }

}
