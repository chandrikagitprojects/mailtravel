package pageobjects;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basepage {
	public WebDriver driver;
	public passengerinfo addpassinfo;
	public void setBrowserName(String name){
   
		if (name.equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();

        }
        else if (name.equalsIgnoreCase("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            // driver = new FirefoxDriver();
        }
        else if (name.equalsIgnoreCase("Edge")){
            WebDriverManager.edgedriver().setup();
            // driver = new EdgeDriver();
        }


    }

    public void verifyTitleofthePage(){

    }
}
