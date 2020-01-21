package test1;

import cucumber.api.java.en.Given;

public class tags {
	@Given("login details")
	public void login_details() {
	   System.out.println("login");
	}

	@Given("user search for products")
	public void user_search_for_products() {
		System.out.println("search");
	    
	}

	@Given("user add the product to cart")
	public void user_add_the_product_to_cart() {
		System.out.println("addcart");
	   
	}

	@Given("payment done for the products")
	public void payment_done_for_the_products() {
		System.out.println("payment");
	}



}
