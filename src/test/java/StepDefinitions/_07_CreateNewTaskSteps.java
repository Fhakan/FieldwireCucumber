package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;


import static Utilities.GWD.Waitof;

public class _07_CreateNewTaskSteps {

    DialogContent dc = new DialogContent();
    @Then("User create a task")
    public void userCreateATask() {

        Waitof(2);
        dc.project1.click();

        dc.tasks.click();

        Waitof(2);
        dc.newtask.click();


        Waitof(2);
        dc.newtask2.click();

        dc.tasktitle.sendKeys("taskkk2");

        Waitof(3);

        dc.taskdone.click();

        dc.taskexit.click();




    }
}
