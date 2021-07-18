package com.example.aop.service;

import com.example.aop.data.Addsress;
import com.example.aop.data.Person;
import org.junit.Test;

class PersonCheckTest {

    private PersonCheck personCheck;

    @Test
    public void validPersonCheck(){
        Person person = new Person("Susi", 18, new Addsress("Weg 42", "Straubing", "94315"));
        personCheck.isPersonAllowedToDrinkBeer(person);
        
    }

}