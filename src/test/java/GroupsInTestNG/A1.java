package GroupsInTestNG;

import org.testng.annotations.Test;


public class A1 {
    @Test(groups = {"sanity","regression"})
    public void M1(){
        System.out.println("M1->A1");
        System.out.println("M1->A1"+Thread.currentThread());
    }
    @Test (groups = {"regression"})
    public void M2(){
        System.out.println("M2->A1");
        System.out.println("M2->A1"+Thread.currentThread());
    }
}
