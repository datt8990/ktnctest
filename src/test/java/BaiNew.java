import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaiNew {

    ChromeDriver chromeDriver;

    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
    }

    @Test
    public void test() {
        chromeDriver.get("https://vitimex.com.vn/dang-ky.html");

        WebElement hoTen = chromeDriver.findElement(By.xpath("//input[@id='name']"));
        hoTen.sendKeys("dfsf");

        WebElement sdt = chromeDriver.findElement(By.xpath("//input[@id='phone']"));
        sdt.sendKeys("0123456789");

        WebElement email = chromeDriver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("dfsf@gmail.com");

        WebElement pass = chromeDriver.findElement(By.xpath("//input[@id='pass-regis']"));
        pass.sendKeys("123456");

        WebElement pass1 = chromeDriver.findElement(By.xpath("//input[@id='pass-confirm']"));
        pass1.sendKeys("123456");

        WebElement btn = chromeDriver.findElement(By.xpath("//a[@id='register-btn']"));
        btn.click();
    }

    @Test
    public void test2() {
        chromeDriver.get("https://vitimex.com.vn/");

        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));

        WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"myPage\"]/header/div[2]/div/div[2]/div[2]/div[2]/a")));
        btn.click();

        WebElement sdt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='account']")));
        sdt.sendKeys("0363462995");

        WebElement pass = chromeDriver.findElement(By.xpath("//input[@id='pass']"));
        pass.sendKeys("datvu8990");

        WebElement btns = chromeDriver.findElement(By.xpath("//a[@id='signin-btn']"));
        btns.click();
    }
}
