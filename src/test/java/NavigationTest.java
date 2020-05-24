import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTest {
    private WebDriver driver;
    private final String URL = "https://my.mail.ru/";

    @Test
    void navigationPanelTest(){
        System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL);
        WebElement music =   driver.findElement(By.cssSelector("div.b-head__menu__links > div:nth-child(1) > a"));
        music.click();
        driver.quit();
    }

}
