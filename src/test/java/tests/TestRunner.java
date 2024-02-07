package tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;




@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "steps",plugin = {"pretty", "html:target/cucumber-reports/html", "json:target/cucumber-reports/cucumber.json"})
public class TestRunner {
 
    
    @BeforeClass
    public static void setup() {
        // Especifica o caminho do ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");

        // Certifique-se de substituir "/caminho/para/o/chromedriver" pelo caminho real do seu ChromeDriver
    }

}