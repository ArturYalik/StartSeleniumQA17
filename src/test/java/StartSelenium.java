import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class StartSelenium {
    WebDriver wd;

    @BeforeMethod
    public void preCondition() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/");
    }
    @Test
    public void testLogin(){
        System.out.println("Test Started");
        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.xpath("//a"));
        WebElement element = wd.findElement(By.tagName("a"));

        wd.findElement(By.xpath("//*[@id='root']"));
        wd.findElement(By.xpath("//*[@href='/login']"));
        wd.findElement(By.xpath("//*[starts-with(@href,'/lo')]"));
        wd.findElement(By.xpath("//*[contains(@href,'/lo')]"));

        wd.findElement(By.xpath("//*[text()='HOME']"));
        wd.findElement(By.xpath("//*[.='HOME']"));




        List<WebElement> elements = wd.findElements(By.tagName("div"));
        System.out.println(elements.size());


        List<WebElement> home = wd.findElements(By.linkText("HOME"));
        List<WebElement> home1 = wd.findElements(By.partialLinkText("HO"));
        List<WebElement> root = wd.findElements(By.id("root"));
        System.out.println(home.size());
        System.out.println(home1.size());
        System.out.println(root.size());


    }

    @Test
    public void testName() {

        System.out.println("Test Completed");
    }

    @AfterMethod
    public void pastCondition() {
//        wd.close();
        wd.quit();

    }

}
