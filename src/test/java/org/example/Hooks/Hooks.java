package org.example.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.util.BaseTest;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks extends BaseTest {
    @BeforeAll
    public static void antesDosCenarios(){
        WebDriverManager.chromedriver().setup();
    }
    @Before
    public  void antesDeCadaCenario(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.saucedemo.com/");
    }

    @After
    public void aposCadaCenario(){
        driver.quit();
    }

}
