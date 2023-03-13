import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class HomeWorks {

    WebDriver  wd;

    @BeforeClass
    public void setUp(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        DesiredCapabilities cp = new DesiredCapabilities();
        cp.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(cp);

        wd = new ChromeDriver(options);
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators(){
        // by tag name
        WebElement el= wd.findElement(By.tagName("button"));
        WebElement element = wd.findElement(By.cssSelector("button"));
        WebElement elementxp = wd.findElement(By.xpath("//button"));

        // by class

        WebElement divcontainer =wd.findElement(By.className("container"));
        WebElement divcontainer1 =wd.findElement(By.cssSelector(".container"));
        WebElement divcontainerxp =wd.findElement(By.xpath("//*[@class='container]"));

        //By id

        WebElement nav = wd.findElement(By.id("root"));
        WebElement nav1 = wd.findElement(By.cssSelector("#root"));
        WebElement navxp = wd.findElement(By.xpath("//*[@id='root']"));

        // by attribute
        WebElement inputEmail = wd.findElement(By.cssSelector("[placeholder=\"Email\"]"));
        WebElement inputEmail1 = wd.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement inputEmailxp = wd.findElement(By.xpath("//*[@placeholder=\"Email\"]"));
        WebElement inputEmailxp2 = wd.findElement(By.xpath("//*[@placeholder='Password']"));

        //WebElement  e18 = wd.findElement();

        // one of elements find by attribute ==> start & end & contains value
        // start
        wd.findElement(By.cssSelector("[placeholder ^='Email']"));
        wd.findElement(By.xpath("//*[@placeholder^='Email']"));
        // end
        wd.findElement(By.cssSelector("[placeholder $='Password']"));
        wd.findElement(By.xpath("//*[@placeholder $='Password']"));
        // contains
       // wd.findElement(By.cssSelector("[placeholder *='your']"));
    }

    @Test
    public void classwork() {
        //parent
        WebElement el = wd.findElement(By.xpath("//h1/parent::*"));
        WebElement el1 = wd.findElement(By.xpath("//h1/parent::div"));
        WebElement el2 = wd.findElement(By.xpath("//h1/.."));

        WebElement el3 = wd.findElement(By.xpath("//h1/ancestor::*"));
        WebElement el4 = wd.findElement(By.xpath("//h1/ancestor::div[1]"));
        WebElement el5 = wd.findElement(By.xpath("///h1/ancestor::div[2]"));

        List<WebElement> list1 = wd.findElements(By.xpath("//h1/following-sibling::a"));
        //preceding-sibling
        WebElement el7 = wd.findElement(By.xpath("//a[@href='/login']/preceding-sibling::h1"));
        List<WebElement> list2 = wd.findElements(By.xpath("//a[@href='/login']/preceding-sibling::a"));
    }
        @Test
        public void classwork2(){
            WebElement element = wd.findElement(By.cssSelector("[name=login]"));

            String text =element.getText();
            System.out.println(text);

            WebElement form =wd.findElement(By.xpath("//form"));
            String
        }
    }


