package com.api.controle_acesso.controller;

import com.api.controle_acesso.model.UsersModel;
import com.api.controle_acesso.repository.UsersRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersRepository repository;

    @GetMapping()
    public List<UsersModel> listALl(){
        return repository.findAll();
    }

    @PostMapping()
    public UsersModel save(@RequestBody UsersModel user){
        repository.save(user);
        return user;
    }
    @GetMapping("{email}")
    public UsersModel findByEmail(@PathVariable("email") String email) {
        return repository.findByemail(email);
    }
}
