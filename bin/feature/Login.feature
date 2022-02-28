Feature: Admin Login

Scenario Outline: Verify admin Login Functionality

Given User Should on RHP

When User Enters "<userName>" and "<Password>"

Then User Validates Admin Login

When User Close the Application

Examples:

    | userName | Password |
    | Admin | Te$ting@ |

   