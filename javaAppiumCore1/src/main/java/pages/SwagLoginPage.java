package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SwagLoginPage extends AndroidElementInteractions{

    By usernameInput = MobileBy.AccessibilityId("test-Username");
    By password = MobileBy.AccessibilityId("test-Password");
    By button = MobileBy.AccessibilityId("test-LOGIN");




    public SwagLoginPage(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }

    public void sendUserName (String userName){
        sendKeys(userName,usernameInput );
    }
    public void  sendPassword(String inputPassword) {
        sendKeys(inputPassword, password);
}
public void submit(){
        click(button);

}
public void login (String username, String password){
        sendUserName(username);
        sendPassword(password);
        submit();
}


}




