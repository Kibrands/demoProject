package com.kibrands.demo;

import com.kibrands.demo.mapper.UserMapper;
import com.kibrands.demo.model.User;
import com.kibrands.demo.service.UserService;
import com.kibrands.demo.service.impl.UserServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;
import java.sql.Date;
import java.util.Base64;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    private final UserMapper userMapper;

    public DemoApplication(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        this.userMapper.insertUser(User.builder()
                .userName("julio")
                .email("juliomattacadenas@gmail.com")
                .password(Base64.getEncoder().encodeToString("julio".getBytes()))
                .birth(new Date(1999, 12, 26))
                .build());
        this.userMapper.getAllUsers().forEach(System.out::println);
		User user = this.userMapper.getUser(1);
		System.out.println(user.toString());
		System.out.print("Modificando usuario " + user.getUserId() + "...");
		user.setEmail("kibrandsofficial@gmail.com");
		System.out.println("\t" + (this.userMapper.updateUser(user) ? "OK" : "X"));
    }
}
