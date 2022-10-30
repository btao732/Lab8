package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void hasCityTest(){
        list = MockCityList();
        City estevan = new City("Estevan", "SK");
        list.addCity(estevan);
        assertEquals(Boolean.TRUE, list.hasCity(estevan));

        City redDeer = new City("Red Deer", "AB");
        assertEquals(Boolean.FALSE, list.hasCity(redDeer));

    }

    @Test
    public void deleteCityTest() {
        list = MockCityList();
        City estevan = new City("Estevan", "SK");
        list.addCity(estevan);
        assertEquals(Boolean.TRUE, list.hasCity(estevan));

        list.deleteCity(estevan);
        assertEquals(Boolean.FALSE, list.hasCity(estevan));

    }

    @Test
    public void countCityTest() {
        list = MockCityList();
        assertEquals(6, list.countCity());

        City estevan = new City("Estevan", "SK");
        list.addCity(estevan);
        assertEquals(7, list.countCity());
    }





}
