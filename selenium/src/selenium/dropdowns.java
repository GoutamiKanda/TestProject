package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gouthami Reddy\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/flights");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.switchTo().alert().getText());
		//.switchTo().alert().accept();
		System.out.println(driver.findElement(By.xpath("//strong[contains(text(),'Adults')]")).getText());
		Select s = new Select(driver.findElement(By.xpath("//select[@id='Adults']")));
		s.selectByIndex(7);
	}

}
