package com.paulinnleao.geventos.user.rest;

import com.paulinnleao.geventos.user.UserRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public interface RestUser {
    @GetMapping
    ResponseEntity<List<?>> getAllUsers();

    @GetMapping(value = "/{idUser}")
    ResponseEntity<?> getUserById(@PathVariable(value = "idUser") Integer idUser);

    @PutMapping(value = "/{idUser}")
    ResponseEntity<?> updateUserById(@PathVariable(value = "idUser") Integer idUser,
                                            @RequestBody UserRequestDTO userRequestDTO
                                            );
    @DeleteMapping(value = "/{idUser}")
    ResponseEntity<?> deleteUserById(@PathVariable(value = "idUser") Integer idUser);
}
