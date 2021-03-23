package com.lucasdev.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasdev.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
