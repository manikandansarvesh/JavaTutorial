package com.test.Session3.fileconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Locale;

public class sleepInSeconds {
    public static void main(String[] args) {

        new  sleepInSeconds(5);
        System.out.println("waited for 5 seconds");

    }

     public sleepInSeconds(int seconds) {
        long start, stop;
        start = System.currentTimeMillis();
        do {
            stop = System.currentTimeMillis();

        } while ((stop - start)<seconds*1000);
    }


    public static void setTypeAheadValueOnElement(WebElement element,String textValue){

        boolean selected=false;
        element.clear();
        String [] textValueArray=textValue.split("(?!^)");
        for(String charValue:textValueArray){
            element.sendKeys(charValue);
        }
        List<WebElement> dropDownOptions=element.findElements(By.xpath(""));
        for(WebElement element1:dropDownOptions){
            if(element.getText().toLowerCase().contains(textValue.toLowerCase()))
            {
                element.click();
                selected=true;
                break;
            }
        }if(selected){

        }
    }

}
