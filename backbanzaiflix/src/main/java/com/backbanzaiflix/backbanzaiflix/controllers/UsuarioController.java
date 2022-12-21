package com.backbanzaiflix.backbanzaiflix.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backbanzaiflix.backbanzaiflix.repositorys.RoleRepository;
import com.backbanzaiflix.backbanzaiflix.repositorys.UsuarioRepository;

import lombok.Data;

@RestController
@Data
@CrossOrigin(origins = "*")
public class UsuarioController {
    
   @Autowired
   private RoleRepository rr;

   @Autowired
   private UsuarioRepository ur;
    @GetMapping("/")
     public String inicio(){
      return "bem vindo a api";
     }

     @GetMapping("/admin")
     public String inicio1(){
return "bem vindo admin";
     }
}
