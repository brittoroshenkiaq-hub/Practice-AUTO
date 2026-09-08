package Com.Test_Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import Base_Class.Base_Class;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resource/com.featurefile",
        glue = "Step_Definition",
        dryRun = false,
        plugin = {
                "pretty",
                "html:target/html/report.html",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        }
)

public class Test_Runner extends Base_Class {

    @BeforeClass
    public static void open() {
        browserlaunch();
    }

    @AfterClass
    public static void close() {
        // driver.quit();
    }
}