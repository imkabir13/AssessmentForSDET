package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FindMeetingPage {
    /*
     * **************** WebElements of FindMeetingPage ********************
     * */
    @FindBy(id = "meetingSearch")
    WebElement searchMeetingByZipCode;

    @FindBy(css = ".meeting-change-location__wrapper .meeting-change-location__form .input-group-lg>.input-group-btn>.btn")
    WebElement searchBtn;

    @FindBy(xpath = "//div[@class=\"meeting-locations-list__item\"]")
    List<WebElement> meetingList;

    @FindBy(css = ".meeting-information__left .location__name")
    WebElement meetingTitle;

    @FindBy(xpath = "//div[@id=\"content\"]//div//ui-view/div[1]//div//div[2]/div[1]/h2")
    WebElement hoursOfOperationsTitle;

    @FindBy(css = ".hours-list-item")
    List<WebElement> operationList;

    /*
     * **************** Methods of FindMeetingPage ***********************
     * */
    public void searchMeeting()
    {
        searchMeetingByZipCode.sendKeys("10011");
        searchBtn.click();
    }

    public String printFirstMeetingTitle()
    {
        String firstMettingTitle = meetingList.get(0).findElement(By.tagName("span")).getText();
        return firstMettingTitle;
    }

    public String printFirstMeetingDistance()
    {
        String firstResultDistance =  meetingList.get(0).findElement(By.className("location__distance")).getText();
        return firstResultDistance;
    }

    public void meetingDetails()
    {
        meetingList.get(0).findElement(By.tagName("span")).click();
    }

    public String getMeetingTitle()
    {
        String getMeetingTitle = meetingTitle.getText();
        return getMeetingTitle;
    }

    public void printHoursOfOperation(String today)
    {
        System.out.println("\n"+hoursOfOperationsTitle.getText());

        for (int i = 0; i < operationList.size(); i++){
            String day = operationList.get(i).findElement(By.className("hours-list-item-day")).getText();

            if (day.equalsIgnoreCase(today)){
                String operationTime = operationList.get(i).findElement(By.xpath("//div[@id=\"content\"]//div/ui-view/ui-view/div[1]//div//div[2]/div[1]/hours-list/ul/li[7]/div/div[2]/div")).getText();
                System.out.println("Today's Hours of Operation Time : "+day+" "+operationTime);
            }
        }
    }

    /*
     * ************************************ END *******************************************
     * */
}
