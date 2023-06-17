package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class holidaybookingpage {

	
	WebDriver driver;

   
   
 @FindBy(xpath="//select[@id='numAdults-f0050aa159413059b0d39248658bdb50']")
    WebElement numpersons;

    @FindBy(xpath="//input[@id='calbox-f0050aa159413059b0d39248658bdb50-1']")
    WebElement selectdate;

    @FindBy(xpath="//div[@id='book-button']//div[@class='nbf_fancyimg_pms_add_button nbf_fg_pms_button_text nbf_bg_pms_button nbf_fg_pms_button_text '][normalize-space()='Book Online']")
    WebElement btnbookonline;

  public void holidaybookingPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        
    }


 
 
 public void selectpersons(String two ){
     numpersons.click();
     Select persons = new Select(driver.findElement(By.xpath("//select[@id='numAdults-f0050aa159413059b0d39248658bdb50']")));
     persons.selectByVisibleText(two);
 }
 
 public void traveldate(){
        selectdate.click();

    }

  
 public void bookonline(){
        btnbookonline.click();

    }

}
