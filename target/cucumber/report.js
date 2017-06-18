$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Newtours.feature");
formatter.feature({
  "line": 1,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Filling Form in NewTours website",
  "description": "",
  "id": "title-of-your-feature;filling-form-in-newtours-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@newtours"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I navigate to newtours",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click \"Register\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I fill the form with data",
  "rows": [
    {
      "cells": [
        "Fields",
        "Value"
      ],
      "line": 9
    },
    {
      "cells": [
        "First_Name",
        "Saparna"
      ],
      "line": 10
    },
    {
      "cells": [
        "Last_Name",
        "Tummalapally"
      ],
      "line": 11
    },
    {
      "cells": [
        "Country",
        "India"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "PageSteps.I_navigate_to_newtours()"
});
formatter.result({
  "duration": 11383801600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 9
    }
  ],
  "location": "PageSteps.I_click(String)"
});
formatter.result({
  "duration": 405025280,
  "status": "passed"
});
formatter.match({
  "location": "PageSteps.I_fill_the_form_with_data(DataTable)"
});
formatter.result({
  "duration": 1666908800,
  "status": "passed"
});
formatter.match({
  "location": "PageSteps.tearDown()"
});
formatter.result({
  "duration": 700609920,
  "status": "passed"
});
});