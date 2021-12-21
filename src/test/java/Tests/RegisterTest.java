package Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegisterTest {

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


            WebElement skipsignInElement = driver.findElement(By.id("btn2"));
            skipsignInElement.click();

            //validam pagina de register
             String actualRegister= driver.getTitle();
            Assert.assertEquals("Register",actualRegister);

            WebElement firstNameElement = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
            String firstNameValue = "Petru";
            firstNameElement.sendKeys(firstNameValue);

            WebElement genderElement = driver.findElement(By.cssSelector("input[value= 'FeMale']"));
            genderElement.click();

            WebElement skillsElement = driver.findElement(By.id("Skills"));
            Select skillsSelect = new Select(skillsElement);
            skillsSelect.selectByVisibleText("Android");

            WebElement yearElement = driver.findElement(By.id("yearbox"));
            Select yearSelect = new Select(yearElement);
            yearSelect.selectByValue("1970");


            WebElement languageElement = driver.findElement(By.id("msdd"));
            languageElement.click();

            List<WebElement> languageElements = driver.findElements(By.xpath("//li[@class='ng-scope']/a"));
            //parcugem o lista
            for (Integer i=0; i< languageElements.size(); i++){
            //chemam elementul dintr-o lista
            if (languageElements.get(i).getText().equals("Bulgarian")){
                languageElements.get(i).click();

            }
            }

            genderElement.click();

            //Adresa

            WebElement adresaElement = driver.findElement(By.cssSelector("textarea[ng-model= 'Adress']"));
            String adresaElementValoare= "Cluj nr 22";
            adresaElement.sendKeys(adresaElementValoare);


            //parola
            WebElement parolaElement = driver.findElement(By.id('firstpassword'));
            String parolaElementValoare = 'parola';
            parolaElement.sendKeys(parolaElementValoare);






        }
    }


