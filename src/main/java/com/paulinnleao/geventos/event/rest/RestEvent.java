package com.paulinnleao.geventos.event.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public interface RestEvent {
    @GetMapping
    ResponseEntity<List<?>> getAllEvents();

    @GetMapping(value = "/{idEvent}")
    ResponseEntity<?> getEventById(@PathVariable(value = "idEvent") Integer idEvent);

    @PostMapping
    ResponseEntity<?> createEvent();

    @PutMapping(value = "/{idEvent}")
    ResponseEntity<?> updateEventById(@PathVariable(value = "idEvent")Integer idEvent);

    @DeleteMapping(value = "{idEvent}")
    ResponseEntity<?> deleteEventById(@PathVariable(value = "idEvent") Integer idEvent);


    // Registers
    @PostMapping(value = "/{idEvent}/enroll")
    ResponseEntity<?> registerAtTheEvent(@PathVariable(value = "idEvent") Integer idEvent);

    @DeleteMapping(value = "/{idEvent}/enroll")
    ResponseEntity<?> deleteRegisterById(@PathVariable(value = "idEvent") Integer idEvent);

}
