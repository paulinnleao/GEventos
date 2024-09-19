package com.paulinnleao.geventos.event.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class RestEventImp implements RestEvent{

    @Override
    @GetMapping
    public ResponseEntity<List<?>> getAllEvents(){
        return null;
    }

    @Override
    @GetMapping("/{idEvent}")
    public ResponseEntity<?> getEventById(@PathVariable(value = "idEvent") Integer idEvent){
        return null;
    }

    @Override
    @PostMapping
    public ResponseEntity<?> createEvent(){
        return null;
    }

    @Override
    @PutMapping("/{idEvent}")
    public ResponseEntity<?> updateEventById(@PathVariable(value = "idEvent") Integer idEvent){
        return null;
    }

    @Override
    @DeleteMapping("{idEvent}")
    public ResponseEntity<?> deleteEventById(@PathVariable(value = "idEvent") Integer idEvent){
        return ResponseEntity.noContent().build();
    }


    // Registers
    @Override
    @PostMapping("/{idEvent}/enroll")
    public ResponseEntity<?> registerAtTheEvent(@PathVariable(value = "idEvent") Integer idEvent){
        return null;
    }

    @Override
    @DeleteMapping("/{idEvent}/enroll")
    public ResponseEntity<?> deleteRegisterById(@PathVariable(value = "idEvent") Integer idEvent){
        return ResponseEntity.noContent().build();
    }
}
