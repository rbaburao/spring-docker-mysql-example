package com.docker.image.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docker.image.example.model.Users;


public interface UserRepository extends JpaRepository <Users, Integer> {
}
