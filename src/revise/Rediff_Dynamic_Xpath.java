package revise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_Dynamic_Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement SignIn=driver.findElement(By.xpath("//p[@id='signin_info']/child::a[@class='signin']"));
		
		SignIn.click();
		
		Thread.sleep(2000);
		
		WebElement CreateAcc=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/form/div[2]/div/a/u"));
		
		CreateAcc.click();
		
		Thread.sleep(2000);
		
		WebElement UN=driver.findElement(By.xpath("//input[starts-with(@name,'name')]']"));
		
		UN.sendKeys("SanketSudhirKulkarni");
		
		Thread.sleep(2000);
		
		WebElement Email=driver.findElement(By.xpath("//input[starts-with(@name,'login')]"));
		
		Thread.sleep(2000);
		
		Email.sendKeys("sanketkulkarni7995@gmail.com");
		
		WebElement option=driver.findElement(By.xpath("//input[starts-with(@name,'btnchkavail')]"));
		
		option.click();
		
		
		
		

	}

}
