package GroupsInTestNG;

import org.testng.annotations.Test;


public class D1 {
    @Test (groups = {"dailybuild"})
    public void M9(){
        System.out.println("M9->D1");
    }
    @Test(groups = {"weeklybuild"})
    public void M10(){
        System.out.println("M10->D1");
    }
}
