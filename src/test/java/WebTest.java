
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class WebTest {

    @Test
    public void testFirst() throws InterruptedException {
        String driverPath = "C:/TanyaR/ChromeDriver/chromedriver.exe";
        String chromeDriver = "webdriver.chrome.driver";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "http://www.99-bottles-of-beer.net/";
        String CheckLine = "Check line";

/*String driverPath = "C:/TanyaR/ChromeDriver/chromedriver.exe";
        String chromeDriver = "webdriver.chrome.driver";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "http://www.99-bottles-of-beer.net/";
        String CheckLine = "Check line";

 */
        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();   // open browser

        driver.get(url);   //open url
        Thread.sleep(3000); //delay om 3 sec

        String actualResutl = driver.getCurrentUrl();

        Assert.assertEquals(actualResutl, expectedResult);

        //close driver
        // go out
        driver.close();
        driver.quit();
    }
}
