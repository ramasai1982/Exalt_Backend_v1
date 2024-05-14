package com.producerconsumer.exalt;

import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Component
public class BatchPassGenerator{


    private final List<Pass> batch = new ArrayList<>();

    private final NameGenerator nameGenerator= new NameGenerator();

    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date dateTimeNow;
    Date dateOFBirth;

    // Generates pass in batch with the required inPut of number of passes
    // date of birth, date & time of generation, date & time of request are taken as current date and time
    public List<Pass> generatePassBatch(int numberOfPasses) {
        boolean statusVIP = new Random().nextBoolean();

        for(int i = 1; i<=numberOfPasses; i++){
            if(i==1){
                batch.clear();
            }
            dateTimeNow = new Date();
            dateOFBirth = new Date();
            Pass pass = new Pass(nameGenerator.nameGenerator(), nameGenerator.nameGenerator(), statusVIP, dateOFBirth, dateFormat.format(dateTimeNow), dateFormat.format(dateTimeNow));
            batch.add(pass);
        }
        return batch;
    }


    // Generates pass in batch with required inPut list of passes with minimum required fields
    // required -> first name, last name, vip status & date of birth
    public List<Pass> generatePassBatch(List<PassIn> passInList) {

        List<PassIn> passListToBeGenerated;
        List<PassIn> passListNoVIPToBeGenerated;

        Predicate<PassIn> isNotVIP = passIn1 -> !passIn1.isStatusVIP();
        Predicate<PassIn> isVIP = PassIn::isStatusVIP;

        passListToBeGenerated = passInList.stream()
                .filter(isVIP)
                .collect(Collectors.toList());

        passListNoVIPToBeGenerated = passInList.stream()
                .filter(isNotVIP)
                .toList();

        passListToBeGenerated.addAll(passListNoVIPToBeGenerated);

        dateTimeNow = new Date();


        //generate all passes
        for(PassIn passIn2 : passListToBeGenerated){
            Pass pass = new Pass(passIn2.getFirstName(), passIn2.getLastName(), passIn2.isStatusVIP(), passIn2.getDateOfBirth(), dateFormat.format(dateTimeNow), dateFormat.format(dateTimeNow));
            batch.add(pass);
        }
        return batch;
    }


}
