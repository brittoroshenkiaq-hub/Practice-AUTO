package Step_Definition;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base_Class.Base_Class;
import Pom_Class.Pom_Class;
import io.cucumber.java.en.*;

public class Step_Definition extends Base_Class {
	
	Pom_Class cal = new Pom_Class(driver);
	
	@Given("User is on home page")
	public void user_is_on_home_page() {
	    Assert.assertTrue(getTitle().contains("Internet"));
	}
	@When("User click on Content")
	public void user_click_on_content() {
		Assert.assertTrue(cal.content.isDisplayed());
	    click(cal.content);
	}
	@When("User clicks on click here button")
	public void user_clicks_on_click_here_button() {
     Assert.assertTrue(cal.Clickhere.isEnabled());
     click(cal.Clickhere);
	}
	@Then("User verify the changes after user click here button")
	public void user_verify_the_changes_after_user_click_here_button() {
		Assert.assertTrue(geturl().contains("the-internet"));

		
	}

	@When("the user comes back")
	public void the_user_comes_back() {
	    for(int i =0; i<2; i++) {
	    	back();
	    }
	}
	
	@When("user click on Dynamic Controls")
	public void user_click_on_dynamic_controls() {
		Assert.assertTrue(cal.DynamicControls.isDisplayed());
		click(cal.DynamicControls);
	}
	@When("user click Add or Remove Checkbok")
	public void user_click_add_remove_checkbok() {
		Assert.assertTrue(cal.checkbox.isEnabled());
		click(cal.checkbox);
	
	   
	}
	@When("user click the Remove button")
	public void user_click_the_remove_button() {
		Assert.assertTrue(cal.RemoveBox.isDisplayed());
		click(cal.RemoveBox);
		
	    
	}
	@Then("user verify the its gone text")
	public void user_verify_the_it_s_gone_text(){
		wait.until(ExpectedConditions.visibilityOf(cal.ItsgoneText));
		Assert.assertTrue(cal.ItsgoneText.isDisplayed());
	}
	@Then("user click the Add button")
	public void user_click_the_add_button() {
		Assert.assertTrue(cal.addbox.isEnabled());
		click(cal.addbox);
	    
	}
	@Then("user verify the its back text")
	public void user_verify_the_it_s_back_text() {
		wait.until(ExpectedConditions.visibilityOf(cal.ItsgoneText));
	    Assert.assertTrue(cal.itsbackText.isDisplayed());
	}
	@Then("user click the Enable button")
	public void user_click_the_enable_button() {
		 Assert.assertTrue(cal.EnableButton.isEnabled());
		click(cal.EnableButton);
	   
	    
	}
	@Then("user verify the its disabled text")
	public void user_verify_the_it_s_enabled_text() {
		wait.until(ExpectedConditions.visibilityOf(cal.ItsDisabledText));
	    Assert.assertTrue(cal.ItsDisabledText.isDisplayed());
	}
	@Then("user click the Disable button")
	public void user_click_the_disable_button() {
		wait.until(ExpectedConditions.visibilityOf(cal.ItsgoneText));
		Assert.assertTrue(cal.DisableButton.isEnabled());
	    click(cal.DisableButton);
	}
	@Then("user verify the its enabled text")
	public void user_verify_the_it_s_disabled_text() {
		Assert.assertTrue(cal.ItsEnabledText.isDisplayed());
		
	}
		@Given("User is on entry add home page")
		public void user_is_on_entry_add_home_page() {
			back();

		}
		@When("User clicks on the Entry Ad option")
		public void user_clicks_on_the_entry_ad_option() {
			Assert.assertTrue(cal.EntryAd.isEnabled());
			click(cal.EntryAd);
		    
		}
		@When("user clicks on the Click Here link in the Entry Ad")
		public void user_clicks_on_the_click_here_link_in_the_entry_ad() {
			Assert.assertTrue(cal.clickHere.isEnabled());
			click(cal.clickHere);
		    
		}
		@When("user clicks the Close button on the Entry Ad popup")
		public void user_clicks_the_close_button_on_the_entry_ad_popup() {
			Assert.assertTrue(cal.Close.isEnabled());
			click(cal.Close);
		    
		

		
	    
	}
	
	
	

	
	
	
	
	
}
