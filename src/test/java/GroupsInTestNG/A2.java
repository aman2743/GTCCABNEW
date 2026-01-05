package GroupsInTestNG;


import org.testng.annotations.Test;

public class A2 {
  @Test (groups = {"sanity","smoke"})
    public void M3(){
        System.out.println("M3->A2");
      System.out.println("M3->A2"+Thread.currentThread());
    }
    @Test(groups = {"smoke","regression"})
    public void M4(){
        System.out.println("M4->A2");
        System.out.println("M4->A2"+Thread.currentThread());
    }
}
