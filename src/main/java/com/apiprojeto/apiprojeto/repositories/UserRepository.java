package com.apiprojeto.apiprojeto.repositories;

import com.apiprojeto.apiprojeto.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
