package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gouthami Reddy\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/Amazon-Prime-One-Year-Membership/dp/B00DBYBNEE");
		Actions a = new Actions(driver);//when mouse is places on any particular element it will show the options without clicking on it--- mouseover actions
		WebElement move = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		//moves to the particular element
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();		
		a.moveToElement(move).contextClick().build().perform();
		
	}

}

//doubleClick() used for selecting the entire text that is given in the search bar
//click() used to click on particular element
//keysDown(Keys.SHIFT) gives the related options present in the dropdown when we give any information
//Actions used for mpuseover actions
//contextClick() used to display the options when we right click on any particular element
//sendKeys() used to give any information on the particular element(search bar)
//build() is used to build the action that we are going to perform
//perform() is used for executing the particular action that is gpoing to be performed

