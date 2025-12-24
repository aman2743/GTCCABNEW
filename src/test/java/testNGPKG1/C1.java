package testNGPKG1;

import org.testng.annotations.Test;


public class C1 {
    @Test
    public void M1(){
        System.out.println("M1->A");
        System.out.println("M1->B");
    }
    @Test
    public void M2(){
        System.out.println("M2->C");
        System.out.println("M2->D");
    }
}
