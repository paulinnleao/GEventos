package com.paulinnleao.geventos.user.rest;

import com.paulinnleao.geventos.user.UserRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public interface RestUser {
    @GetMapping
    public ResponseEntity<List<?>> getAllUsers();

    @GetMapping(value = "/{idUser}")
    public ResponseEntity<?> getUserById(@PathVariable(value = "idUser") Integer idUser);

    @PutMapping(value = "/{idUser}")
    public ResponseEntity<?> updateUserById(@PathVariable(value = "idUser") Integer idUser,
                                            @RequestBody UserRequestDTO userRequestDTO
                                            );
    @DeleteMapping(value = "/{idUser}")
    public ResponseEntity<?> deleteUserById(@PathVariable(value = "idUser") Integer idUser);
}
