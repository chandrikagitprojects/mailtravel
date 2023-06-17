package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class holidayaccommodation {
	  WebDriver driver;

	   

	   
	 @FindBy(xpath="//h2[normalize-space()='1. Date, Departure & Passengers']")
	    WebElement mainsection;

	    @FindBy(xpath="//select[@id='room-1859920-numselect']")
	    WebElement rooms;

	    @FindBy(xpath="//div[@class='nbf_fancy_nbf_tpl_pms_book_room nbf_fg_pms_button_text ']")
	    WebElement selectroncon;

	  public void travelPage(WebDriver driver){
	        this.driver=driver;
	        PageFactory.initElements(driver,this);
	        
	    }



	public holidayaccommodation(WebDriver driver){
	        this.driver=driver;
	        PageFactory.initElements(driver,this);
	    }

	public void selectandverify(){
        mainsection.click();

    }
	    public void mainsection(){

	    List<WebElement> mainsection=driver.findElements(By.xpath(".//table[@class='table']"));
	      
	    for (WebElement section :mainsection)

	    {
	        System.out.println(section.getText());
	    
	    }
	    
	    
	   
	    }
	public void selectroom(String one ){
	        rooms.click();
	        Select rooms = new Select(driver.findElement(By.xpath("//select[@id='numAdults-f0050aa159413059b0d39248658bdb50']")));
	        rooms.selectByVisibleText(one);
	   	
}
	public void selectroomandconf(){
    selectroncon.click();
	}

}
