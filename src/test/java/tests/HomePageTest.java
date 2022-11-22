package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {

    private ChromeDriver driver;

    @BeforeTest
    public void initializeSession() {
        //webdrivermanager
        WebDriverManager.chromedriver().setup();
//        WebDriverManager.firefoxdriver().setup();
        //chrome Options
        ChromeOptions options = new ChromeOptions();
//        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("chrome");
        //initialize browser
        driver = new ChromeDriver(options);
        //maximize
        driver.manage().window().maximize();
    }

    @AfterTest
    public void destroySession() throws InterruptedException {
        Thread.sleep(5000);
        //close browser
        driver.quit();
    }

    @Test
    public void searchKey() throws InterruptedException {
        driver.get("https://www.koltiva.com/");
        Thread.sleep(5000);

        // click button Accept
        By locatorButtonAccept = By.xpath("//body/div[2]/div[1]/span[1]/button[1]");
        WebElement buttonButtonAccept = driver.findElement(locatorButtonAccept);
        buttonButtonAccept.click();
        Thread.sleep(3000);

        // click button Image
        By locatorButtonImage = By.xpath("//body/div[2]/button[2]/img[1]");
        WebElement buttonButtonImage = driver.findElement(locatorButtonImage);
        buttonButtonImage.click();
        Thread.sleep(3000);

        // click link Solutions
        By locatorSolutions = By.id("comp-keidh9zf2label");
        WebElement solutions = driver.findElement(locatorSolutions);
        solutions.click();
        Thread.sleep(1000);

    // click link KoltiTrade
        By locatorKoltiTrade = By.linkText("KoltiTrade");
        WebElement koltiTrade = driver.findElement(locatorKoltiTrade);
        String href = koltiTrade.getAttribute("href");
        koltiTrade.click();
        Thread.sleep(5000);
        String ExpectedLabel = "KoltiTrade";
        String ActualLabel = "KoltiTrade";
        Assert.assertEquals(ExpectedLabel, ActualLabel);
        System.out.println("KoltiTrade label is expected - Assert passed");
    }
}