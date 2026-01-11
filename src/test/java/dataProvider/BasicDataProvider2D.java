package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicDataProvider2D {
    @Test(dataProvider = "dp2")
    public void LoginNewOne(String s,String s1){
        System.out.println(s +"***"+s1);
    }

    @DataProvider(name="dp2")
    public Object[][] dataProviderMethod(){
        String [][]  str= new String[][]{
                {"TestOne", "TestTwo"},
                {"TestThree","TestFour"},
                {"TestFive","TestSix"}
              };
        return str;
    }
}
