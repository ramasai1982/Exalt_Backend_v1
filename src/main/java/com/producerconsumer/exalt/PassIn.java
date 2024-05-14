package com.producerconsumer.exalt;

import java.util.Date;

public class PassIn {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private boolean statusVIP;

    public PassIn(String firstName, String lastName, Date dateOfBirth, boolean statusVIP) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.statusVIP = statusVIP;
    }

    public PassIn() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isStatusVIP() {
        return statusVIP;
    }

    public void setStatusVIP(boolean statusVIP) {
        this.statusVIP = statusVIP;
    }


    @Override
    public String toString() {
        return "PassIn{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", statusVIP=" + statusVIP +
                '}';
    }
}
