README for Selenium UI and Rest Assured API Test Cases.

1. Project Overview
   This project contains automated test cases for both UI and API testing, using:
   Selenium WebDriver, BD cucumber, Gherkin and Java for testing the web application's user interface.
   Rest Assured, Gherkin and Java for testing the application's REST APIs.
   These test cases are designed to ensure the functionality, performance, and reliability of both the UI and API layers of the application.
2. Technologies Used
   Programming Language: Java (or specify another language if used)
   Test Framework: JUnit, BD Cucumber
   UI Testing Tool: Selenium WebDriver
   API Testing Tool: Rest Assured
   Build Tool: Maven (or Gradle)
   Reporting Tool: aventstack Extent Reports external plugin 
   CI/CD: No
   Version Control: No
3. Project Structure
   bash
   Copy code
   src
   │───main
   │   └───java
   │       └───com.airalo.website.ui.test
   |            └───dockHooks
   |            └───factory
   |            └───pageObjects
   |            └───pageResources
   |            └───utils
   └───test
   |    └───java
   |        └───com.airalo.website.ui.test
   |            └───runner
   |            └───stepsDefs
   |        └───resources
   |            └───features
   |                └───ui_tests        # UI Test cases using Selenium
   |                └───api_tests       # API Test cases using Rest Assured
   └───target
   └───test-output      # Test out reports
       └───cucumber-reports
       └───Html-reports
       └───Pdf-reports

4. Prerequisites
   Java Development Kit (JDK): Ensure JDK 8 or higher is installed.
   Download it from Oracle.
   Maven: You must have Apache Maven installed for building the project.
   Installation guide: Maven Installation.
   IDE: Recommended to use IntelliJ IDEA for development and running the tests.
5. Setup Instructions
   Clone the Repository
   git clone https://github.com/your-repository-url.git
   cd project-directory
   Install Dependencies
   The project uses Maven for dependency management. Run the following command to install dependencies:
   mvn clean install
   java
   API Base URL
   RestAssured.baseURI = "https://sandbox-partners-api.airalo.com";
   
6. Running the Tests
   Run All Tests (UI & API):
   Use Maven to run all tests with the following command:
   mvn -Dtest= test
   You can run test cases for ui and api using TestRunner file as well. 

7. Test Reports
   The html, pdf and json format reports are generated using aventstack extent reports external plugin.
   After running the tests, reports will be generated in the test-output the designated reporting folder. 
   you can view reports in the following locations:
   test-output/ 

8. CI Integration
   No
9. Troubleshooting
   Issue: All the UI and API test cases must be executed together as once. I have designed framework that UI and API test cases are running together.
   Issue: UI and API test cases can not run separately using tags in feature files. In this case it will fail.
11. Contact
    For any questions or support regarding this project, please reach out to mfiazlatif786@gmail.com.