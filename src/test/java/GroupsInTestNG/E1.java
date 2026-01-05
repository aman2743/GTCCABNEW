package GroupsInTestNG;

import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.testng.annotations.Test;

@Test(groups = {"sanity","smoke"})
public class E1 {
    @Test
    public void M13(){
        System.out.println("M13->E1");
    }
    @Test
    public void M14(){
        System.out.println("M14->E1");
    }
}
