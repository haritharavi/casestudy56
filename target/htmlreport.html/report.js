$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/cucum_casestudy/casestudy4.feature");
formatter.feature({
  "name": "Moves to cart without adding any item",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "The one where the user moves to cart without adding any item in ti",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user login to testme app",
  "keyword": "* "
});
formatter.match({
  "location": "case1.user_login_to_testme_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches the products",
  "keyword": "* "
});
formatter.match({
  "location": "case1.user_searches_the_products()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user proced to payment without adding any item in cart",
  "keyword": "* "
});
formatter.match({
  "location": "case1.user_proced_to_payment_without_adding_any_item_in_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "testme app doesn\u0027t display the cart item",
  "keyword": "* "
});
formatter.match({
  "location": "case1.testme_app_doesn_t_display_the_cart_item()"
});
formatter.result({
  "status": "passed"
});
});