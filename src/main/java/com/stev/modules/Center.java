package com.stev.modules;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Center {

    private final int MAX_PATIENTS;
    private final Patient[] patients;

    private final MedicalCare[] medicalCares;
    private int countPatients;
    static Calendar Hour = Calendar.getInstance();
    public Center(int maxPatients, MedicalCare[] medicalCares) {
        this.medicalCares = medicalCares;
        MAX_PATIENTS = 5;
        patients = new Patient[MAX_PATIENTS];
        countPatients = 0;


        Date date = new Date();
        System.out.println(date);
    }

    public static String dateIn(){
        int hour, minute, second;
        String date;
        hour = Hour.get(Calendar.HOUR_OF_DAY);
        minute = Hour.get(Calendar.MINUTE);
        second = Hour.get(Calendar.SECOND);

        date = String.valueOf( +hour +":"+ minute +":"+ second);

        return date;

    }


}
