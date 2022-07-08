package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.CareerPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public static WebDriver driver;
    public CareerPage careerPage;

    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://careers.coditas.com/business-functions/");
        driver.manage().window().maximize();

        careerPage = new CareerPage(driver);
    }

}
