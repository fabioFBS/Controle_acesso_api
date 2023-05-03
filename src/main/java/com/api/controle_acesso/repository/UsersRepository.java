package com.api.controle_acesso.repository;

import com.api.controle_acesso.model.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<UsersModel, Integer> {

    List<UsersModel> findAll();

    UsersModel findByemail(String email);

    <UsersMod extends UsersModel> UsersMod save(UsersMod entity);

}
