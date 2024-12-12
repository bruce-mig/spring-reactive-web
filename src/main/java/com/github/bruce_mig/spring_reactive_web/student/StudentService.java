package com.github.bruce_mig.spring_reactive_web.student;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Mono<Student> save(Student student) {
        return repository.save(student);
    }

    public Flux<Student> findAll() {
        return repository.findAll()
//                .delayElements(Duration.ofSeconds(1))
                ;
    }

    public Mono<Student> findById(Integer id) {
        return repository.findById(id);
    }
}
