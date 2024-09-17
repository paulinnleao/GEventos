package com.paulinnleao.geventos.user.rest;

import com.paulinnleao.geventos.user.UserRequestDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class RestUserImp implements RestUser{
    @Override
    public ResponseEntity<List<?>> getAllUsers(){
        return null;
    }

    @Override
    public ResponseEntity<?> getUserById(Integer idUser){
        return null;
    }

    @Override
    public ResponseEntity<?> updateUserById(Integer idUser, UserRequestDTO userRequestDTO
    ){
        return null;
    }
    @Override
    public ResponseEntity<?> deleteUserById(Integer idUser){
        return ResponseEntity.noContent().build();
    }
}
