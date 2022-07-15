package com.springboot.security.demo.repository;

import com.springboot.security.demo.models.ERole;
import com.springboot.security.demo.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(ERole name);

}
