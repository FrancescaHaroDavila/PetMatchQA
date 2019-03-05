$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("RegisterUser.feature");
formatter.feature({
  "line": 4,
  "name": "Scenario of new user",
  "description": "",
  "id": "scenario-of-new-user",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@pettinder"
    },
    {
      "line": 2,
      "name": "@registerUser"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Register a new user",
  "description": "",
  "id": "scenario-of-new-user;register-a-new-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I open the app",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Click Register Now button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Type the user name \"\u003cname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Type the email \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Type the password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Re-Type the password \"\u003cpassword2\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Click Register button",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "scenario-of-new-user;register-a-new-user;",
  "rows": [
    {
      "cells": [
        "name",
        "email",
        "password",
        "password2"
      ],
      "line": 17,
      "id": "scenario-of-new-user;register-a-new-user;;1"
    },
    {
      "cells": [
        "Carlo",
        "carlo@hotmail.com",
        "123456",
        "123456"
      ],
      "line": 18,
      "id": "scenario-of-new-user;register-a-new-user;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "Register a new user",
  "description": "",
  "id": "scenario-of-new-user;register-a-new-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@pettinder"
    },
    {
      "line": 2,
      "name": "@registerUser"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I open the app",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Click Register Now button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Type the user name \"Carlo\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Type the email \"carlo@hotmail.com\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Type the password \"123456\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Re-Type the password \"123456\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Click Register button",
  "keyword": "Then "
});
formatter.match({
  "location": "registerUserSteps.iOpenTheApp()"
});
formatter.result({
  "duration": 19250730033,
  "status": "passed"
});
formatter.match({
  "location": "registerUserSteps.clickRegisterNowButton()"
});
formatter.result({
  "duration": 858520757,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Carlo",
      "offset": 20
    }
  ],
  "location": "registerUserSteps.typeTheUserName(String)"
});
formatter.result({
  "duration": 5596310389,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "carlo@hotmail.com",
      "offset": 16
    }
  ],
  "location": "registerUserSteps.typeTheEmail(String)"
});
formatter.result({
  "duration": 9574088585,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 19
    }
  ],
  "location": "registerUserSteps.typeThePassword(String)"
});
formatter.result({
  "duration": 10103733382,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 22
    }
  ],
  "location": "registerUserSteps.reTypeThePassword(String)"
});
formatter.result({
  "duration": 8923703219,
  "status": "passed"
});
formatter.match({
  "location": "registerUserSteps.clickRegisterButton()"
});
formatter.result({
  "duration": 1518064371,
  "status": "passed"
});
});