package Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.http.WebSocket;

public class LoginTest {
    //Webdriver = variabila care ne ajuta  sa interactionam cu site-ul si elementele acestuia

    public WebDriver driver;

    @Test
    public void testAutomat() {
        //specificam unde se afla driverul pentru browser
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");

        //deschidem un browser
        driver = new ChromeDriver();

        //introducem o adresa
        driver.get("http://demo.automationtesting.in/Index.html");

        //schimbam rezolutia in full-screen sau maximize
        driver.manage().window().maximize();

        //identificare element dupa "locaters" : id, class, name, link, css, xpath
        //identificam elementul "sign in"
        WebElement signInElement = driver.findElement(By.id("btn1"));

        //facem un click
        signInElement.click();

        WebElement emailElement = driver.findElement(By.cssSelector("input[placeholder='E mail']"));
        String emailValue = "ceva@ceva.com";
        emailElement.sendKeys(emailValue);

        WebElement parolaElement = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        String parolaValue = "parolaceva";
        parolaElement.sendKeys(parolaValue);

        WebElement enterElement = driver.findElement(By.id("enterbtn"));
        enterElement.click();

    }





}
