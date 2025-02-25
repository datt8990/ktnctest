import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Bai3 {

    ChromeDriver chromeDriver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
    }

    @Test
    public void testDK() {
        chromeDriver.get("https://vitimex.com.vn/dang-ky.html");

        WebElement hoTen = chromeDriver.findElement(By.xpath("//input[@id='name']"));
        hoTen.sendKeys("Vũ Tiến Đạt");

        WebElement sdt = chromeDriver.findElement(By.xpath("//input[@id='phone']"));
        sdt.sendKeys("0363462995");

        WebElement email = chromeDriver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("datvu8990@gmail.com");

        WebElement mk = chromeDriver.findElement(By.xpath("//input[@id='pass-regis']"));
        mk.sendKeys("datvu8990");

        WebElement mkNew = chromeDriver.findElement(By.xpath("//input[@id='pass-confirm']"));
        mkNew.sendKeys("datvu8990");

        WebElement btn = chromeDriver.findElement(By.xpath("//a[@id='register-btn']"));
        btn.click();
    }

    @Test
    public void testDK2() {
        chromeDriver.get("https://vitimex.com.vn/");

        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));
        WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"myPage\"]/header/div[2]/div/div[2]/div[2]/div[2]/a")));
        login.click();

        WebElement hoTen = wait.until(
          ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='account']"))
        );
        hoTen.sendKeys("0363462995");

        WebElement mk = chromeDriver.findElement(By.xpath("//input[@id='pass']"));
        mk.sendKeys("datvu8990");

        WebElement button = chromeDriver.findElement(By.xpath("//a[@id='signin-btn']"));
        button.click();
    }
}
