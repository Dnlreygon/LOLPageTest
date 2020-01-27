package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstPage {
   @FindBy ( xpath = "//a[@id='riotbar-explore']")
    private WebElement riotMenu;

   @FindBy (xpath = "//div[@data-link-id='champions']")
    private WebElement champions;

   public void clickRiotMenu(){
       this.riotMenu.click();
   }

   public void clickChampions(){
       this.champions.click();
   }
}
