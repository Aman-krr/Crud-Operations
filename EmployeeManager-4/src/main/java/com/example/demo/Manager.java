package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Manager extends JpaRepository<Employee, Integer> {

}
