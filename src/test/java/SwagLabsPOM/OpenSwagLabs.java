package SwagLabsPOM;

import methods.MainMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSwagLabs {
    public MainMethods mainMethods;
    private SwagLabsLoginPage loginPage;
    private SwagLabsInventoryPage inventoryPage;
    private SwagLabsItemPage itemPage;
    private SwagLabsCartPage cartPage;
    private SwagLabsCheckoutPageOne checkoutPageOne;
    private SwagLabsCheckoutPageTwo checkoutPageTwo;
    private SwagLabsCheckoutCompletePage checkoutCompletePage;
    private WebDriver driver;

    void openWebsite() {
        driver = new ChromeDriver();
        mainMethods = new MainMethods(driver);
        loginPage = new SwagLabsLoginPage(mainMethods);
        inventoryPage = new SwagLabsInventoryPage(mainMethods);
        itemPage = new SwagLabsItemPage(mainMethods);
        cartPage = new SwagLabsCartPage(mainMethods);
        checkoutPageOne = new SwagLabsCheckoutPageOne(mainMethods);
        checkoutPageTwo = new SwagLabsCheckoutPageTwo(mainMethods);
        checkoutCompletePage = new SwagLabsCheckoutCompletePage(mainMethods);
        driver.get("https://www.saucedemo.com/");
    }
}
