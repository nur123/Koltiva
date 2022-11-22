package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomePage {

    private ChromeDriver driver;

    public HomePage(ChromeDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get("https://www.koltiva.com/");
    }

    public void clickButtonAccept()  {
        By locatorButtonAccept = By.xpath("//body/div[2]/div[1]/span[1]/button[1]");
        WebElement buttonButtonAccept = driver.findElement(locatorButtonAccept);
        buttonButtonAccept.click();
    }

    public void clickButtonImage() {
        By locatorButtonImage = By.xpath("//body/div[2]/button[2]/img[1]");
        WebElement buttonButtonImage = driver.findElement(locatorButtonImage);
        buttonButtonImage.click();
    }

    public void clickSolutions() throws InterruptedException {
        By locatorSolutions = By.id("comp-keidh9zf2label");
        WebElement solutions = driver.findElement(locatorSolutions);
        solutions.click();
    }

    public void clickKoltiTrade() {
        By locatorKoltiTrade = By.linkText("KoltiTrade");
        WebElement koltiTrade = driver.findElement(locatorKoltiTrade);
        String href = koltiTrade.getAttribute("href");
        koltiTrade.click();

//    public void clickKoltiTrade() throws InterruptedException {
//        By locatorKoltiTrade = By.xpath("");
//        WebElement koltiltrade = driver.findElement(locatorKoltiTrade);
//        koltiltrade.click();
//        Thread.sleep(1000);
//    }

    }
}
