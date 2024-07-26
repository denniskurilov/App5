package com.denniskurilov.app5;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Employee, Long> {
}