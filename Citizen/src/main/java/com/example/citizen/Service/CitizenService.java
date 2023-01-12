package com.example.citizen.Service;

import com.example.citizen.dto.AddCitizen;
import com.example.citizen.entity.Citizens;
import com.example.citizen.repository.CitizenRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitizenService implements IcitizenService{

    @Autowired
    CitizenRepository citizenRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public String addCitizen(AddCitizen addCitizen) {
        Citizens citizens = modelMapper.map(addCitizen, Citizens.class);
        citizenRepo.save(citizens);
        return "Citizen Added";
    }

    @Override
    public Citizens getCitizensData(int citizenId) {
        Citizens citizens = citizenRepo.findById(citizenId).get();
        return citizens;
    }

    @Override
    public List<Citizens> getCitizensDataByCenterId(int centerID) {
        List<Citizens> citizens = citizenRepo.findAllByCenterId(centerID);
        return citizens;
    }
}
