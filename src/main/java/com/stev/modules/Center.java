package com.stev.modules;

import java.util.Calendar;
import java.util.Date;

public class Center {

    private final int MAX_PATIENTS;
    private final Patient[] patients;

    private final MedicalCare[] medicalCares;
    private int countPatients;
    static Calendar Hour = Calendar.getInstance();
    public Center(int maxPatients, int MAX_PATIENTS, MedicalCare[] medicalCares) {
        this.MAX_PATIENTS = maxPatients;
        this.medicalCares = medicalCares;

        patients = new Patient[MAX_PATIENTS];
        countPatients = 0;


        Date date = new Date();
        System.out.println(date);
    }

    public static String currentTime(Patient patient){
        int hour, minute, second;
        String date;
        hour = Hour.get(Calendar.HOUR_OF_DAY);
        minute = Hour.get(Calendar.MINUTE);
        second = Hour.get(Calendar.SECOND);

        date = String.valueOf( +hour +":"+ minute +":"+ second);

        return date;

    }

    public Patient[] getPatients() {
        return patients;
    }

    public int addPatient(int sip){

        for(int i= 0; i<= patients.length; i++){
            countPatients++;
            if(patients[i].getSIP() == sip){
                return i;
            }
        }return -1;

    }


    public int listPatients(){
        for (int i=0; i<= patients.length; i++){
            countPatients++;
            Patient patient = patients[countPatients];
        }
    }
}
