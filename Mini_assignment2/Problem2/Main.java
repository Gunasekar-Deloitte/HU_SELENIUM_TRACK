package Problem2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\software\\selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver ;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        driver = new ChromeDriver(options);

        launchUrl(driver);

    }

    private static void launchUrl(WebDriver driver) throws InterruptedException {
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        driver.get("https://phptravels.com/demo");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        if (driver.getTitle().contains("PHPTRAVELS")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        driver.findElement(By.xpath("/html/body/header/div/nav/a[4]")).click();
        Thread.sleep(3000);
        String parentWindow = driver.getWindowHandle();
        Thread.sleep(3000);
        driver.switchTo().window(parentWindow);
        System.out.println("Current Url "+driver.getCurrentUrl());
        driver.findElement(By.xpath("//a[text()='Pricing']")).click();
        driver.navigate().back();
        driver.navigate().refresh();
        driver.close();
        driver.close();
    }
}