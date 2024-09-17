package com.paulinnleao.geventos.user.rest;

import com.paulinnleao.geventos.user.UserRequestDTO;
import org.springframework.http.ResponseEntity;

public class RestAuthenticationImp implements RestAuthentication{
    @Override
    public ResponseEntity<?> register(UserRequestDTO userRequestDTO){
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<?> login(UserRequestDTO userRequestDTO){
        return ResponseEntity.ok().build();
    }
}
