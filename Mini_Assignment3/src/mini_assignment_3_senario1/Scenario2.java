package mini_assignment_3_senario1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Scenario2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\software\\selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        dragAndDrop(driver);
    }

    private static void dragAndDrop(WebDriver driver) {
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(iframe);
        WebElement webElement1=driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement webElement2=driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions action=new Actions(driver);
        Action drag=action.clickAndHold(webElement1).moveToElement(webElement2).release().build();
        drag.perform();
    }
}
