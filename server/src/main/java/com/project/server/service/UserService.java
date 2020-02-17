package com.project.server.service;

import com.project.server.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService   {
    @Autowired
    UserDao userDao;

    @Autowired
    AppUserDetailsService userDetailsService;
}
