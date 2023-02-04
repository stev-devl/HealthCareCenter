package com.stev.modules;

public class MedicalCare {
    public enum reason{

    }
    Patient patient;
    int dateIn;
    float [] vitalSigns;
    private int dateDischarge;
    private String reasonDischarge;

    public Patient getPatient(int SIP) {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getDateIn() {
        return dateIn;
    }

    public void setDateIn(int dateIn) {
        this.dateIn = dateIn;
    }

    public float[] getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(float[] vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public int getDateDischarge() {
        return dateDischarge;
    }

    public void setDateDischarge(int dateDischarge) {
        this.dateDischarge = dateDischarge;
    }

    public String getReasonDischarge() {
        return reasonDischarge;
    }

    public void setReasonDischarge(String reasonDischarge) {
        this.reasonDischarge = reasonDischarge;
    }
}
