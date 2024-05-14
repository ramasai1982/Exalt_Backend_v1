package com.producerconsumer.exalt;


import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Pass extends PassIn{

    public Pass(){
        super();
    }

    private String firstName;
    private String lastName;
    private boolean statusVIP;
    private Date dateOfBirth;
    private String dateTimeOfRequest;
    private String dateTimeOfGeneration;

    public Pass(String firstName, String lastName, boolean statusVIP, Date dateOfBirth, String dateTimeOfRequest, String dateTimeOfGeneration) {
        super(firstName, lastName, dateOfBirth, statusVIP);
        this.dateOfBirth = dateOfBirth;
        this.dateTimeOfRequest = dateTimeOfRequest;
        this.dateTimeOfGeneration = dateTimeOfGeneration;
    }

    // Getters & Setters
    public String getDateTimeOfRequest() {
        return dateTimeOfRequest;
    }

    public void setDateTimeOfRequest(String dateTimeOfRequest) {
        this.dateTimeOfRequest = dateTimeOfRequest;
    }

    public String getDateTimeOfGeneration() {
        return dateTimeOfGeneration;
    }

    public void setDateTimeOfGeneration(String dateTimeOfGeneration) {
        this.dateTimeOfGeneration = dateTimeOfGeneration;
    }

    //ToString()
    @Override
    public String toString() {
        return "Pass{" +
                "prenom='" + firstName + '\'' +
                ", nom='" + lastName + '\'' +
                ", statusVIP=" + statusVIP +
                ", dateNaissance=" + dateOfBirth +
                ", dateHeureDeLaDemande=" + dateTimeOfRequest +
                ", dateHeureDeLaGeneration=" + dateTimeOfGeneration +
                '}';
    }

}
