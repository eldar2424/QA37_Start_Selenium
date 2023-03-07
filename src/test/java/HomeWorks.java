import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWorks {

    WebDriver  wd;

    @BeforeClass
    public void setUp(){
        wd=new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators(){
        // by tag name
        WebElement el= wd.findElement(By.tagName("button"));
        WebElement element = wd.findElement(By.cssSelector("button"));

        // by class

        WebElement divcontainer =wd.findElement(By.className("container"));
        WebElement divcontainer1 =wd.findElement(By.className("container"));

        //By id

        // by attribute

        // one of elements find by attribute ==> start & end & contains value
    }
}
