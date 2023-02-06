package com.banzaiflix_backend.banzaiflix_backend.run;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.banzaiflix_backend.banzaiflix_backend.Enums.CategoriaEnum;
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
            FilmModel filmModel = new FilmModel("/images/BlackMirror.png", "BlackMirror", "blabla",
                    CategoriaEnum.EmAlta);
            FilmModel filmModel1 = new FilmModel("/images/LaCasaDePapel.png", "LaCasaDePapel", "buuu",
                    CategoriaEnum.EmAlta);
            FilmModel filmModel2 = new FilmModel("/images/Narcos.png", "Narcos", "buuu", CategoriaEnum.EmAlta);
            FilmModel filmModel3 = new FilmModel("/images/StrangerThings.png", "StrangerThings", "buuu",
                    CategoriaEnum.EmAlta);
            FilmModel filmModel4 = new FilmModel("/images/TheCrown.png", "TheCrown", "buuu", CategoriaEnum.EmAlta);
            FilmModel filmModel5 = new FilmModel("/images/TheWitcher.png", "TheWitcher", "buuu", CategoriaEnum.EmAlta);

            FilmModel filmModel6 = new FilmModel("/images/Dark.png", "Dark", "buuu", CategoriaEnum.Top10);
            FilmModel filmModel7 = new FilmModel("/images/Elite.png", "Elite", "buuu", CategoriaEnum.Top10);
            FilmModel filmModel8 = new FilmModel("/images/Lucifer.png", "Lucifer", "buuu", CategoriaEnum.Top10);
            FilmModel filmModel9 = new FilmModel("/images/Lupin.png", "Lupin", "buuu", CategoriaEnum.Top10);
            FilmModel filmModel10 = new FilmModel("/images/Sabrina.png", "Sabrina", "buuu", CategoriaEnum.Top10);
            FilmModel filmModel11 = new FilmModel("/images/TheWalkingDead.png", "TheWalkingDead", "buuu",
                    CategoriaEnum.Top10);

            if (rr.findByname(ro).isEmpty()) {
                RoleModel role = new RoleModel(ro);
                rr.save(role);
                if (ro == RoleEnum.ROLE_ADMIN) {
                    fr.save(filmModel);
                    fr.save(filmModel1);
                    fr.save(filmModel2);
                    fr.save(filmModel3);
                    fr.save(filmModel4);
                    fr.save(filmModel5);

                    fr.save(filmModel6);
                    fr.save(filmModel7);
                    fr.save(filmModel8);
                    fr.save(filmModel9);
                    fr.save(filmModel10);
                    fr.save(filmModel11);
                    UserModel usuario = new UserModel("joao", passwordEncoder.encode("123"));
                    usuario.addfilm(filmModel);
                    usuario.addRole(role);
                    ur.save(usuario);

                }
            }

        }

    }

}
