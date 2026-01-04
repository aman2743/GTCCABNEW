package GroupsInTestNG;

import org.testng.annotations.Test;


public class D2 {
    @Test
    public void M11(){
        System.out.println("M11->D2");
    }
    @Test (groups = {"windows"})
    public void M12(){
        System.out.println("M12->D2");

    }
}
