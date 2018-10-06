package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gouthami Reddy\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());	
		//driver.findElement(By.id("email")).sendKeys("gouthami218@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("Roomy@btr$");
		//driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();
		driver.findElement(By.xpath("//div[@class='gb_P']/div/a")).click();
		//System.out.println(driver.findElement(By.cssSelector("input#pass.inputtext._55r1._1kbt._4rer")).getText());
		}
}
