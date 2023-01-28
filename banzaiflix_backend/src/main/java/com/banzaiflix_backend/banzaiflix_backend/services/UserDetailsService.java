package com.banzaiflix_backend.banzaiflix_backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import com.banzaiflix_backend.banzaiflix_backend.models.Usuarios.UserModel;
import com.banzaiflix_backend.banzaiflix_backend.repositorys.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    @Autowired
    private UserRepository ur;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel userModel = ur.findByusername(username).orElseThrow(() -> new UsernameNotFoundException("usuario" + username + "nao encontrado"));
        return new User(userModel.getUsername(), userModel.getPassword(), true, true, true, true, userModel.getAuthorities());  //setei os boolean para true ja que nao vou usar nessa aplicaçao
    }
    
}
