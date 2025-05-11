Feature:  AddEmployee


Scenario: Add Employee with valid info

When    enter url as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
And     User enter username as "Admin" and password as "admin123"
And     Click on Login button 
And     User click on PIM link
And     User click on AddEmployee link
And     User enter firstName as "Rakhi" MiddleName as "Kumari" and lastName as "Kushwaha" and Employee id as "258655"
And     User click on save button
And     User should see an toastMsg Success
And     User click on userdropdown tab
And     Click on LogOut link



