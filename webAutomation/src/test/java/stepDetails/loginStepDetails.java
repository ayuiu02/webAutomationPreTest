package stepDetails;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class loginStepDetails {
	
	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() {
		String driverPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", driverPath+"/src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("User is on BukaLapak landing page")
	public void user_is_on_buka_lapak_landing_page() {
		driver.navigate().to("https://www.bukalapak.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("User click on Login page navigation")
	public void user_click_on_login_page_navigation() {
		driver.findElement(By.linkText("Login")).click();
	}

	@And("User enter valid email in email field")
	public void user_enter_valid_email_in_email_field() {
		driver.findElement(By.id("user_session_username")).sendKeys("testingesd123@gmail.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("User enter valid password in password field")
	public void user_enter_valid_password_in_password_field() {
		driver.findElement(By.id("user_session_password")).sendKeys("testing123");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("User click on Login button")
	public void user_click_on_login_button() {
		driver.findElement(By.name("commit")).click();
	}

	@Then("User should be able to see Favorit page navigation")
	public void user_should_be_able_to_see_favorit_page_navigation() {
		driver.getPageSource().contains("Favorit");
	}

	@And("User should be able to see Transaksi page navigation")
	public void user_should_be_able_to_see_transaksi_page_navigation() {
		driver.getPageSource().contains("Transaksi");
	}

	@And("User should be able to see Pesan page navigation")
	public void user_should_be_able_to_see_pesan_page_navigation() {
		driver.getPageSource().contains("Pesan");
	}

	@And("User should be able to see Notifikasi page navigation")
	public void user_should_be_able_to_see_notifikasi_page_navigation() {
		driver.getPageSource().contains("Notifikasi");
	}

	@And("User enter invalid password in passsword field")
	public void user_enter_invalid_password_in_passsword_field() {
		driver.findElement(By.id("user_session_password")).sendKeys("invalid123");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Then("User should be able to see alert message")
	public void user_should_be_able_to_see_alert_message() {
		driver.getPageSource().contains("Username atau password yang kamu masukkan salah. Silakan coba lagi.");
	}

	@And("User should still in Login page")
	public void user_should_still_in_login_page() {
		driver.getPageSource().contains("Silakan masuk ke dalam akun kamu");
		driver.findElement(By.name("commit")).isDisplayed();
	}

	@And("User enter invalid email in email field")
	public void user_enter_invalid_email_in_email_field() {
		driver.findElement(By.id("user_session_username")).sendKeys("invalidemail@gmail.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("User does not type any email in email field")
	public void user_does_not_type_any_email_in_email_field() {
		driver.findElement(By.id("user_session_username")).sendKeys("");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("User filled password field")
	public void user_filled_password_field() {
		driver.findElement(By.id("user_session_password")).sendKeys("checkEmailEmpty");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("User filled email field")
	public void user_filled_email_field() {
		driver.findElement(By.id("user_session_username")).sendKeys("checkPasswordEmpty");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("User does not type any password in password field")
	public void user_does_not_type_any_password_in_password_field() {
		driver.findElement(By.id("user_session_password")).sendKeys("");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@And("User should be able to see alert message that user is not detected")
	public void user_should_be_able_to_see_alert_message_that_user_is_not_detected() {
		driver.getPageSource().contains("Akun dinonaktifkan");
		driver.findElement(By.name("commit")).isDisplayed();
	}

}
