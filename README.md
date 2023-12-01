# testing_the_browser_with_Selenium_POM
My task was:

## Practice: Create Stable Automated Tests

### General Rules:

Don't use Selenium in JUnit tests, only in keywords or POM.
Don't use assertation in keywords, assert in the test methods.
Solve every exercises with POM and Keyword Driven methods too
Lets get back to the roots! Recreate your former tests as a new project, with Keyword-Driven Testing, Data-Driven Testing and POM (implement at least the Extensions tasks for each excercise).

#### First exercise - Navigation:

Open the base url. Using the "Menu List" navigate to All Examples/Input Forms/Simpe Form Demo
Base url: https://web.archive.org/web/20180926132852/http://www.seleniumeasy.com/test/basic-first-form-demo.html
Extension: Create reusable navigation keyword (and reuse it :])

#### Second exercise - Single field & Button:

Navigate to Simpe Form Demo. In "Single Input Field" enter a message into the field and click "Show Message" button. Validate that the message appeared.
Extension: fill the field data-driven way, use a source file for it

#### Third exercise - Two fields & Output:

Navigate to Simpe Form Demo. In "Two Input Fields" enter value A and B and click the "Get Total" button. Validate that the answer is correct.
Does your test works even when you enter very large numbers?
Extension: use at least 5 rows from data source with expected results, make positive and negative tests (1, a, expected 1a - failing test)

#### Fourth exercise - Checkbox:

Navigate to Checkbox Demo. In "Single Checkbox Demo" check the checkbox and validate the message.
Bonus if you write a test for "Multiple Checkbox Demo" and find the bug which is present on the webpage.
Extension: create a data source with at least 5 rows, with input combinations for checkbox (something like 1,0,1,0 should tick the 2nd and 4th checkboxes), dont forget validations
