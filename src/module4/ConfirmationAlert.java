package module4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {

		// Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Open AUT
		driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");

		driver.findElement(By.id("confirm")).click();
		Thread.sleep(5000);
		
		Alert ca = driver.switchTo().alert();
		Thread.sleep(5000);
		
		ca.dismiss();
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
