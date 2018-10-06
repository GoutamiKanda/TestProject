package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gouthami Reddy\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		Set<String>ids = driver.getWindowHandles(); //getWindowHandles() is used to manage to open the child window and is a returntype string so the return type is mensioned in the beginning as Set<String> and ids has to be created for the window
		Iterator<String>it = ids.iterator();//iterator() is used to iterate all the windows present in the page.
		String parentid = it.next();// each parent and child windows has to be initialialized
		String childid = it.next();
		
		driver.switchTo().window(childid);//window() is used to open that particular window either parent or child. if its a parent window then this method is used to switch to the child window
		System.out.println(driver.getTitle());
		//by default the selenium opens the parent window first and then from there it switch to the child
		driver.switchTo().window(parentid); //this steps get you back to the parent window
		
	}

}


