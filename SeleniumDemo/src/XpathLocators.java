import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
		
		//absolute xpath
		WebElement men = driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/nav/div/div[1]/div/a"));
		System.out.println(men.getText());
		men.click();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.navigate().back();
		
		//relative xpath
		//syntax = //tagname[@attribute='value']
		WebElement women = driver.findElement(By.xpath("//a[@href='/shop/women']"));
		System.out.println(women.getText());
		women.click();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.navigate().back();
		
		//contains xpath method
		//syntax = //tagname[contains(@attribute,'value')]
		WebElement title = driver.findElement(By.xpath("//h4[contains(text(),'Biggest Deals On Top Brands')]"));
		System.out.println(title.getText());
		
		//using and & or
		//when we use and operator then both condition should true
		WebElement title1 = driver.findElement(By.xpath("//*[contains(text(),'Trending In Western Wear') and @class='text-banner-title']"));
		System.out.println(title1.getText());
		
		
		//when we use or operator then any one condition should true
		WebElement cancel = driver.findElement(By.xpath("//a[ @href='/faqs#cancel' or @data-reactid='59']"));
		System.out.println(cancel.getText());
		cancel.click();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.navigate().back();
		
		//Text method
		WebElement title2 = driver.findElement(By.xpath("//h4[text()='Explore Top Brands']"));
		System.out.println(title2.getText());
		
		//starts-with method
		WebElement eleBeauty = driver.findElement(By.xpath("//a[starts-with(@data-group,'beauty')]"));
		System.out.println(eleBeauty.getText());
		eleBeauty.click();
		System.out.println(driver.getCurrentUrl());
	}

}
