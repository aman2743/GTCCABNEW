package GroupsInTestNG;

import org.testng.annotations.Test;


public class B1 {
    @Test(groups = {"smoke"})
    public void M5(){
        System.out.println("M5->B1");
    }
    @Test(groups = {"smoke","regression"})
    public void M6(){
        System.out.println("M6->B1");
    }
}
