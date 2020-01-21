Feature: Login Process

Scenario Outline: Test Login with multiple set of data
* user open testme app
* user enters the username as "<username1>" 
* user enters the password as "<password2>" 
* user click login button
* verify Login

Examples:
|username1|password2|
|username1234|qwerty|
|lalitha|Password123|