package com.github.bruce_mig.spring_reactive_web.student;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    Mono<Student> save(@RequestBody Student student) {
        return service.save(student);
    }

    @GetMapping
    Flux<Student> findAll() {
        return service.findAll();
    }

    @GetMapping(path = "/stream",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    Flux<Student> findAllStream() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Student> findById(@PathVariable("id") Integer id) {
        return service.findById(id);
    }
}
