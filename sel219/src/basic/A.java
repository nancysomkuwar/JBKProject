package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(1);
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		System.out.println(2);
		WebDriver driver = new ChromeDriver();
		System.out.println(3);
		driver.get("file:///C:/Users/Nancy/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/index.html");

		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		String heading = driver.findElement(By.xpath("/html/body/div/div[2]/p[1]")).getText();
		System.out.println(heading);

		// driver.findElement(By.id("email_error")).getText();

		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();

		
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a/span")).click();
		Thread.sleep(1000);
		

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("username")).sendKeys("nancy");
		driver.findElement(By.id("mobile")).sendKeys("9922334455");
		driver.findElement(By.id("email")).sendKeys("nancy@gmail.com");
		driver.findElement(By.id("course")).sendKeys("Java");
		driver.findElement(By.xpath("//*[@id=\"Female\"]")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select/option[2]")).click();
		driver.findElement(By.id("password")).sendKeys("nancy12");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[3]/div/input")).sendKeys("8855663322");
		
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[4]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[5]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[6]/a/span")).click();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[7]/a/span")).click();
		
		
		

	}

}
