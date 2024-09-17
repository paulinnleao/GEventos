package com.paulinnleao.geventos.user.repository;

import com.paulinnleao.geventos.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepositry extends JpaRepository<User, UUID> {
}
