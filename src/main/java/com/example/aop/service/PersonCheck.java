package com.example.aop.service;

import com.example.aop.data.Person;

import java.util.Arrays;
import java.util.List;

public class PersonCheck {

    private static final int AGE_ALLOWED_BEER_DRINKING = 16;
    private static final List<String> LIST_CITY_FESTIVALS = Arrays.asList("Straubing", "Munich");

    public boolean isPersonAllowedToDrinkBeer(Person person){
        return person.getAge() >= AGE_ALLOWED_BEER_DRINKING || LIST_CITY_FESTIVALS.contains(LIST_CITY_FESTIVALS);
    }
}
