import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Prajna\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.amazon.com");
		Actions a = new Actions(driver);
		driver.manage().window().maximize();
		
		//Moves to specific element
		
		WebElement move = driver.findElement(By.id("nav-link-accountList"));
		a.moveToElement(move).build().perform();
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().sendKeys("facewash").keyDown(Keys.ARROW_DOWN).click().build().perform();
		
	}

}
