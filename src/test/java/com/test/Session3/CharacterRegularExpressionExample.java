package com.test.Session3;

import com.test.Session3.fileconcepts.sleepInSeconds;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterRegularExpressionExample {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        DesiredCapabilities capabilities = new DesiredCapabilities();

        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("-incognito");
        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
       // WebDriver chromedriver=new ChromeDriver(capabilities);
        WebDriver driver=new ChromeDriver(capabilities);
        driver.get("https://www.google.com/");
// Opens a new window and switches to new window
        driver.switchTo().newWindow(WindowType.WINDOW);

// Opens BrowserStack homepage in the newly opened window
        driver.navigate().to("https://www.browserstack.com/");
        sleepInSeconds seconds=new sleepInSeconds(10);


        String input = "Mav%eric$123#Systems";
        Pattern pattern = Pattern.compile("[^%]");
        Matcher matcher=pattern.matcher(input);
        while(matcher.find())

        {
            System.out.println(matcher.start()+"_____________"+ matcher.group());

        }


    }
}
