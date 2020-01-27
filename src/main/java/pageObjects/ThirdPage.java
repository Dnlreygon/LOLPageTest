package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThirdPage {
    @FindBy ( xpath = "//div[text()='Tirador']")
    private WebElement champPosition;

    public boolean isChampPositionVisible(){
        return this.champPosition.isDisplayed();
    }
}
