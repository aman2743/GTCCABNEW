package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicDataProviderMD {
    @Test(dataProvider = "dp3")
    public void LoginNewOne(String []s){
        int len=s.length;
        System.out.println(len);
        for(int i=0;i<len;i++){
            System.out.print(s[i]+" ");
        }
        System.out.println();
    }

    @DataProvider(name="dp3")
    public Object [][] dataProviderMethodNew(){
        String [][]  str2= new String[][]{
                {"TestOne", "TestTwo","Test"},
                {"TestThree","TestFour","Test1"},
                {"TestFive","TestSix","Test2"}
              };
        return str2;
    }
}
