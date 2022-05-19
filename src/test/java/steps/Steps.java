package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {
WebDriver driver;
    @Given("^login page$")
    public void login_page() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    @When("enters username")
    public void enters_username() {
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
    }
    @Then("Enters passwork")
    public void enters_passwork() {
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");

    }
    @Then("Clicks on login")
    public void clicks_on_login() {
       driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
    }

    @Before(order = 1)
    @Then("Login page should be disclayed")
    public void login_page_should_be_disclayed() {
        System.out.println("done");
    }

}
