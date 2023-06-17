package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.failsafe.internal.util.Assert;

public class confirmpage {

	WebDriver driver;


   
 @FindBy(xpath="//h1[@class='nbf_fancyimg_payment_pageheader']")
    WebElement chktxt;

    @FindBy(xpath="//div[@class='nbf_fancyimg_payment_book_button']")
    WebElement chkbtn;

   

  public void travelPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        
    }

  

  public void selectandverify(){
      chktxt.click();

  }
	    public void chktxt(){

	    List<WebElement> chktxt=driver.findElements(By.xpath("//h1[@class='nbf_fancyimg_payment_pageheader']"));
	      
	    for (WebElement section :chktxt)

	    {
	        System.out.println(section.getText());
	    
	    }
	    
	    
	   
	    }
  
 public void btnchk(){
        chkbtn.click();

    }

}
