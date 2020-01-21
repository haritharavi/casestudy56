$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/feature2.feature");
formatter.feature({
  "name": "test login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": ":Login_valid_data",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "open newtours application",
  "keyword": "* "
});
formatter.match({
  "location": "login.open_newtours_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter username in username field as \"mercury\"",
  "keyword": "* "
});
formatter.match({
  "location": "login.enter_username_in_username_field_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password in password field as \"mercury\"",
  "keyword": "* "
});
formatter.match({
  "location": "login.enter_password_in_password_field_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click ok",
  "keyword": "* "
});
formatter.match({
  "location": "login.click_ok()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify login success",
  "keyword": "* "
});
formatter.match({
  "location": "login.verify_login_success()"
});
formatter.result({
  "status": "passed"
});
});