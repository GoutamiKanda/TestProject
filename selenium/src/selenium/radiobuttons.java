package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttons {
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gouthami Reddy\\Downloads\\selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.spicejet.com/");
	//System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).isSelected());
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
	//System.out.println(driver.findElement(By.xpath("@id=['ctl00_mainContent_rbtnl_Trip_1']")));
	System.out.println("before clicking on round trip");
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1']")).click();
	//System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1']")));
	//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isDisplayed();
	System.out.println("after clicking on round trip");
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isDisplayed();
	}
	
}

