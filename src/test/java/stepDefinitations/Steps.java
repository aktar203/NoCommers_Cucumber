package stepDefinitations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageoObjects.LogInPage;

public class Steps {

	public WebDriver driver;
	public LogInPage lp;

	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("WebDriver.Chrome.driver","C:\\Dev\\DevTools.exe");
		driver = new ChromeDriver();
	}

	@Given("user open url {string}")
	public void user_open_url(String string) {

		driver.get(string);

	}

	@When("user enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String pwd) {
		lp.setuserName(email);
		lp.setuserPassword(pwd);
	}

	@When("click on login")
	public void click_on_login() {
		lp.clickLogin();

	}

	@Then("page Title should be {string}")
	public void page_title_should_be(String string) {

		if (driver.getPageSource().contains("Log In was Successful")) {
			driver.close();

		}

	}

	@When("user click on log out link")
	public void user_click_on_log_out_link() throws InterruptedException {

		lp.clickLogOut();
		Thread.sleep(3000);

	}

	@When("close the browser")
	public void close_the_browser() {
		driver.close();

	}

}
