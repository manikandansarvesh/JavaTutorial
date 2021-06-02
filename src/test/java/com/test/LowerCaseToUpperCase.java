package com.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LowerCaseToUpperCase {
    public static void main(String[] args) {

        String str="Manikandan is Test Automation Architect";

        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver=new ChromeDriver();

        StringBuilder builder=new StringBuilder(str);
        for(int i=0;i<str.length();i++){
            int value=str.charAt(i);
            if(Character.isUpperCase(str.charAt(i))){
                builder.setCharAt(i,Character.toLowerCase(str.charAt(i)));
            }
            else if(Character.isLowerCase(str.charAt(i))){

                builder.setCharAt(i,Character.toUpperCase(str.charAt(i)));

            }
        }            System.out.println("String after conversion: " +builder);

    }
}
