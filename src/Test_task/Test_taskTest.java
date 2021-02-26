package Test_task;

import org.junit.Before;
import org.junit.Test;

public class Test_taskTest {
    @Before
    public void lineDivide(){
        System.out.println("==================================");
    }
    //Test - method with valid data = if OK => appear return the longest substring
    // that appears at both the beginning and end of the string without overlapping
    @Test
    public void sameEndsTestValid(){
        String str1 = "abXYab";
        String str2 = "xx";
        String str3 = "xxx";
        String str4 = "1235123";
        String str5 = "./asdsa.";
        String str6 = " asd ";
        System.out.println(Test_task.sameEnds(str1));
        System.out.println(Test_task.sameEnds(str2));
        System.out.println(Test_task.sameEnds(str3));
        System.out.println(Test_task.sameEnds(str4));
        System.out.println(Test_task.sameEnds(str5));
        System.out.println(Test_task.sameEnds(str6));
    }

    //Test - method with invalid data = if OK => no results
    @Test
    public void sameEndsTestInvalid(){
        String str1 = "";
        String str2 = " ";
        String str3 = "1234567890";
        String str4 = "qwerty";
        String str5 = " qwerty";
        String str6 = "qwerty ";
        System.out.println(Test_task.sameEnds(str1));
        System.out.println(Test_task.sameEnds(str2));
        System.out.println(Test_task.sameEnds(str3));
        System.out.println(Test_task.sameEnds(str4));
        System.out.println(Test_task.sameEnds(str5));
        System.out.println(Test_task.sameEnds(str6));
    }
}