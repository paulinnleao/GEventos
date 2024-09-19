package com.paulinnleao.geventos.user.repository;

import com.paulinnleao.geventos.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.UUID;

public interface UserRepositry extends JpaRepository<User, UUID> {

    UserDetails findByEmail(String email);
}
