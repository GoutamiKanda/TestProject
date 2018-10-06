package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayed {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gouthami Reddy\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/flights");
		System.out.println("before clicking on multitrip");
		System.out.println(driver.findElement(By.xpath("//input[@id='ReturnDate']")));
		System.out.println(driver.findElement(By.xpath("//input[@id='MultiCity']")));
		System.out.println("after clicking on multitrip");
		System.out.println(driver.findElement(By.xpath("//input[@id='ReturnDate']")));
		
	}

}
