package steps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class PesquisaGoogleSteps {
    WebDriver driver = new ChromeDriver();

    @Given("O usuario esta na pagina inicial do Google")
    public void o_usuario_esta_na_pagina_inicial_do_Google() {
        driver.get("https://www.google.com");
    }

    @When("O usuario pesquisa por")
    public void o_usuario_pesquisa_por() {
        driver.findElement(By.name("q")).sendKeys("cucumber");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
   
    }

    @Then("A página de resultados é exibida")
    public void a_pagina_de_resultados_e_exibida() {
        assert driver.findElement(By.id("logo")).isDisplayed();
        driver.quit();
    }
}
