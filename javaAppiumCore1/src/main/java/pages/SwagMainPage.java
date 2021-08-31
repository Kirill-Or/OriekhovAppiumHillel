package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SwagMainPage extends  AndroidElementInteractions{

    By allItemLocator = MobileBy.AccessibilityId("test-Menu");
    By allItemSecondLocator = MobileBy.AccessibilityId("test-ALL ITEMS");
    By findFilterLocator = MobileBy.AccessibilityId("test-Modal Selector Button");
    By chooseAZ = By.xpath("//android.widget.ScrollView[@content-desc=\"Selector container\"]/android.view.ViewGroup/android.view.ViewGroup[3]");
    By chooseFilterLocator = MobileBy.AccessibilityId("Selector container");
    By addToCartLocator = MobileBy.AccessibilityId("test-ADD TO CART");
    By cartLocator = MobileBy.AccessibilityId("test-Cart");
    By checkOutLocator = MobileBy.AccessibilityId("test-CHECKOUT");
    By fullNameLocator = MobileBy.AccessibilityId("test-First Name");
    By lastNameLocator = MobileBy.AccessibilityId("test-Last Name");
    By zipPostalCodeLocator = MobileBy.AccessibilityId("test-Zip/Postal Code");
    By continueLocator = MobileBy.AccessibilityId("test-CONTINUE");
    public SwagMainPage(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }

    public void chooseFirstAllItem(){
        click(allItemLocator);
    }
    public void chooseSecondAllItem(){
        click(allItemSecondLocator);
    }
    public void findFilter(){
        click(findFilterLocator);
    }
   // public void chooseFilter(int index){
   //     selectByIndex(index,chooseFilterLocator);
   // }
    public void chooseFilterAZ(){
        click(chooseAZ);
    }
    public void addToCart(){
        click(addToCartLocator);
    }
    public void goToCart(){
        click(cartLocator);
    }
    public void checkOut(){
        click(checkOutLocator);
}
    public void fullNameSendCase(String name){
    sendKeys(name , fullNameLocator);
    }
    public void lastNameSendCase(String lastName){
        sendKeys(lastName, lastNameLocator);
    }
    public void zipPostalSendCase (String code){
        sendKeys(code, zipPostalCodeLocator);
    }
    public void clickContinue(){
        click(continueLocator);
    }
}
