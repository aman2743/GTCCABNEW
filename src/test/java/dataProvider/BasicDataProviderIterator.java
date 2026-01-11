package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class BasicDataProviderIterator {
    @Test(dataProvider = "dp4")
    public void LoginNewIterator(String s){
        System.out.println(s);
    }

    @DataProvider(name="dp4")
    public Iterator<String> dataProviderIteratorMethod(){
       ArrayList<String> lst=new ArrayList<>();
       lst.add("TestOne");
        lst.add("TestTwo");
        lst.add("Three");
        return lst.iterator();

    }
}
