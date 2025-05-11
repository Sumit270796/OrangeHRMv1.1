Feature:  Login

Background: 
When   enter url as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

 
Scenario: Login with valid credential
And    User enter username as "Admin" and password as "admin123"
And    Click on Login button 
Then   User navigated page pageTitle should be "OrangeHRM"
And    User click on userdropdown tab
And    Click on LogOut link



Scenario Outline: Login with invalid credential

And     User enter username as "<Username>" and Passwors as "<Password>"
And    Click on Login button 
Then   User should see an "<error message>"
Examples:
|Username    |  Password   |  error message       |
|Admin       | admin12     | Invalid credentials  |
|admin123    | Admin       |  Invalid credentials |
|Admi        | admin123    | Invalid credentials  |
|Admi        | admin12     |   Invalid credentials|

Scenario: Login with valid credential and refresh the page

When   User enter username as "Admin" and password as "admin123"
And    Click on Login button 
Then   User navigated page pageTitle should be "OrangeHRM"
And   User refresh the page
Then   Open page title should be "OrangeHRM"
And    User click on userdropdown tab
And    Click on LogOut link

Scenario: Login with valid credential and open url in new tab then open page title should be OrangeHRM

And   User enter username as "Admin" and password as "admin123"
And    Click on Login button 
Then  Open new tab and enter url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" and PageTitle should be "OrangeHRM"
And    User click on userdropdown tab
And    Click on LogOut link

Scenario: total no of webelement on the page
And    Calculate total number of webelement on the page

Scenario:  Zoom the login page 300% and login through valid credential
When  User zoom the page 300% 
When   User enter username as "Admin" and password as "admin123"
And    Click on Login button 
Then   User navigated page pageTitle should be "OrangeHRM"
And    User click on userdropdown tab
And    Click on LogOut link


Scenario: Login through valid credential and press back and forward the open dashboard page
When   User enter username as "Admin" and password as "admin123"
And    Click on Login button 
When  User press backward and then again press forward 
Then  Open page header should be "Dashboard"
And    User click on userdropdown tab
And    Click on LogOut link


Scenario: Height and width of webpage
And    Get innerHeight and width of webpage 


Scenario: Validate the attribute href of OrangeHRM, Inc. in footer section
And     User mouseHover on the OrangeHRM, Inc. and user should see an href attribute should be "https://www.orangehrm.com/"


 


 