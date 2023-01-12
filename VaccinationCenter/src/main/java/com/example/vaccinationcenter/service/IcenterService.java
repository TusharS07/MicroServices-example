package com.example.vaccinationcenter.service;

import com.example.vaccinationcenter.dto.AddCenter;
import com.example.vaccinationcenter.entity.VaccinationCenter;
import com.example.vaccinationcenter.model.CitizenModel;

import java.util.List;

public interface IcenterService {
    String addCenter(AddCenter addCenter);
    VaccinationCenter getCenterData(int id);

    List<CitizenModel> getAllCitizensDataByCenterID(int centerId);
    
}
