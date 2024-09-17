package com.paulinnleao.geventos.user.rest;

import com.paulinnleao.geventos.user.UserRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class RestUser {
    @GetMapping
    public ResponseEntity<List<?>> getAllUsers(){
        return null;
    }

    @GetMapping(value = "/{idUser}")
    public ResponseEntity<?> getUserById(@PathVariable(value = "idUser") Integer idUser){
        return null;
    }

    @PutMapping(value = "/{idUser}")
    public ResponseEntity<?> updateUserById(@PathVariable(value = "idUser") Integer idUser,
                                            @RequestBody UserRequestDTO userRequestDTO
                                            ){
        return null;
    }
    @DeleteMapping(value = "/{idUser}")
    public ResponseEntity<?> deleteUserById(@PathVariable(value = "idUser") Integer idUser){
        return ResponseEntity.noContent().build();
    }
}
