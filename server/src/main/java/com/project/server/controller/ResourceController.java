package com.project.server.controller;

import com.project.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api",produces = "application/json")
public class ResourceController {

    @Autowired
    UserService userService;


}
