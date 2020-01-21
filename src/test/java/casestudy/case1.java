package casestudy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import cucumber.api.java.en.Given;

public class case1 {
	WebDriver driver;
	@Given("user opens testme app")
	public void user_opens_testme_app() {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse_browsers\\chromedriver.exe");
		driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
	}

	

	@Given("enter username as {string}")
	public void enter_username_as(String un) { 
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(un);  
	}

	@Given("user enter firstname as {string}")
	public void user_enter_firstname_as(String fn) {
		 driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys(fn);
	}
	

	@Given("enter lastname as {string}")
	public void enter_lastname_as(String ln) {
		 driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys(ln);
	    
	}

	@Given("enter password as {string}")
	public void enter_password_as(String pwd) {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(pwd);
	    
	}

	@Given("enter confirmpassword as {string}")
	public void enter_confirmpassword_as(String cpwd) {
		driver.findElement(By.xpath("//*[@id='pass_confirmation']")).sendKeys(cpwd);
	   
	}

	@Given("select gender")
	public void select_gender() {
		driver.findElement(By.xpath("//*[@id='gender']")).click();
	   
	}

	@Given("enter email address as {string}")
	public void enter_email_address_as(String eadd) {
		 
		  driver.findElement(By.xpath("//*[@id='emailAddress']")).sendKeys(eadd);
	  
	}

	@Given("enter mobilenumber as {string}")
	public void enter_mobilenumber_as(String mob) {
		 driver.findElement(By.xpath("//*[@id='mobileNumber']")).sendKeys(mob);
	 
	}

	@Given("enter dob as {string}")
	public void enter_dob_as(String dob) {
		driver.findElement(By.xpath("//*[@id='dob']")).sendKeys(dob);  
	  
	}

	@Given("enter address as {string}")
	public void enter_address_as(String add) {
		 driver.findElement(By.xpath("//*[@id='address']")).sendKeys(add);
	  
	}

	@Given("select security question")
	public void select_security_question() {
		Select sel=new Select(driver.findElement(By.xpath("//*[@id='securityQuestion']")));
		  sel.selectByIndex(1);
	   
	}

	@Given("enter answer as {string}")
	public void enter_answer_as(String ans) {
		driver.findElement(By.xpath("//*[@id='answer']")).sendKeys(ans);
	   
	}

	@Given("click register")
	public void click_register() {
		  driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
		  Assert.assertEquals("Login",driver.getTitle());
		  System.out.println("User successfully registered");
	    
	}
	@Given("user open testme app")
	public void user_open_testme_app() {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse_browsers\\chromedriver.exe");
		driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	
	@Given("user enters the username as {string}")
	public void user_enters_the_username_as(String un) {
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(un);  
	}

	@Given("user enters the password as {string}")
	public void user_enters_the_password_as(String pd) {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(pd);
	   
	}
	@Given("user click login button")
	public void user_click_login_button() {
		 driver.findElement(By.name("Login")).click();
		  
		  
	   
	}


	@Given("verify Login")
	public void verify_Login() {
		Assert.assertEquals("Home",driver.getTitle());
		  System.out.println("Successfully logged");
	    
	}

	  @Given("user open the testme app")
	  public void user_open_the_testme_app() {
		  System.setProperty("webdriver.chrome.driver","C:\\eclipse_browsers\\chromedriver.exe");
			driver=new ChromeDriver();
			  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	  }

	  @Given("user enters username field as {string}")
	  public void user_enters_username_field_as(String un) {
		  driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(un);
	  }

	  @Given("user select password field as {string}")
	  public void user_select_password_field_as(String pd) {
		  driver.findElement(By.xpath("//*[@id='password']")).sendKeys(pd);
	  }

	  @Given("user clicks login button")
	  public void user_clicks_login_button() {
		  driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	      
	  }

	  @Given("user search for the product")
	  public void user_search_for_the_product() {
		  driver.findElement(By.xpath("//*[@id='myInput']")).sendKeys("Head");
	    
	  }

	  @Given("user clicks Find product")
	  public void user_clicks_Find_product() {
		  driver.findElement(By.xpath("/html/body/div[1]/form/input")).click(); 
	  }

	  @Given("user add the products to cart")
	  public void user_add_the_products_to_cart() {
		  driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	    
	  }

	  @Given("user clicks cart button and view product details")
	  public void user_clicks_cart_button_and_view_product_details() {
		  driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]")).click();
	    
	  }

	  @Given("user clicks the checkout button")
	  public void user_clicks_the_checkout_button() {
		  driver.findElement(By.xpath("//*[@id='cart']/tfoot/tr[2]/td[5]/a")).click();
		  Assert.assertEquals("Cart Checkout",driver.getTitle());
		  System.out.println("added to cart successfully");
	  }

	  
	  @Given("user login to testme app")
	  public void user_login_to_testme_app() {
		  System.setProperty("webdriver.chrome.driver","C:\\eclipse_browsers\\chromedriver.exe");
			driver=new ChromeDriver();
			  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
			  driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("lalitha");
			  driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Password123");
			  driver.findElement(By.name("Login")).click();
	  }

	  @Given("user searches the products")
	  public void user_searches_the_products() {
		  driver.findElement(By.xpath("//*[@id='myInput']")).sendKeys("Headphone");
		  driver.findElement(By.xpath("/html/body/div[1]/form/input")).click(); 
	  }

	  @Given("user proced to payment without adding any item in cart")
	  public void user_proced_to_payment_without_adding_any_item_in_cart() {
		  driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]")).click();
	  }

	  @Given("testme app doesn't display the cart item")
	  public void testme_app_doesn_t_display_the_cart_item() {
		Assert.assertNotEquals("View Cart",driver.getTitle());
	  }




}
