package com.example.vaccinationcenter.controller;

import com.example.vaccinationcenter.model.CitizenModel;
import com.example.vaccinationcenter.service.IcenterService;
import com.example.vaccinationcenter.dto.AddCenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Center")
public class VaccinCenterController {

    @Autowired
    IcenterService icenterService;

    @PostMapping("/Add_Center")
    public ResponseEntity<String> addCenter(@RequestBody AddCenter addCenter) {
        icenterService.addCenter(addCenter);
        return new ResponseEntity<>("Center Added", HttpStatus.OK);
    }

    @GetMapping("/GetAllCitizensFromCenter")
    public ResponseEntity<List> GetAllCitizensFromCenter(@RequestParam int centerId) {
        List<CitizenModel> citizens = icenterService.getAllCitizensDataByCenterID(centerId);
        return new ResponseEntity<>(citizens, HttpStatus.OK);
    }
}
