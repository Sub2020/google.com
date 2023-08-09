package kc.com;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest{
    @Test
    public void testGooglePage() {
        // Set the system property for ChromeDriver executable
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Devraj\\IdeaProjects\\Practice\\driver\\chrome-win64\\chromedriver.exe");
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        // Get and print the title of the page
        System.out.println("Page title: " + driver.getTitle());

    }

}