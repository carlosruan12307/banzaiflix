package com.backbanzaiflix.backbanzaiflix.Security;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {

    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http
                .httpBasic()
                .and()
                .authorizeHttpRequests()
                // .requestMatchers(HttpMethod.GET,"/").hasAnyRole("USER")
                .requestMatchers(HttpMethod.GET,"/").permitAll()
                .requestMatchers(HttpMethod.GET,"/admin").hasRole("ADMIN")
                //  .requestMatchers(HttpMethod.POST,"/cadastrarUsuario").permitAll()
                //  .requestMatchers(HttpMethod.POST,"/cadastrarAdmin").permitAll()
                //  .requestMatchers(HttpMethod.POST,"/cadastrarRole").permitAll()
                // .requestMatchers(HttpMethod.POST,"/cadastrarRole").permitAll()
                // .requestMatchers(HttpMethod.GET,"/cadastrarUsuario").hasRole("USER");
                .anyRequest().authenticated()
                .and()
                .csrf().disable();
                return http.build();


    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
}