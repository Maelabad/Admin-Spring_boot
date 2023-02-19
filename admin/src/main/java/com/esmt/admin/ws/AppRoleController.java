package com.esmt.admin.ws;

import com.esmt.admin.dao.AppRoleRepository;
import com.esmt.admin.entities.AppRoleEntity;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/admin")
@AllArgsConstructor
public class AppRoleController {

    private AppRoleRepository appRoleRepository;

    @PostMapping(path = "/save")
    public AppRoleEntity save(@RequestBody AppRoleEntity appRoleEntity){
        return appRoleRepository.save(appRoleEntity);
    }

    @GetMapping(path = "/all")
    public List<AppRoleEntity> getAll(){
        return appRoleRepository.findAll();
    }

}
