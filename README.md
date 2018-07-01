# AssessmentForSDET

All answers are divided into 4 modules.

* Question1 module == Answer of the Question -1 (a) and Question - 1 (b).
* Question2 module == Answer of the Question - 2. The Generic module is associated with the Question2 module.
* Question3 module == Answer of the Question -3.

## Question 2.
Simple Test Automation.

**Characteristics:** 

	* Page Object Model design pattern.
	* Cross-platform performance (Cross-browser and operating system).
	* Parameterized.
	* Able to execute test cases by Maven.
  
**Details:**

The **Generic module** contains drivers and CommonAPI class. 

    Drivers folder:

      * There are the different type of drivers here (Chrome driver and Geckodriver for Mac, Windows, Linux).

    CommonAPI Class: 

      * CommonAPI class contains all common functionalities which are performed before and after 
      all test executions. 

The **Question2 module** contains all page object repositories and test cases.  
In the resources folder, there is also testNGTestRunner.xml file for using TestNG.