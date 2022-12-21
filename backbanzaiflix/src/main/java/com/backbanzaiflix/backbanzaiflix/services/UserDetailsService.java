package com.backbanzaiflix.backbanzaiflix.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.backbanzaiflix.backbanzaiflix.models.UsuarioModel;
import com.backbanzaiflix.backbanzaiflix.repositorys.UsuarioRepository;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    @Autowired
    private UsuarioRepository ur;

    @Override
    public UserDetails loadUserByUsername(String nome) throws UsernameNotFoundException {
        UsuarioModel usuario = ur.findBynome(nome);
       
        return new User(usuario.getNome(),usuario.getSenha(),usuario.getAuthorities());
    }
    
}
