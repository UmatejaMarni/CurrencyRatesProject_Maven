import java.util.logging.Logger;
import static com.codeborne.selenide.Selenide.screenshot;
import Commons.Commons;
import org.junit.Test;
import webElements.webElements;


public class Main extends Commons {
    @Test
    public void currency() throws InterruptedException {

        // write your code here
        Logger logger
                = Logger.getLogger(Main.class.getName());

        //method to open the application
        openApplication();

        webElements obj=new webElements();

        //method to select a value from the dropdown
        clickDropdown(obj.dropdownClass, obj.dropdownListCss, "USD");

        //setting the currency value for the conversion and getting the conversion rate
        logger.info("I Buy value is " + returnCurrencyValue(obj.setValueClass, obj.getValueXpath, "100"));

        /*The screenshot will be stored in ..CurrentRatesProject\build\reports\tests with file name as "Currency_Rates_2c"*/
        screenshot("Currency_Rates_2c");

    }

}