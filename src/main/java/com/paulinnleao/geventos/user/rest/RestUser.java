package com.paulinnleao.geventos.user.rest;

import com.paulinnleao.geventos.user.UserReciveDTO;
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

    @GetMapping(name = "/{idUser}")
    public ResponseEntity<?> getUserById(@PathVariable(name = "idUser") Integer idUser){
        return null;
    }

    @PutMapping(name = "/{idUser}")
    public ResponseEntity<?> updateUserById(@PathVariable(name = "idUser") Integer idUser,
                                            @RequestBody UserReciveDTO userReciveDTO
                                            ){
        return null;
    }
    @DeleteMapping(name = "/{idUser}")
    public ResponseEntity<?> deleteUserById(@PathVariable(name = "idUser") Integer idUser){
        return ResponseEntity.noContent().build();
    }
}
