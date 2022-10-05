package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hooks {

    @Before
    public void before()
    {
        System.out.println("Senaryo Started");
    }

    @After
    public void after(Scenario scenario)
    {
        System.out.println("Senaryo finished");
        System.out.println("scenario result="+ scenario.getStatus());
        System.out.println("scenario isFailed ?="+ scenario.isFailed());



        GWD.quitDriver();
    }



}
