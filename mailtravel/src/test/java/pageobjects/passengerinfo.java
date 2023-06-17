package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class passengerinfo {

	  

	WebDriver driver;
 

	   
	   @FindBy(xpath="//select[@id='pax-a-title-1']")
	    WebElement timr;

	    @FindBy(xpath="//input[@id='pax-a-first-1']")
	    WebElement frstm;

	    @FindBy(xpath="//input[@id='pax-a-last-1']")
	    WebElement lastm;

	    @FindBy(xpath="//select[@id='pax-a-dobd-1']")
	    WebElement daym;

	    @FindBy(xpath="//select[@id='pax-a-dobm-1']")
	    WebElement monthm;


	   @FindBy(xpath="//select[@id='pax-a-doby-1']")
	    WebElement yearm;

	    @FindBy(xpath="//select[@id='pax-a-title-2']")
	    WebElement timrs;

	    @FindBy(xpath="//input[@id='pax-a-first-2']")
	    WebElement frstw;

	    @FindBy(xpath="//input[@id='pax-a-last-2']")
	    WebElement lastw;

	    @FindBy(xpath="//select[@id='pax-a-dobd-2']")
	    WebElement dayw;


	   @FindBy(xpath="//select[@id='pax-a-dobm-2']")
	    WebElement monthw;

	    @FindBy(xpath="//select[@id='pax-a-doby-2']")
	    WebElement yearw;

	    @FindBy(xpath="//input[@id='contact-name']")
	    WebElement urnm;

	    @FindBy(xpath="//input[@id='contact-mobile']")
	    WebElement mbph;

	    @FindBy(xpath="//input[@id='contact-email']")
	    WebElement mail;

	    @FindBy(xpath="//input[@id='contact-address1']")
	    WebElement add1;


	   @FindBy(xpath="//input[@id='contact-address2']")
	    WebElement addw;

	    @FindBy(xpath="//input[@id='contact-city']")
	    WebElement cty;

	    @FindBy(xpath="//input[@id='contact-postcode']")
	    WebElement pstcd;

	    @FindBy(xpath="//select[@id='contact-hearabout']")
	    WebElement dd;

	    @FindBy(xpath="//div[@class='nbf_fancy_paxButton nbf_fg_pms_button_text ']")
	    WebElement btn;

	  public passengerinfo(WebDriver driver){
	        this.driver=driver;
	        PageFactory.initElements(driver,this);
	        
	    }

	 public void selecttitle(String Mr ){
	     timr.click();
	     Select title = new Select(driver.findElement(By.xpath("//select[@id='pax-a-title-1']")));
	     title.selectByVisibleText(Mr);
	 }
	 
	 public void firstnamem(String Firstname){
	        frstm.sendKeys(Firstname);

	 }
	 public void lastnamem(String Lastname){
	        lastm.sendKeys(Lastname);
	 }
	 public void selectdate(String ten ){
	     daym.click();
	     Select date = new Select(driver.findElement(By.xpath("//select[@id='pax-a-dobd-1']")));
	     date.selectByVisibleText(ten);
	 }

	public void selectmonth(String October ){
	     monthm.click();
	     Select month = new Select(driver.findElement(By.xpath("//select[@id='pax-a-dobm-1']")));
	     month.selectByVisibleText(October);
	}

	public void selectyear(String yyym ){
	     yearm.click();
	     Select year = new Select(driver.findElement(By.xpath("//select[@id='pax-a-doby-1']")));
	     year.selectByVisibleText(yyym);
	}

	public void selecttitlew(String Mrs ){
	     timrs.click();
	     Select titlew = new Select(driver.findElement(By.xpath("//select[@id='pax-a-title-2']")));
	     titlew.selectByVisibleText(Mrs);
	 }
	 
	 public void firstnamew(String firsts){
	       frstw.sendKeys(firsts);
	 }


	 public void lastnamew(String lasts){
	        lastw.sendKeys(lasts);
	 }

	 public void selectdayy(String twelve ){
	     dayw.click();
	     Select dayy = new Select(driver.findElement(By.xpath("//select[@id='pax-a-dobd-2']")));
	     dayy.selectByVisibleText(twelve);
	 }

	public void selectmonthh(String December ){
	     monthw.click();
	     Select monthh = new Select(driver.findElement(By.xpath("//select[@id='pax-a-dobm-2']")));
	     monthh.selectByVisibleText(December);
	}

	public void selectyearr(String yyww ){
	     yearw.click();
	     Select yearr = new Select(driver.findElement(By.xpath("//select[@id='pax-a-doby-2']")));
	     yearr.selectByVisibleText(yyww);
	}

	public void yourname(String string){
		StringBuffer sb=new StringBuffer()
	                   .append("Firstname").append(" ").append("Lastname");
	urnm.sendKeys(sb);
	}


	 public void mobpohn(String mobileph){
	   mbph.sendKeys(mobileph);
	 }

	public void email(String string){
		StringBuffer sb1=new StringBuffer()
                .append("testing").append("@").append("gmail").append(".").append("com");
		mail.sendKeys(sb1);
	}

	 public void addres(String addr1){
	  add1.sendKeys(addr1);
	 }

	public void address(String add2){
	 addw.sendKeys(add2);
	}


	 public void city(String City){
	  cty.sendKeys(City);
	 }

	public void postcod(String postcode){
	  pstcd.sendKeys(postcode);
	}

	public void Selectdrop(String Email ){
	     dd.click();
	     Select drop = new Select(driver.findElement(By.xpath("//select[@id='contact-hearabout']")));
	     drop.selectByVisibleText(Email);
	}

	public void button(){
	   btn.click();
	}

	
		
	}



