import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.plugin.javascript.navig.Link;

import java.util.List;

public class Selenium3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\girin\\IdeaProjects\\AutomationLearning\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        List<WebElement> link=driver.findElements(By.tagName("a"));
        System.out.println(link.size());
        for (WebElement l : link)
        {
            System.out.println(l.getText());
        }
    }
}

