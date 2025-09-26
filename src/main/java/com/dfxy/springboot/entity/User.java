package com.dfxy.springboot.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class User {
    @Id
    private Long id;
    private String username;
}