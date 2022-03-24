package mini_assignment_3_senario1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\software\\selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        alert(driver);
    }

    private static void alert(WebDriver driver) throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='JavaScript Alerts']")).click();
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

        Alert popup = driver.switchTo().alert();
        System.out.println(popup.getText());
        driver.switchTo().alert().sendKeys("Test");
        Thread.sleep(5000);
        popup.accept();
        Thread.sleep(5000);
        String input = driver.findElement(By.xpath("//p[@id='result']")).getText();
        if (input.contains("Test")) {
            System.out.println("Text entered in the alert-box and the results displayed are same");
        } else {
            System.out.println("The input and the results mismatch");
        }
    }
}