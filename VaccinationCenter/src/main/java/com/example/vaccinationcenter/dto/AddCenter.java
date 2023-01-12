package com.example.vaccinationcenter.dto;

public class AddCenter {
    private int centerId;
    private String centerName;

    public int getId() {
        return centerId;
    }

    public void setId(int centerId) {
        this.centerId = centerId;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }
}
