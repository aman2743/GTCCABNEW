package GroupsInTestNG;

import org.testng.annotations.Test;


public class B2 {
    @Test (groups = {"sanity"})
    public void M7(){
        System.out.println("M7->B2");
    }
    @Test(groups = {"regression"})
    public void M8(){
        System.out.println("M8->B2");
    }
}
