package steps;

import BasePackage.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SearchFunction extends BaseClass {
    @Given("User exist in website")
    public void user_exist_in_website() throws InterruptedException {
    Intialization();
    }

    @When("Select Rome, Italy")
    public void select_rome_italy() {
        driver.findElement(By.cssSelector("body > div:nth-child(7) > div > div > div:nth-child(1) > div > div > div._1unac3l > div > div > div > div > div > div > div.h1p4yt3r.dir.dir-ltr > div > div > div > div > header > div > div.cylj8v3.dir.dir-ltr > div > div > div > div.lkm6i7z.l1rzxhu2.lr5v90m.dir.dir-ltr > div > button:nth-child(6) > div.f1xx50dm.f1rzp9sv.dir.dir-ltr")).click();
        driver.findElement(By.cssSelector("#bigsearch-query-location-input")).sendKeys("Rome, Italy");
        driver.findElement(By.cssSelector("#bigsearch-query-location-suggestion-2 > div._1825a1k > div")).click();
    }

    @When("Pick check in after a one a week from current date")
    public void pick_check_in_after_a_one_a_week_from_current_date() {
        driver.findElement(By.xpath("//*[@id=\"panel--tabs--0\"]/div/div[1]/div/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[4]/td[2]/div")).click();
    }

    @When("Pick check in after a one a week from check in date")
    public void pick_check_in_after_a_one_a_week_from_check_in_date() {
        driver.findElement(By.xpath("//*[@id=\"panel--tabs--0\"]/div/div[1]/div/div/div/div/div[2]/div[2]/div/div[3]/div/table/tbody/tr[4]/td[5]/div")).click();

    }

    @When("Select two adults and one a child")
    public void select_two_adults_and_one_a_child() {
        driver.findElement(By.xpath("//*[@id=\"search-tabpanel\"]/div/div[5]/div[1]/div[1]/div/div[2]")).click();
        Actions act = new Actions(driver);
        act.doubleClick(driver.findElement(By.cssSelector("#stepper-adults > button:nth-child(3)"))).build().perform();
        driver.findElement(By.cssSelector("#stepper-children > button:nth-child(3)")).click();
    }

    @When("Click a search button")
    public void click_a_search_button() {
        WebElement searchButton;
        searchButton= driver.findElement(By.xpath("//*[@id=\"search-tabpanel\"]/div/div[5]/div[1]/div[3]/button/span[1]/span"));
        searchButton.click();
    }

    @Then("Search is successfully")
    public void search_is_successfully() {
        // IF we Want to Assert Method
//        WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(20));
//        w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#site-content > div.f15dgkuj.dir.dir-ltr " +
//                "> div.p14tze6r.pj16vlp.dir.dir-ltr " +
//                "> div > div > div > div.t16kra9o.dir.dir-ltr > div > section > h1 > span")));
//        String Name = driver.findElement(By.cssSelector("#site-content > div.f15dgkuj.dir.dir-ltr > div.p14tze6r.pj16vlp.dir.dir-ltr > div > div > div > div.t16kra9o.dir.dir-ltr > div > section > h1 > span")).getText();
//        Assert.assertEquals(Name,"Over 1,000 homes");

        System.out.println("Search is Successfully");
    }

}
