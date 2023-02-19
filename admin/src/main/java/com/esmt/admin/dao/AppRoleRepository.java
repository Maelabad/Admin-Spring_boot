package com.esmt.admin.dao;

import com.esmt.admin.entities.AppRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRoleRepository extends JpaRepository<AppRoleEntity , Integer> {

    AppRoleEntity findById(int id);

}
