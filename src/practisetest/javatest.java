package practisetest;
import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class javatest {

	
	
	
	
	
	
	
@Test
	
	public static void main(String[] args) {
		
	 WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");//searchbox
		driver.findElement(By.cssSelector("#nav-search-submit-button")).click();//searchicon
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a")).click();//product
		
		//switch the tabs
		Set<String> windhan=driver.getWindowHandles();//parent as child   2
		Iterator<String>it=windhan.iterator();//for()if
		String mainwindow=it.next();
		String childwindow=it.next();
		driver.switchTo().window(childwindow);//switch to child window
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
				driver.findElement(By.cssSelector("//*[@id=\"add-to-cart-button\"]")).click();
		
	}
	
	
	
}