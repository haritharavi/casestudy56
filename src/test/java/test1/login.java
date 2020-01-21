package test1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;


public class login {
	WebDriver driver;
	@Given("open newtours application")
	public void open_newtours_application() {
		
		System.out.println("open newtours application");
		System.setProperty("webdriver.chrome.driver","C:\\eclipse_browsers\\chromedriver.exe");
		  driver=new ChromeDriver();
		 // driver.manage().window().maximize();
		  driver.get("http://newtours.demoaut.com/");
		
	}

	@Given("enter username in username field")
	public void enter_username_in_username_field() { 
		System.out.println("enter username in username field");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		
	   
	}

	@Given("enter password in password field")
	public void enter_password_in_password_field() {
		System.out.println("enter password in password field");
		driver.findElement(By.name("password")).sendKeys("mercury");
	   
	}

	@Given("click ok")
	public void click_ok() {
		System.out.println("click ok");
		driver.findElement(By.name("login")).click();
	    
	}

	@Given("verify login success")
	public void verify_login_success() {
		System.out.println("verify login success");
	   
	}
	@Given("enter username in username field as {string}")
	public void enter_username_in_username_field_as(String un) {
		System.out.println("username as" +un);
		driver.findElement(By.name("userName")).sendKeys(un);
		
	}

	@Given("enter password in password field as {string}")
	public void enter_password_in_password_field_as(String pwd) {
		System.out.println("password as" +pwd);
		driver.findElement(By.name("password")).sendKeys(pwd);
	}
	
	
	
	
	@Given("user navigate to registration process")
	public void user_navigate_to_registration_process() {
	    System.out.println("user enters Registration page");
	    System.setProperty("webdriver.chrome.driver","C:\\eclipse_browsers\\chromedriver.exe");
		  driver=new ChromeDriver();
		 // driver.manage().window().maximize();
		  driver.get("http://newtours.demoaut.com/");
		  driver.findElement(By.linkText("REGISTER")).click();
	}

	@Given("user enter username as {string}")
	public void user_enter_username_as(String un) {
		driver.findElement(By.name("email")).sendKeys(un);
		
	   
	}

	@Given("user enter password as {string}")
	public void user_enter_password_as(String pwd) {
		driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@Given("user enter confirm password as {string}")
	public void user_enter_confirm_password_as(String cpwd) {
		driver.findElement(By.name("confirmPassword")).sendKeys(cpwd);
	}

	@Given("user clicks submit button")
	public void user_clicks_submit_button() {
		  driver.findElement(By.name("register")).click();
	   
	}

	@Given("verify registration")
	public void verify_registration() {
	  Assert.assertEquals("Register: Mercury Tours",driver.getTitle());
	  System.out.println("Registration done");
	}



}
