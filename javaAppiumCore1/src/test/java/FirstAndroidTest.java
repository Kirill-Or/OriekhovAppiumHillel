import org.testng.annotations.Test;
import pages.BaseAndroidPageObject;
import pages.SwagLoginPage;
import pages.SwagMainPage;

public class FirstAndroidTest extends BaseAndroidTest{

    @Test
    public void firstAndroidTest(){
        SwagLoginPage swagLoginPage = new SwagLoginPage(getDriver());
        swagLoginPage.login("standard_user","secret_sauce" );
        SwagMainPage swagMainPage = new SwagMainPage(getDriver());
        swagMainPage.chooseFirstAllItem();
        swagMainPage.chooseSecondAllItem();
        swagMainPage.findFilter();
       // swagMainPage.chooseFilter(2);
        swagMainPage.chooseFilterAZ();
        swagMainPage.addToCart();
        swagMainPage.goToCart();
        swagMainPage.checkOut();
        swagMainPage.fullNameSendCase("john");
        swagMainPage.lastNameSendCase("smith");
        swagMainPage.zipPostalSendCase("555");
        swagMainPage.clickContinue();

    }
}
