### Create TestCase using JUnit Jupiter

1. Go to Testing Explorer
2. Install Additional Test Extentions...
    * Select Test Runner for Java
    * Install
3. Enable Java Tests
    * Select JUnit jupiter
    * a lib directory will be created with the jar file.
4. Generate Tests
    * Right click on the class that you want to generate a test class
    * Select Source Action..
    * Select Generate Tests...
    * Select JUnit 5
    * Select method to test
    * Enter
    * A test class will be created
5. Create a Tests directory (Optional - This is for organization)
    * Move the test class to Tests directory. 

![JUnit jupiter](/InterviewExample/Tests/images/junit_1.png)
<p>&nbsp; </p>

![JUnit jupiter](/InterviewExample/Tests/images/junit_2.png)
<p> &nbsp;</p>

![Junit jupiter](/InterviewExample/Tests/images/junit_3.png)


#### JUnit jupiter
* What is JUnit ?
    * JUnit is one of the most popular unit-testing frameworks in the Java ecosystems
* What is JUnit 5?
   * JUnit 5 is a new version of JUnit contains a number of exciting innovations, with the goal of supporting new features in Java 8 and above.

* What is JUnit Jupiter?
    * JUnit Jupiter is one of three sub-projects in JUnit 5.
    * JUnit Jupiter is a module includes new programming and extention models for writing tests in JUnit 5.
    * New annotations are added comparison to JUnit 4.

#### Assertions
* What are Assertions?
    * Assertions are utility methods to support asserting conditions in tests.
    * These methods are accessible through the Assert class in JUnit4 , and the Assertions in JUnit5
    * To increase the readability , it is recommended to import statically the respective class
        to refer directly to the assertion method itself without the representing class as a prefix.
            * import static org.junit.jupiter.api.Assertions.*;

* What types can be used with assertions?
    * Assertions are available for all primitive types, Objects, and arrays

* What is the parameters order within the assertion?
    * Within the assertion, the parameters order is the expected value followed by the actual value.

* What is assertEquals?
    * The assertEquals assertion verifies that the expected and the actual values are equal  

###### References:
* https://www.baeldung.com/junit-5
* https://www.baeldung.com/junit-assertions

