import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.FirstPage;
import pageObjects.SecondPage;
import pageObjects.ThirdPage;

public class TestCase {

   private WebDriver driver;
   private FirstPage firstPage;
   private SecondPage secondPage;
   private ThirdPage thirdPage;
   private String search = "MISS FORTUNE";


   @Before

    public void preCondition(){
       driver = new ChromeDriver();
       driver.get("https://euw.leagueoflegends.com/es-es/how-to-play/");
       firstPage= PageFactory.initElements(driver,FirstPage.class);
       secondPage= PageFactory.initElements(driver,SecondPage.class);
       thirdPage= PageFactory.initElements(driver,ThirdPage.class);
   }

   @Test

    public void positiveTestCase() throws InterruptedException {

       Thread.sleep(2000);
       firstPage.clickChampions();
       Thread.sleep(2000);
       secondPage.clickMissFortune();
       Thread.sleep(2000);
       Assert.assertTrue(thirdPage.isChampPositionVisible());
   }

   @Test

   public void searchTestCase() throws InterruptedException {
      Thread.sleep(2000);
      firstPage.clickChampions();
      Thread.sleep(2000);
      secondPage.useSearchBar(search);
      Thread.sleep(2000);
      secondPage.clickMissFortune();
      Thread.sleep(2000);
      Assert.assertTrue(thirdPage.isChampPositionVisible());
   }

   @After

   public void finalization(){
      driver.quit();
   }
}
