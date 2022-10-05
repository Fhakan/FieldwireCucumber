package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class _02_SignUpSteps {

    DialogContent dc = new DialogContent();

    @When("New user create")
    public void newUserCreate() {

        dc.createAccount.click();

        dc.firstname.sendKeys("asdasfasff");

        dc.lastname.sendKeys("asdasfasflastf");

        dc.email.sendKeys("asda2ffff22@gmail.com");

        dc.password.sendKeys("12345678h");

        dc.acceptagre.click();

        dc.createaccount2.click();

        GWD.Waitof(2);

        dc.company.sendKeys("asdafcomfp");

        Select ddmenu = new Select(dc.companytype);
        ddmenu.selectByVisibleText("General Contractor");

        Select ddmenu2 = new Select(dc.employenumber);
        ddmenu2.selectByIndex(2);

        dc.phone.sendKeys("2015678901");

        dc.complate.click();


















    }
}
