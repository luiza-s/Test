import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void successLogin(){
        System.setProperty("webdriver.chrome.driver", "/Users/studentb/BrowserDriver/chromedriver_win32/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
    }

}
