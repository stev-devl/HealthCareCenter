package com.stev.modules;

import java.util.Arrays;

public class MedicalCare {
    public enum reason{

        ALTA, ATTEND, HAS_BEEN_ATTENDED,

    }
    Patient patient;
    String dateIn;
    float [] vitalSigns;
    private int dateDischarge;
    private String reasonDischarge;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }



    public String setDateIn(String dateIn) {



        return dateIn;
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

    @Override
    public String toString() {
        return "MedicalCare{" +
                //"patient=" + patient +
                ", dateIn=" + setDateIn(String.valueOf(Center.currentTime(patient)) )+
                //", vitalSigns=" + Arrays.toString(vitalSigns) +
                //", dateDischarge=" + dateDischarge +
                //", reasonDischarge='" + reasonDischarge + '\'' +
                '}';
    }
}
