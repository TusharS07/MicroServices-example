package com.example.citizen.repository;

import com.example.citizen.entity.Citizens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CitizenRepository extends JpaRepository<Citizens, Integer> {

    List<Citizens> findAllByCenterId(int centerID);
}
