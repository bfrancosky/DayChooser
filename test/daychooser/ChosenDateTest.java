/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daychooser;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Brian
 */
public class ChosenDateTest {
    
    ChosenDate mytest;
    
    public ChosenDateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {

    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println("Before method");
        mytest = new ChosenDate();
    }
    
    @After
    public void tearDown() {
        System.out.println("After method");
        mytest = null;
    }

    /**
     * Test of showNextDay method, of class ChosenDate.
     */
    @Test
    public void testShowNextDay() {
        System.out.println("showNextDay");
        ChosenDate instance = new ChosenDate();
        Integer expResult = 7;
        Integer result = instance.showNextDay();
        assertEquals(expResult, result);
    }

    /**
     * Test of showCurrentDay method, of class ChosenDate.
     */
    @Test
    public void testShowCurrentDay() {
        System.out.println("showCurrentDay");
        ChosenDate instance = new ChosenDate();
        Integer expResult = 6;
        Integer result = instance.showCurrentDay();
        assertEquals(expResult, result);
    }

    /**
     * Test of showPrevDay method, of class ChosenDate.
     */
    @Test
    public void testShowPrevDay() {
        System.out.println("showPrevDay");
        ChosenDate instance = new ChosenDate();
        Integer expResult = 5;
        Integer result = instance.showPrevDay();
        assertEquals(expResult, result);
    }

    /**
     * Test of showDayOfWeek method, of class ChosenDate.
     */
    @Test
    public void testShowDayOfWeek() {
        System.out.println("showDayOfWeek");
        ChosenDate instance = new ChosenDate();
        DayOfWeek expResult = DayOfWeek.THURSDAY;
        DayOfWeek result = instance.showDayOfWeek();
        assertEquals(expResult, result);
    }

    /**
     * Test of showShoppingDays method, of class ChosenDate.
     */
    @Test
    public void testShowShoppingDays() {
        System.out.println("showShoppingDays");
        ChosenDate instance = new ChosenDate();
        Integer expResult = 16;
        Integer result = instance.showShoppingDays();
        assertEquals(expResult, result);
    }


    /**
     * Test of getZodiac method, of class ChosenDate.
     */
    @Test
    public void testGetZodiac() {
        System.out.println("getZodiac");
        ChosenDate instance = new ChosenDate();
        String expResult = "Sagittarius";
        String result = instance.getZodiac();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class ChosenDate.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ChosenDate instance = new ChosenDate();
        String expResult = "2018-12-06";
        String result = instance.toString();
        assertEquals(expResult, result);;
    }

    /**
     * Test of getDate method, of class ChosenDate.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        ChosenDate instance = new ChosenDate();
        Integer expResult = 6;
        Integer result = instance.getDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMonth method, of class ChosenDate.
     */
    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        ChosenDate instance = new ChosenDate();
        Month expResult = Month.DECEMBER;
        Month result = instance.getMonth();
        assertEquals(expResult, result);
    }

    
}
