import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\girin\\IdeaProjects\\AutomationLearning\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/s?i=fashion&bbn=28166639031&rh=n%3A28166639031%2Cp_36%3A-59999%2Cp_72%3A1318477031&dc&hidden-keywords=-total-watch-jewellery-slipper-mask-headband-handbag-shoes&ds=v1%3A2BTduNgLqCkfPDsy0tvPHxTECtAVhEh9%2BOpKXGogJ4s&_encoding=UTF8&content-id=amzn1.sym.fe48594a-9057-4039-b395-34001340df5b&pd_rd_r=f7e9e973-11d6-4781-900d-2ea2071b99e3&pd_rd_w=W06Lo&pd_rd_wg=DQS8o&pf_rd_p=fe48594a-9057-4039-b395-34001340df5b&pf_rd_r=TYZ6357Y7D51T4J6G685&qid=1690730192&rnid=1318475031&ref=pd_gw_unk");
        driver.findElement(By.linkText("Men's Regular Fit T-Shirt")).click();
  }
}
