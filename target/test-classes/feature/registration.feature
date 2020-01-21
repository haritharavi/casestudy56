Feature: Registration Process

Scenario Outline: Test registration with multiple set of data
* user navigate to registration process
* user enter username as "<username>"
* user enter password as "<password>"
* user enter confirm password as "<confirm_password>"
* user clicks submit button
* verify registration

Examples:
|username|password|confirm_password|
|hari|thahari|thahari|
|that|istist|istist|

