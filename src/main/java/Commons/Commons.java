package Commons;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.List;
import static com.codeborne.selenide.Selenide.*;

public class Commons{

    public void openApplication() throws InterruptedException {

        //opening the url
        open("https://luminor.ee/currency-rates");

        //setting  wait time for the url to load successfully
        Thread.sleep(30000);

    }

    public   void clickDropdown(String dropdownClass,String dropdownListCss, String currency) throws InterruptedException {

        $(By.className(dropdownClass)).click();
        Thread.sleep(4000);
        List<WebElement> ele = WebDriverRunner.getWebDriver().findElements(new By.ByCssSelector(dropdownListCss));
        for (WebElement webElement : ele) {
            if (webElement.getText().equals(currency)) {
                webElement.click();
            }
        }

    }

    public String returnCurrencyValue(String setValueClass,String getValueXpath,String value) throws InterruptedException {

        Thread.sleep(4000);
        $(By.className(setValueClass)).setValue(value);
        return $x(getValueXpath).getValue();

    }
}
