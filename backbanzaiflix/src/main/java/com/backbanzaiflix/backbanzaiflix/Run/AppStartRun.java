package com.backbanzaiflix.backbanzaiflix.Run;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.backbanzaiflix.backbanzaiflix.enums.RoleEnum;
import com.backbanzaiflix.backbanzaiflix.models.RoleModel;
import com.backbanzaiflix.backbanzaiflix.models.UsuarioModel;
import com.backbanzaiflix.backbanzaiflix.repositorys.RoleRepository;
import com.backbanzaiflix.backbanzaiflix.repositorys.UsuarioRepository;



@Component
public class AppStartRun implements ApplicationRunner {
    
    @Autowired
    private RoleRepository rr;
    @Autowired
    private UsuarioRepository ur;
    
    @Override
    public void run(ApplicationArguments args) throws Exception {
        for(RoleEnum ro: RoleEnum.values()){
            if(rr.findBynome(ro).isEmpty()){
                RoleModel rom = new RoleModel(ro);
                rr.save(rom);
                if(ro == RoleEnum.ROLE_ADMIN){
                    String senha = new BCryptPasswordEncoder().encode("123");
                    UsuarioModel usuario = new UsuarioModel("carlos",senha,"carlosruan@gmail.com");
                    List<RoleModel> roles = new ArrayList<RoleModel>();
                    roles.add(rom);
                    usuario.insertRoles(roles);
                  
                        ur.save(usuario);
                }
            }
        
    }

}
}
