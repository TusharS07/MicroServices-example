package com.example.citizen.Service;

import com.example.citizen.dto.AddCitizen;
import com.example.citizen.entity.Citizens;

import java.util.List;

public interface IcitizenService {
    String addCitizen(AddCitizen addCitizen);
    Citizens getCitizensData(int citizenId);
    List<Citizens> getCitizensDataByCenterId(int centerID);

}
