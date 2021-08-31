package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class BaseElementInteractions {


    protected AppiumDriver<MobileElement> appiumDriver;

    public BaseElementInteractions(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }
    public MobileElement mobileElement (By locator){
        return appiumDriver.findElement(locator) ;
    }

    public void sendKeys(String string, By locator){
        mobileElement(locator).sendKeys(string);

    }
    public void click(By locator){
        mobileElement(locator).click();
    }
    public void selectByIndex(int index, By locator){
        Select select = new Select(mobileElement(locator));
        select.selectByIndex(index);
    }
}
