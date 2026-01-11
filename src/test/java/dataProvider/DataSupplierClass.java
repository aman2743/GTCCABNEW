package dataProvider;

import org.testng.annotations.DataProvider;

public class DataSupplierClass {
    @DataProvider(name="dp10")
    public Object [][] dataProviderMethodLatest(){
        String [][]  str2= new String[][]{
                {"TestOne", "TestTwo","Test"},
                {"TestThree","TestFour","Test1"},
                {"TestFive","TestSix","Test2"}
        };
        return str2;
    }
}
