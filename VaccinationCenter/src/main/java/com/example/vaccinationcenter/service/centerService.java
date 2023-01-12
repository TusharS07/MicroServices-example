package com.example.vaccinationcenter.service;

import com.example.vaccinationcenter.dto.AddCenter;
import com.example.vaccinationcenter.entity.VaccinationCenter;
import com.example.vaccinationcenter.model.CitizenModel;
import com.example.vaccinationcenter.repositery.CenterRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class centerService implements IcenterService {

    @Autowired
    CenterRepository centerRepo;

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    RestTemplate rest;

    @Override
    public String addCenter(AddCenter addCenter) {
        VaccinationCenter vaccinationCenter = modelMapper.map(addCenter, VaccinationCenter.class);
        centerRepo.save(vaccinationCenter);
        return "Center Added";
    }

    @Override
    public VaccinationCenter getCenterData(int id) {
        return null;
    }

    @Override
    public List<CitizenModel> getAllCitizensDataByCenterID(int centerId) {
        List<CitizenModel> citizen  = rest.getForObject("http://localhost:8089/Citizens/GetCitizens_Data_ByCenter?centerId="+centerId, List.class );
        return citizen;
    }
}
