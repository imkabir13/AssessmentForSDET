package TestCases;

import PageObject.FindMeetingPage;
import PageObject.HomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFindMeeting extends CommonAPI{
    SoftAssert softAssert = new SoftAssert();

    //getting today's Day name.
    Date now = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");
    String today = simpleDateFormat.format(now);

    /*
    * Test case ID: 00
    * TR ID: 00 (Technical Requirement)
    * RTM: 00-00
    */
    @Test
    public void testFindAMeeting()
    {
        //Step - 1: Navigate landing location 'https://www.weightwatchers.com/us/' by CommonAPI class under @BeforeMethod on the Generic module.
        //Step - 2: Verify landing page title
        softAssert.assertEquals("Weight Loss Program, Recipes & Help | Weight Watchers", driver.getTitle());
        //Step - 3: Click Find Meeting
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.goToFindMeetingPage();
        //Step- 4: Verify loaded page contains "Get Schedules & Times Near You".
        softAssert.assertTrue(driver.getTitle().contains("Get Schedules & Times Near You"));
        //Step - 5: Search meeting by the zip code - 10011.
        FindMeetingPage findMeetingPage = PageFactory.initElements(driver, FindMeetingPage.class);
        findMeetingPage.searchMeeting();
        //Step - 6: Print the title of the first meeting result and distance.
        String firstMeetingTitle = findMeetingPage.printFirstMeetingTitle();
        System.out.println("First Meeting Title: "+firstMeetingTitle);
        String firstMeetingDistance = findMeetingPage.printFirstMeetingDistance();
        System.out.println("The Meeting Distance: "+firstMeetingDistance);
        //Step - 7: Click first meeting title and verify with displayed location name.
        findMeetingPage.meetingDetails();
        String meetingTitle = findMeetingPage.getMeetingTitle();
        softAssert.assertEquals(firstMeetingTitle, meetingTitle);
        //Step - 8: Print today's hours of operation.
        findMeetingPage.printHoursOfOperation(today);
        softAssert.assertAll();
    }

    /*
     * ************************************ END *******************************************
     * */
}
