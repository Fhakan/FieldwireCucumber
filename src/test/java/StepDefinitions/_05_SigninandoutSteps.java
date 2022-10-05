package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;


import static Utilities.GWD.Waitof;

public class _05_SigninandoutSteps {

    DialogContent dc = new DialogContent();
    @Then("User signout")
    public void userSignout() {


        Waitof(3);

        dc.outname.click();

        dc.signout.click();






    }
}
