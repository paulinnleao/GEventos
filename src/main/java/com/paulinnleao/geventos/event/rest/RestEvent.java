package com.paulinnleao.geventos.event.rest;

import com.paulinnleao.geventos.enrollment.Enrollment;
import com.paulinnleao.geventos.event.Event;
import com.paulinnleao.geventos.user.UserRequestDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
@Tag(name = "Events", description = "Endpoints to manage events")
public interface RestEvent {
    @GetMapping
    @Operation(
            summary = "Get all events",
            description = "Get all events if exits pageable",
            tags = {"Events"},
            responses = {
                    @ApiResponse(description = "Success", responseCode = "200",
                            content = @Content(schema = @Schema(implementation = Event.class))),
                    @ApiResponse(description = "Bad Request", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Unauthorized", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Not Found", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Internal Error", responseCode = "500", content = @Content)
            })
    ResponseEntity<List<?>> getAllEvents();

    @GetMapping(value = "/{idEvent}")
    @Operation(
            summary = "Get an event",
            description = "Get an event if exits with UUID",
            tags = {"Events"},
            responses = {
                    @ApiResponse(description = "Success", responseCode = "200",
                            content = @Content(schema = @Schema(implementation = Event.class))),
                    @ApiResponse(description = "Bad Request", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Unauthorized", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Not Found", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Internal Error", responseCode = "500", content = @Content)
            })
    ResponseEntity<?> getEventById(@PathVariable(value = "idEvent") Integer idEvent);

    @PostMapping
    @Operation(
            summary = "Create an event",
            description = "Create an event if not exist",
            tags = {"Events"},
            responses = {
                    @ApiResponse(description = "Success", responseCode = "200",
                            content = @Content(schema = @Schema(implementation = Event.class))),
                    @ApiResponse(description = "Bad Request", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Unauthorized", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Not Found", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Internal Error", responseCode = "500", content = @Content)
            })
    ResponseEntity<?> createEvent();

    @PutMapping(value = "/{idEvent}")
    @Operation(
            summary = "Update an event",
            description = "Get an event with UUID and if exist, update with body data",
            tags = {"Events"},
            responses = {
                    @ApiResponse(description = "Success", responseCode = "200",
                            content = @Content(schema = @Schema(implementation = Event.class))),
                    @ApiResponse(description = "Bad Request", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Unauthorized", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Not Found", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Internal Error", responseCode = "500", content = @Content)
            })
    ResponseEntity<?> updateEventById(@PathVariable(value = "idEvent")Integer idEvent);

    @DeleteMapping(value = "{idEvent}")
    @Operation(
            summary = "Delete an event",
            description = "Get an event with UUID and if exit, delete it",
            tags = {"Events"},
            responses = {
                    @ApiResponse(description = "Success", responseCode = "200",
                            content = @Content(schema = @Schema(implementation = Event.class))),
                    @ApiResponse(description = "Bad Request", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Unauthorized", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Not Found", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Internal Error", responseCode = "500", content = @Content)
            })
    ResponseEntity<?> deleteEventById(@PathVariable(value = "idEvent") Integer idEvent);


    // Registers
    @PostMapping(value = "/{idEvent}/enroll")
    @Operation(
            summary = "Register an enroll",
            description = "Get an enroll with UUID of event, and if exist the event, register an enroll if not exist.",
            tags = {"Events"},
            responses = {
                    @ApiResponse(description = "Success", responseCode = "200",
                            content = @Content(schema = @Schema(implementation = Enrollment.class))),
                    @ApiResponse(description = "Bad Request", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Unauthorized", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Not Found", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Internal Error", responseCode = "500", content = @Content)
            })
    ResponseEntity<?> registerAtTheEvent(@PathVariable(value = "idEvent") Integer idEvent);

    @DeleteMapping(value = "/{idEvent}/enroll")
    @Operation(
            summary = "Delete an enroll",
            description = "Get an enroll, if exits, delete with UUID",
            tags = {"Events"},
            responses = {
                    @ApiResponse(description = "Success", responseCode = "200",
                            content = @Content(schema = @Schema(implementation = Enrollment.class))),
                    @ApiResponse(description = "Bad Request", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Unauthorized", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Not Found", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Internal Error", responseCode = "500", content = @Content)
            })
    ResponseEntity<?> deleteRegisterById(@PathVariable(value = "idEvent") Integer idEvent);

}
