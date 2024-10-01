package com.students.ms.studentsManagmentSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

@Data
@Entity
public class student {
    @Id
    @GeneratedValue
    private  Long id;
    private String firstName;
    private String lastname;
    private String  gender;
    private Address Address;
}
