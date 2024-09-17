package com.paulinnleao.geventos.event.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class RestEvent {
    @GetMapping
    public ResponseEntity<List<?>> getAllEvents(){
        return null;
    }

    @GetMapping(value = "/{idEvent}")
    public ResponseEntity<?> getEventById(@PathVariable(value = "idEvent") Integer idEvent){
        return null;
    }

    @PostMapping
    public ResponseEntity<?> createEvent(){
        return null;
    }

    @PutMapping(value = "/{idEvent}")
    public ResponseEntity<?> updateEventById(@PathVariable(value = "idEvent")Integer idEvent){
        return null;
    }

    @DeleteMapping(value = "{idEvent}")
    public ResponseEntity<?> deleteEventById(@PathVariable(value = "idEvent") Integer idEvent){
        return ResponseEntity.noContent().build();
    }


    // Registers
    @PostMapping(value = "/{idEvent}/enroll")
    public ResponseEntity<?> registerAtTheEvent(@PathVariable(value = "idEvent") Integer idEvent){
        return null;
    }

    @DeleteMapping(value = "/{idEvent}/enroll")
    public ResponseEntity<?> deleteRegisterById(@PathVariable(value = "idEvent") Integer idEvent){
        return ResponseEntity.noContent().build();
    }

}
