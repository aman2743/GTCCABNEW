package PriorityTestCases;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FlightBookingTestDependsMethod {
    @Test
    public void SignUp(){
        System.out.println("Sign Up");
    }

    @Test (dependsOnMethods = {"SignUp"})
    public void Login(){
        System.out.println("User Login");
    }
   @Test(dependsOnMethods = {"Login"})
    public void SearchFlight(){
       System.out.println("Search the Flight");
   }

    @Test(dependsOnMethods = {"SearchFlight"})
    public void BookFlight(){
        System.out.println("User books the flight");
    }

    @Test(enabled = false)
    public void Logout(){
        System.out.println("User log out");
    }
}
