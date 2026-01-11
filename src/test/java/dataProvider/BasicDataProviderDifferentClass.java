package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicDataProviderDifferentClass {
    @Test(dataProvider = "dp10",dataProviderClass = DataSupplierClass.class)
    public void LoginNewLatest(String []s){
        int len=s.length;
        System.out.println(len);
        for(int i=0;i<len;i++){
            System.out.print(s[i]+" ");
        }
        System.out.println();
    }
}
