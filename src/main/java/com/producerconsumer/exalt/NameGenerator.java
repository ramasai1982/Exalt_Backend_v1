package com.producerconsumer.exalt;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class NameGenerator {


    public NameGenerator() {
    }

    public String nameGenerator(){
        Random random = new Random();

        Random randomNumber = new Random();

        int length = randomNumber.nextInt(4, 7);

        String character = "abcdefghijklmnopqrstuvwxyz";

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < length ; i++) {
            sb.append(character.charAt(random.nextInt(character.length())));

            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        }

        return sb.toString();
    }

}
