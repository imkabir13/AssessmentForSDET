package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage{

    /*
    * **************** WebElements of HomePage ********************
    * */
    @FindBy(id = "ela-menu-visitor-desktop-supplementa_find-a-meeting")
    WebElement findMeeting;

    /*
     * **************** Methods of HomePage ********************
     * */
    public void goToFindMeetingPage()
    {
        findMeeting.click();
    }
    /*
     * ************************************ END *******************************************
     * */
}
