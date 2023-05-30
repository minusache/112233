package com.wad.springdata.repositories;


import com.wad.springdata.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
