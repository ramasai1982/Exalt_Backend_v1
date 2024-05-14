package com.producerconsumer.exalt;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class SinglePassGenerator {

    @Bean
    public Pass generatePass(PassIn passIn){

    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date dateTimeNow = new Date();

        //private List<Pass> passList;
        System.out.println(passIn.getFirstName());

        return new Pass(passIn.getFirstName(), passIn.getLastName(), passIn.isStatusVIP(), passIn.getDateOfBirth(), dateFormat.format(dateTimeNow), dateFormat.format(dateTimeNow));
}


}
