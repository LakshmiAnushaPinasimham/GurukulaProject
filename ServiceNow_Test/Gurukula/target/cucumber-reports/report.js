$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/features/Staff.Feature");
formatter.feature({
  "line": 2,
  "name": "Staff",
  "description": "\r\nAs a Gurkula user, I should be able to create staff details",
  "id": "staff",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@RegressionTest"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Create Staff",
  "description": "",
  "id": "staff;create-staff",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@CreateStaff"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I launch the Gurukula Application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on Login",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter the login details \"admin\" and \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on Entities to create Branch",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I filled the branch details",
  "rows": [
    {
      "cells": [
        "Name",
        "",
        "Code"
      ],
      "line": 13
    },
    {
      "cells": [
        "Maths",
        "",
        "MAT04"
      ],
      "line": 14
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on Entities to create Staff",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I filled the Staff details",
  "rows": [
    {
      "cells": [
        "Name",
        "",
        "Branch"
      ],
      "line": 17
    },
    {
      "cells": [
        "Anusha",
        "",
        "Maths"
      ],
      "line": 18
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Staff details should be created sucessfully",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationSteps.i_launch_the_Gurukula_Application()"
});
formatter.result({
  "duration": 6273662122,
  "status": "passed"
});
formatter.match({
  "location": "AuthenticationSteps.i_click_on_Login()"
});
formatter.result({
  "duration": 134103818,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 27
    },
    {
      "val": "admin",
      "offset": 39
    }
  ],
  "location": "AuthenticationSteps.i_enter_the_login_details_and(String,String)"
});
formatter.result({
  "duration": 364201892,
  "status": "passed"
});
formatter.match({
  "location": "BranchesSteps.i_click_on_Entities_to_create_Branch()"
});
formatter.result({
  "duration": 1223838778,
  "status": "passed"
});
formatter.match({
  "location": "BranchesSteps.i_filled_the_branch_details(DataTable)"
});
formatter.result({
  "duration": 766045084,
  "status": "passed"
});
formatter.match({
  "location": "StaffSteps.i_click_on_Entities_to_create_Staff()"
});
formatter.result({
  "duration": 1229203033,
  "status": "passed"
});
formatter.match({
  "location": "StaffSteps.i_filled_the_Staff_details(DataTable)"
});
formatter.result({
  "duration": 1608100607,
  "status": "passed"
});
formatter.match({
  "location": "StaffSteps.staff_details_should_be_created_sucessfully()"
});
formatter.result({
  "duration": 320618172,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "View Staff Details",
  "description": "",
  "id": "staff;view-staff-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@ViewStaff"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "I click on View",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I should be able to see staff details",
  "keyword": "Then "
});
formatter.match({
  "location": "BranchesSteps.i_click_on_View()"
});
formatter.result({
  "duration": 1139478337,
  "status": "passed"
});
formatter.match({
  "location": "StaffSteps.i_should_be_able_to_see_staff_details()"
});
formatter.result({
  "duration": 176809602,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Edit Branch Details",
  "description": "",
  "id": "staff;edit-branch-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@EditBranch"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "I click on Back",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I click on Edit and enter my new staff details \"Ramesh\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "new staff details should be replaced with old",
  "keyword": "Then "
});
formatter.match({
  "location": "BranchesSteps.i_click_on_Back()"
});
formatter.result({
  "duration": 267972436,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ramesh",
      "offset": 48
    }
  ],
  "location": "StaffSteps.i_click_on_Edit_and_enter_my_new_staff_details(String)"
});
formatter.result({
  "duration": 895940117,
  "status": "passed"
});
formatter.match({
  "location": "StaffSteps.new_staff_details_should_be_replaced_with_old()"
});
formatter.result({
  "duration": 2048089284,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Delete Staff",
  "description": "",
  "id": "staff;delete-staff",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@DeleteStaff"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "I click on Delete",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "Staff details should get deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "BranchesSteps.i_click_on_Delete()"
});
formatter.result({
  "duration": 670365996,
  "status": "passed"
});
formatter.match({
  "location": "StaffSteps.staff_details_should_get_deleted()"
});
formatter.result({
  "duration": 3361411145,
  "status": "passed"
});
});