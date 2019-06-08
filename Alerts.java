import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Prajna\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
		
		System.out.println(driver.switchTo().alert().getText()); // to display the alert message
		
		driver.switchTo().alert().accept(); // this is to accept the alert
		//driver.switchTo().alert().dismiss(); //this  is to close the alert
		
		//===============if we want to edit the alert box 
		
		//driver.switchTo().alert().sendKeys("edit the text");
		
		
		
		
	}

}
