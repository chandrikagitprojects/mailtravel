package stepsdefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageobjects.Basepage;
import pageobjects.confirmpage;
import pageobjects.travelpage;

public class Steps extends Basepage
{
	
	public WebDriver Driver;
	 travelpage tp;
	public confirmpage cp;
	@Given("User should launch {string} browser")
	public void user_should_launch_browser(String browserName) {
		tp=new travelpage();
		tp.setBrowserName(browserName);
        Driver = new ChromeDriver();
        
  
	}

	@When("User launch the {string}")
	public void user_launch_the(String url) {
		Driver.get(url);
        Driver.manage().window().maximize(); 
	}
	

	@Then("User click on Accept Cookies")
	public void user_click_on_accept_cookies() {
	    
	}
	@Then("User type holiday in searchbox\"India\"")
	public void user_type_holiday_in_searchbox_india() {
	
	}
	
	
	@Then("User select first option of serchbox recommendations")
	public void user_select_first_option_of_serchbox_recommendations() {
	    
	}

	@Then("navigate to {string}")
	public void navigate_to(String url) {
	    
	}
	// -------------------------------------------------------
	@Given("User should lauch {string} browser")
	public void user_should_lauch_browser(String string) {
	    
	}

	@Then("User type india in searchbox")
	public void user_type_india_in_searchbox() {
	   
	}

	@Then("User scroll down")
	public void user_scroll_down() {
	    
	}

	@Then("User choose {int} adults")
	public void user_choose_adults(Integer int2) {
	   
	}

	@Then("User select first available date")
	public void user_select_first_available_date() {
	    
	}

	@Then("User validate the price caluculation")
	public void user_validate_the_price_caluculation() {
	   
	}

	@Then("User click on book online button")
	public void user_click_on_book_online_button() {
	    
	}

	@Then("User navigate to holiday accommodation application url\"https:\\/\\/www.mailtravel.co.uk\\/holiday\\/1f5c2c3e-0c48-11ee-aaeb-20677cd381a0\"")
	public void user_navigate_to_holiday_accommodation_application_url_https_www_mailtravel_co_uk_holiday_1f5c2c3e_0c48_11ee_aaeb_20677cd381a0() {
	    
	}

	
	@Then("User expand Date,Departure and passenger section")
	public void user_expand_date_departure_and_passenger_section() {
	    
	}

	@Then("User verify the details are validated")
	public void user_verify_the_details_are_validated() {
	   
	}

	@Then("User click as room required\"{int}\"")
	public void user_click_as_room_required(Integer int1) {
	    
	}

	@Then("User click on Select your room and continue button")
	public void user_click_on_select_your_room_and_continue_button() {
	   
	}

	
@Then("User Navigate to Passenger details Application")
public void user_navigate_to_passenger_details_application() {
    
}

@Then("User enter Passenger info")
public void user_enter_passenger_info() {

	addpassinfo.selecttitle("Mr");
	addpassinfo.firstnamem("Firstname");
	addpassinfo.lastnamem("Lastname");
	addpassinfo.selectdate("10");
	addpassinfo.selectmonth("october");
	addpassinfo.selectyear("1989");
	addpassinfo.selecttitlew("Mrs");
	addpassinfo.firstnamew("Firts");
	addpassinfo.lastnamew("Lasts");
	addpassinfo.selectdayy("12");
	addpassinfo.selectmonthh("December");
	addpassinfo.selectyearr("1989");
	addpassinfo.yourname("Firstname Lastname");
	addpassinfo.mobpohn("07474747474");
	addpassinfo.email("Testing@gmail.com");
    addpassinfo.addres("addr1");
	addpassinfo.address("add2");
	addpassinfo.city("City");
    addpassinfo.postcod("Postcode");
	addpassinfo.Selectdrop("Email");		
	


		}


@Then("user click on continue button")
public void user_click_on_continue_button() {
   
}

@Then("user navigate to confirm details and book application url \"\"https:\\/\\/www.mailtravel.co.uk\\/payment.php?1f5c2c3e-0c48-11ee-aaeb-20677cd381a0\"\"")
public void user_navigate_to_confirm_details_and_book_application_url_https_www_mailtravel_co_uk_payment_php_1f5c2c3e_0c48_11ee_aaeb_20677cd381a0() {
    
}


@Then("User verify confirm details and book text")
public void user_verify_confirm_details_and_book_text() {
}

@Then("user check by click on Book Now button")
public void user_check_by_click_on_book_now_button() {
    
}
}
