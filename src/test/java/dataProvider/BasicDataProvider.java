package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicDataProvider {
    @Test(dataProvider = "dp1")
    public void LoginNew(String s){
        System.out.println(s);
    }

    @DataProvider(name="dp1")
    public Object[] dataProviderMethod(){
        String []  str= new String[]{"TestOne", "TestTwo", "TestThree"};
        return str;

    }
}
