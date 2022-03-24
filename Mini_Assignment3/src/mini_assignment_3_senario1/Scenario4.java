package mini_assignment_3_senario1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\software\\selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        trip(driver);
    }

    private static void trip(WebDriver driver) {
        driver.get("https://www.goibibo.com/");
        driver.findElement(By.xpath("//*[@class='sc-gsNilK dImRia'][text()='Round-trip']")).click();
        driver.findElement(By.xpath("//*[@class='sc-iJKOTD iipKRx fswWidgetPlaceholder'][text()='Enter city or airport']")).click();
        driver.findElement(By.xpath("//*[@id=root]/div/div[2]/div[2]/div/div[1]/div[1]/div/div[2]/div/input")).sendKeys("New York");
        driver.findElement(By.xpath("//*[@id=autoSuggest-list]/li[1]/div/div[1]/div")).click();
        driver.findElement(By.xpath("//*[@id=root]/div/div[2]/div[2]/div/div[1]/div[2]/div/div/p")).click();
        driver.findElement(By.xpath("//*[@id=root]/div/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/input")).sendKeys("Seattle");
        driver.findElement(By.xpath("//*[@id=root]/div/div[2]/div[2]/div/div[1]/div[4]/div/p[1]")).click();


    }
}
