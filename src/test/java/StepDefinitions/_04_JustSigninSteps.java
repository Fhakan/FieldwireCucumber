package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;


import static Utilities.GWD.Waitof;

public class _04_JustSigninSteps {


    DialogContent dc = new DialogContent();
    @Then("User enter true email and password")
    public void userEnterTrueEmailAndPassword() {


        dc.semail.sendKeys("asda2ff@gmail.com");

        Waitof(2);

        dc.next.click();

        Waitof(2);

        dc.spassword.sendKeys("12345678h");

        dc.login.click();



    }
}
