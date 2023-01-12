package com.example.citizen.controller;

import com.example.citizen.Service.IcitizenService;
import com.example.citizen.dto.AddCitizen;
import com.example.citizen.entity.Citizens;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Citizens")
public class CitizenController {
    @Autowired
    IcitizenService icitizenService;


    @PostMapping("/Add_Citizens")
    public ResponseEntity<String> addCitizens(@RequestBody AddCitizen addCitizen) {
        icitizenService.addCitizen(addCitizen);
        return new ResponseEntity<>("Citizen Added", HttpStatus.OK);
    }

    @GetMapping("/GetCitizen Data")
    public ResponseEntity<Citizens> getCitizenData(@RequestParam int id) {
        Citizens citizens = icitizenService.getCitizensData(id);
        return new ResponseEntity<>(citizens, HttpStatus.OK);
    }

    @GetMapping("/GetCitizens_Data_ByCenter")
    public ResponseEntity<List> getAllCitiZensDataByCenter(@RequestParam int centerId) {
        List<Citizens> citizens = icitizenService.getCitizensDataByCenterId(centerId);
        return new ResponseEntity<>(citizens, HttpStatus.OK);
    }
}
