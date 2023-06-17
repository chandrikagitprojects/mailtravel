package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class travelpage {
	WebDriver driver;

   

    @FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
    WebElement coockies;

    @FindBy(xpath="//input[@id='searchtext_freetext_search_form']")
    WebElement searchbox;

   

    public void travelPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        
    }

  

    public void Acceptcoockies(){
        coockies.click();

    }

    public void searchlocation(String India){
        searchbox.sendKeys(India);
    }



	public void setBrowserName(String browserName) {
		// TODO Auto-generated method stub
		
	}



	public void setholiday(String india) {
		// TODO Auto-generated method stub
		
	}

   


}
