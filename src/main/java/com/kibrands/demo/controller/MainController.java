package com.kibrands.demo.controller;

import com.kibrands.demo.service.UserService;
import com.sun.faces.action.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/")
public class MainController {
    private UserService userService;
}
