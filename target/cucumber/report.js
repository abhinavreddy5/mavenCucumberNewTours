$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Newtours.feature");
formatter.feature({
  "line": 2,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Filling Form in NewTours website",
  "description": "",
  "id": "title-of-your-feature;filling-form-in-newtours-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@newtours"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I navigate to newtours",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click \"Register\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I fill the form with data",
  "rows": [
    {
      "cells": [
        "Fields",
        "Value"
      ],
      "line": 10
    },
    {
      "cells": [
        "First_Name",
        "Saparna"
      ],
      "line": 11
    },
    {
      "cells": [
        "Last_Name",
        "Tummalapally"
      ],
      "line": 12
    },
    {
      "cells": [
        "Country",
        "India"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "PageSteps.I_navigate_to_newtours()"
});
formatter.result({
  "duration": 52729769600,
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
  "duration": 319887360,
  "status": "passed"
});
formatter.match({
  "location": "PageSteps.I_fill_the_form_with_data(DataTable)"
});
formatter.result({
  "duration": 2308965760,
  "status": "passed"
});
});