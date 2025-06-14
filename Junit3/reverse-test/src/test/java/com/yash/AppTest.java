package com.yash;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

/**
 * Unit test for simple App.
 */

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AppTest {

    /**
     * Rigorous Test :-)
     */

    AppTest(){
        System.out.println("the object is created just before every test method");
    }


    @BeforeAll
    public static void beforeAll (){
        System.out.println("before all the methods it has been called only once");
    }


    @AfterAll
    public static void afterAll (){
        System.out.println("after all the methods it has been called only once");
    }




    AreaOfCircle ac ;

    @BeforeEach
    public void beforeEach(){
        ac = new AreaOfCircle() ; 
    }


    @AfterEach
    public void destroy(){
        System.out.println("all the memory is cleaned up");
    }


    
    @Test
    public void shouldAnswerWithTrue() {
       
        double actual = ac.areaOfCircle(4) ; 
        double expectedResult = 16 * 3.14 ; 
        assertEquals(expectedResult, actual);
    }

    @Test
    public void test (){
        int []expected = {2,4,6,8,10} ; 
        int []actuala = {8,6,4,2,10} ; 

        Arrays.sort(actuala) ; 
        assertArrayEquals(expected, actuala);
        // assertEquals(expected, actuala);
    }

    @Test
    public void sortTest (){
            sort s = new sort() ; 

        // try{
        //     int [] unsorted = {4,2,1,5,6} ; 
        //     int[] sorted =  s.sortingArray(unsorted) ; 

        // }
        // catch ( NullPointerException npe ){
        //     System.out.println("exception is generated");
        // }

        int unsorted [] = {5,3,2,1} ; 
        assertThrows(NullPointerException.class, () -> s.sortingArray(null)) ; 

        assertTimeout(Duration.ofMillis(1), () -> s.sortingArray(unsorted) ) ;


    }
}
 