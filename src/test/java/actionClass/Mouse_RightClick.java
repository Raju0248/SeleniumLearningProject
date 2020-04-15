package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_RightClick {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\Drivers\\chromedriver.exe");

driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
Thread.sleep(3000);

driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

Actions action =new Actions(driver);

WebElement rightClickButton = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
action.contextClick(rightClickButton).build().perform();
Thread.sleep(3000);
driver.findElement(By.xpath("/html/body/ul/li[3]")).click();

System.out.println(driver.switchTo().alert().getText());
Thread.sleep(3000);
driver.switchTo().alert().accept();


Thread.sleep(3000);
driver.quit();
	}
}
