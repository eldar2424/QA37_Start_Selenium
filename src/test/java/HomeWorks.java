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

        WebElement nav = wd.findElement(By.id("root"));
        WebElement nav1 = wd.findElement(By.cssSelector("#root"));

        // by attribute
        WebElement inputEmail = wd.findElement(By.cssSelector("[placeholder=\"Email\"]"));
        WebElement inputEmail1 = wd.findElement(By.cssSelector("[placeholder='Password']"));

        // one of elements find by attribute ==> start & end & contains value
        // start
        wd.findElement(By.cssSelector("[placeholder ^='Email']"));
        // end
        wd.findElement(By.cssSelector("[placeholder $='Password']"));
        // contains
       // wd.findElement(By.cssSelector("[placeholder *='your']"));


    }
}
