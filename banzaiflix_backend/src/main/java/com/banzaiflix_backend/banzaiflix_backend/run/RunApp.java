package com.banzaiflix_backend.banzaiflix_backend.run;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.banzaiflix_backend.banzaiflix_backend.Enums.RoleEnum;
import com.banzaiflix_backend.banzaiflix_backend.models.FIlmes.FilmModel;
import com.banzaiflix_backend.banzaiflix_backend.models.Usuarios.RoleModel;
import com.banzaiflix_backend.banzaiflix_backend.models.Usuarios.UserModel;
import com.banzaiflix_backend.banzaiflix_backend.repositorys.FilmRepository;
import com.banzaiflix_backend.banzaiflix_backend.repositorys.RoleRepository;
import com.banzaiflix_backend.banzaiflix_backend.repositorys.UserRepository;

@Component
public class RunApp implements ApplicationRunner {
    @Autowired
    private RoleRepository rr;
    @Autowired
    private UserRepository ur;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private FilmRepository fr;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        for (RoleEnum ro : RoleEnum.values()) {
            FilmModel filmModel = new FilmModel("/images/download.png", "avatar", "blabla");
            FilmModel filmModel1 = new FilmModel("/images/download1.png", "dragao", "buuu");

            if (rr.findByname(ro).isEmpty()) {
                RoleModel role = new RoleModel(ro);
                rr.save(role);
                if (ro == RoleEnum.ROLE_ADMIN) {
                    fr.save(filmModel);
                    fr.save(filmModel1);
                    UserModel usuario = new UserModel("joao", passwordEncoder.encode("123"));
                    usuario.addfilm(filmModel);
                    usuario.addRole(role);
                    ur.save(usuario);

                }
            }

        }

    }

}
