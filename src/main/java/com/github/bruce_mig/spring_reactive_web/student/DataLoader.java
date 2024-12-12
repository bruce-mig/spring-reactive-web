package com.github.bruce_mig.spring_reactive_web.student;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final StudentRepository repository;

    public DataLoader(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 10; i++) {
            Student student = new Student(null, "Student" + i, "LastName" + i, i);
            repository.save(student).subscribe();
        }
    }
}
