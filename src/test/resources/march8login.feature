Feature: Adactin Login Functionality
Scenario Outline: User should be in the Adactin webpage
Given User should be in the URL webpage
When User Should enters "<Username>" and "<Password>"
Then User Should click on the button
And User Should received login sucessfully message

Examples:
|Username      |Password|
|sandhyasaurabh|123456789|