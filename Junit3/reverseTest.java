package Junit3;

import static org.junit.jupiter.api.Assertions.*; 
import org.junit.jupiter.api.Test; // ✅ This import is required

public class reverseTest {
    @Test
    void test(){
        ReverseString rev = new ReverseString(); 
        String actualresult = rev.reverseString("java"); 
        String expectedResult = "avaj"; 
        assertEquals(expectedResult, actualresult);
        assertEquals("hsay",ReverseString.reverseString("yash") );
    }

    @Test
    void testMultipleWrods(){
        ReverseString rev = new ReverseString(); 
        String actualresult = rev.reverseString("java"); 
        String expectedResult = "avaj"; 
        assertEquals(expectedResult, actualresult);
        assertEquals("hsay",ReverseString.reverseString("yash") , "the output is wrong");
    }
}