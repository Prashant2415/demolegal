package com.portal.legalportal.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.portal.legalportal.model.Login;
@Repository
public interface LoginRepository extends JpaRepository<Login,String>{

}
