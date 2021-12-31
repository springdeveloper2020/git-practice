package com.manikit.git.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manikit.git.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
