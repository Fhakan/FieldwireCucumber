package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.en.Given;

public class _01_NavigateSteps {
    @Given("Navigate to homepage")
    public void navigateToBasilar() {

        GWD.getDriver().get("https://staging.fieldwire.com/#!/auth/sign_in?alertDanger=false");
        GWD.getDriver().manage().window().maximize();

    }
}
