package com.ktds.rcsp.auth.repository;

import com.ktds.rcsp.auth.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String>{
}
