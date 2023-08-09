import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\girin\\IdeaProjects\\AutomationLearning\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.get("https://www.gmail.com/");
        driver.findElement(By.id("gb_y")).click();
        driver.findElement(By.id("identiferId")).sendKeys("girinathreddy1999@gamil.com");
        driver.findElement(By.className("VfPpkd-RLmnJb")).click();
        String at = driver.getTitle();
        String et = "gmail";
        driver.close();  }

}