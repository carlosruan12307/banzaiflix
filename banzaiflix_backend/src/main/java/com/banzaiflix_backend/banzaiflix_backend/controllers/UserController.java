package com.banzaiflix_backend.banzaiflix_backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banzaiflix_backend.banzaiflix_backend.Enums.CategoriaEnum;
import com.banzaiflix_backend.banzaiflix_backend.models.FIlmes.FilmModel;
import com.banzaiflix_backend.banzaiflix_backend.repositorys.FilmRepository;

@RestController
public class UserController {

    @Autowired
    private FilmRepository fr;

    @GetMapping(value = "/login")
    public String inicio() {
        return "bem vindo a api de usuarios";
    }

    @GetMapping(value = "/teste")
    public String teste() {
        return "teste jwt";
    }

    @GetMapping(value = "/brincando")
    public List<FilmModel> brincs() {

        return fr.findAll();
    }

    @GetMapping(value = "/Top10")
    public List<FilmModel> top10() {
        List<FilmModel> a = fr.findAllByCategoria(CategoriaEnum.Top10);
        return a;
    }

    @GetMapping(value = "/EmAlta")
    public List<FilmModel> emAlta() {
        List<FilmModel> a = fr.findAllByCategoria(CategoriaEnum.EmAlta);
        return a;
    }
}
