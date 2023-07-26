package com.devjeff.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjeff.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
