package PriorityTestCases;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FlightBookingTest {
    @Ignore
    @Test (priority = -1)
    public void SignUp(){
        System.out.println("Sign Up");
    }

    @Test (priority = 0)
    public void Login(){
        System.out.println("User Login");
    }
   @Test(priority = 1)
    public void SearchFlight(){
       System.out.println("Search the Flight");
   }

    @Test(priority = 2)
    public void BookFlight(){
        System.out.println("User books the flight");
    }

    @Test(priority = 3,enabled = false)
    public void Logout(){
        System.out.println("User log out");
    }
}
