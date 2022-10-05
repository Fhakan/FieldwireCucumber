package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;


import static Utilities.GWD.Waitof;

public class _03_NegativeSigninSteps {


    DialogContent dc = new DialogContent();
    @Then("User enter wrong email and password")
    public void userEnterWrongEmailAndPassword() {

        dc.semail.sendKeys("asdadw121231231@gmail.com");

        Waitof(2);

        dc.next.click();

        Waitof(2);

        dc.spassword.sendKeys("12345asdawda678h");

        dc.login.click();





    }
}
