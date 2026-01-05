package GroupsInTestNG;

import org.testng.annotations.Test;


public class E2 {
    @Test (groups = {"smoke"})
    public void M9(){
        System.out.println("M9->D1");
    }
    @Test(groups = {"sanity"})
    public void M10(){
        System.out.println("M10->D1");
    }
}
