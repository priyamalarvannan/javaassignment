package week2.day1;
import org.openqa.selenium.By;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateContact {

	public static void main(String[] args)
	{
		
				
				WebDriverManager.edgedriver().setup();
				EdgeDriver driver=new EdgeDriver();
				driver.manage().window().maximize();
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				String title=driver.getTitle();
				System.out.println(title);
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Contacts")).click();
				driver.findElement(By.linkText("Create Contact")).click();
				driver.findElement(By.id("firstNameField")).sendKeys("Priya");
				driver.findElement(By.id("lastNameField")).sendKeys("Malarvannan");
				String firstName=driver.findElement(By.id("firstNameField")).getAttribute("value");
				
				driver.findElement(By.name("submitButton")).click();
				System.out.println(firstName);
				System.out.println(driver.getTitle());
				driver.close();
				}
}
