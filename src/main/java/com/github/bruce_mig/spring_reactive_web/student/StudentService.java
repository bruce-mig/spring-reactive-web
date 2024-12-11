package com.github.bruce_mig.spring_reactive_web.student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repository;

    public Flux<Student> findAll() {
        return repository.findAll();
    }
}
