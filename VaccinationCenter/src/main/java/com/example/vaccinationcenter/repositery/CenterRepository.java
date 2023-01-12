package com.example.vaccinationcenter.repositery;

import com.example.vaccinationcenter.entity.VaccinationCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CenterRepository extends JpaRepository<VaccinationCenter, Integer> {

}
