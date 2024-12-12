package com.github.bruce_mig.spring_reactive_web.student;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@Builder
@Table(name = "students")
public class Student {

    @Id
    private Integer id;
    @Column("firstname")
    private String firstName;
    @Column("lastname")
    private String lastName;
    private int age;

    public Student(Integer id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
