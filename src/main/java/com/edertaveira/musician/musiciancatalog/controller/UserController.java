package com.edertaveira.musician.musiciancatalog.controller;

import com.edertaveira.musician.musiciancatalog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

}
