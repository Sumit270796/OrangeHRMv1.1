Feature: total no of webelement on dashboard page

Scenario: Count no of webelement on the dashboard page


When    enter url as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
And    User enter username as "Admin" and password as "admin123"
And    Click on Login button 
And    total no of webelement on the page

@Sanity
Scenario: Count no of hyperlinks dashboard page
When    enter url as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
And    User enter username as "Admin" and password as "admin123"
And    Click on Login button 
And    Validate total number of hyperlink on the page
And    Validate the total number of imagelinks
And    User add a cookie
And   Get total cookie and their  value
And   when hover on help button then Help title should be shown