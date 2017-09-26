# Section A: HelloPay Test Framework Sample
> Installation Instructions for Automation Test Framework on `http://www.lazada.vn/`

## Libraries
- Selenium Webdriver (Interact with WebElement)
- Cucumber-JVM (BDD with gherkin language binding Java)
- Hamcrest-Junit (Use for assertion/verify result)
- Cucumber HTML Report (Generating Cucumber pretty report)
- Apache Log4J (Generating Log)

## Installation
1/ Clone this repo to your local

2/ Install requirements
- Install JAVA environment on your PC
- Install IntelliJ IDE lastest version. (Plugin include: Cucumber for Java)
- Install Maven (https://www.mkyong.com/maven/how-to-install-maven-in-windows/)(Optional If you run direct by TestNG)
 
3/ Open Project
- Import this project as Maven project
- Synchronize pom.xml file

4/ Execute  this command to run all the test scenarios (test cases) in the feature file
```sh
mvn clean test
```
Note:
- If maven can't build project and run the test the issue maybe in `setting.xml` file on your local `m2repository`. You can run directly by TestNG with file `SampleTest.xml` on package `src/test/resources/xmlsuite` (right click on this file to open menu> click on RUN)

## Viewing Test report
- Open file `*/target/cucumber-html-reports/overview-features.html` on any browser

## Testcases
##### 1/ Create Customer Exception case - Create Existed Customer
- Open Lazada Register page and verify user is at this page
- Fill and select all Fields with Existed customer's infomation
- Click on "Submit" button
- Verify error message is correct and user can't create new Customer

##### 2/ Search with Keyword and Verify result
- Open Lazada Homepage and verify user is at this page
- Enter search Keyword
- Click on "Search" button
- Verify all search result item follow search rule (Currently just set simple rule - isContainKeyword)

## File & Folder Structure
**main package**
+ `common` contains all file for helping methods\functions (Constants, AutomationConfig, PageUtils action,...)
+ `models` contains all POJO defination
+ `manage` constains all manage class (DriverFactory, CustomListener, ReportManager)
+ `pageobject` contains all PageObject Class

**test package**
+ `runner` contains all Cucumber runner file 
+ `features` contains all the feature file (scenario/test cases are put inside each feature file )
+ `stepdefination` contains all step definitions for feature files

# Section B: Answering the question 
1/ Test Automation is essentially using code to create programs that perform automated tests for your software. The way this is different from manual testing is, instead of actually performing the test, one creates an automated testing scenario and supervises it. Test automation is extensively used for regression testing, which seeks out new bugs in a program and separates them. Regression tests are generally extremely tedious and time consuming. Here is where automated tests come in and make life easy for a software testing professional. Apart from this code-driven testing type, the other arena for automated testing is user environment simulation. Testing software can be created to replicate typical user environment using automated keystrokes and mouse clicks. The software GUI response is recorded and analysed as per the automated input.

2/The characteristics of good automation framework are:

Modular – The framework should be adaptable to change. Testers should be able to modify the scripts as per the environment or login information change
Reusable – The commonly used methods or utilities should be written in a common file which is accessible to all the scripts.
Consistent – The suite should be written in a consistent format by following all the accepted coding practices.
Independent – The scripts should be written in such a way that they are independent of each other. In case one test fails, it should not holdback remaining test cases (unless it is a login page)
Logger – It is good to have implemented the logging feature in the framework. This would help in case our scripts run for longer hours (say nightly mode), if the script fails at any point of time, having the log file will help us to detect the location and the type of error.
Reporting – It is good to have reporting feature automatically embedded into the framework. Once the scripting is done, we can have the results and reports sent via an email.
Integration – Automation framework should be such that it is easy to integrate it with other application like continuous integration or triggering the automated script as soon as the build is deployed.

## Meta

Qui Pham - [Email](mailto:qui.phamnhu@gmail.com) - [Github](https://github.com/quipham)
