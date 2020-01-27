package pageObjects;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondPage {
    @FindBy( xpath = "//a[@href='/es-es/champions/miss-fortune/']")
    private WebElement missFortune;

    @FindBy( xpath = "//input[@type='text']")
    private WebElement searchBar;

    public void clickMissFortune(){
        this.missFortune.click();
    }

    public void useSearchBar(String search){
        this.searchBar.sendKeys(search);
        this.searchBar.sendKeys(Keys.ENTER);
    }
}
