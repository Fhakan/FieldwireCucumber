package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Then;

public class _06_CreateNewProjectSteps {

    DialogContent dc = new DialogContent();
    @Then("User create a new project file")
    public void userCreateANewProjectFile() {

        GWD.Waitof(2);

        dc.newprojectt.click();

        dc.projectname.sendKeys("project2");

        GWD.Waitof(1);

        dc.createproject.click();
        GWD.Waitof(1);

        dc.projectnext1.click();
        GWD.Waitof(2);

        dc.projectnext2.click();
        GWD.Waitof(1);

        dc.projectnext3.click();

        GWD.Waitof(1);

        dc.projectdone.click();






    }
}
