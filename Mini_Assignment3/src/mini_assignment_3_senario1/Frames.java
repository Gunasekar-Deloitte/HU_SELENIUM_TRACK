package mini_assignment_3_senario1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\software\\selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        frmes(driver);
    }

    private static void frmes(WebDriver driver) {
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[text()='Frames']")).click();
        driver.findElement(By.xpath("//*[text()='Nested Frames']")).click();

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");

        String text = (driver.findElement(By.cssSelector("body")).getText());
        System.out.println("Title of the frame "+text);


    }
}
