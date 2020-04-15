package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_bestPrg {
	
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\raju0\\eclipse-workspace\\MavenProject\\Drivers\\chromedriver.exe");

driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
Thread.sleep(3000);

driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

Actions action =new Actions(driver);

WebElement rome=driver.findElement(By.xpath("//*[@id=\"box6\"]"));
WebElement italy=driver.findElement(By.xpath("//*[@id=\"box106\"]"));

	//action.clickAndHold(rome).moveToElement(italy).release().build().perform();
	
	// or we can do this method also

action.dragAndDrop(rome, italy).build().perform();
	
Thread.sleep(3000);
driver.quit();
	
	}
	}
