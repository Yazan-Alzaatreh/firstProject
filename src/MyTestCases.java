import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases {
	WebDriver driver = new ChromeDriver();

	@BeforeTest

	public void mySetup() throws InterruptedException {

		String myURL = "https://www.saucedemo.com/";
		driver.get(myURL);
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}

	@Test

	public void CheckTheWebSiteTitle() throws InterruptedException {

		WebElement UserName = driver.findElement(By.id("user-name"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement Logbotton = driver.findElement(By.id("login-button"));

		UserName.sendKeys("standard_user");
		Password.sendKeys("secret_sauce");
		Logbotton.click();
		Thread.sleep(2000);

		List<WebElement> addtocartbottons = driver.findElements(By.className("btn"));

		for (int i = 0; i < addtocartbottons.size(); i++) {
			addtocartbottons.get(i).click();
		}
		Thread.sleep(2000);

		WebElement cart = driver.findElement(By.className("shopping_cart_link"));
		cart.click();
		Thread.sleep(2000);

		WebElement conttoshopping = driver.findElement(By.id("checkout"));
		conttoshopping.click();
		Thread.sleep(2000);
		
		

		

//		List<WebElement> removtocartbottons = driver.findElements(By.className("btn"));
//
//		for (int i = 0; i < removtocartbottons.size(); i++) {
//			removtocartbottons.get(i).click();
//		}
//		Thread.sleep(2000);

	}

	@AfterTest

	public void AfterTesting() throws InterruptedException {
		WebElement firstname=driver.findElement(By.id("first-name"));
		WebElement lastname=driver.findElement(By.id("last-name"));
		WebElement postalcod=driver.findElement(By.id("postal-code"));
		
		firstname.sendKeys("Yazan");
		lastname.sendKeys("Alzaatreh");
		postalcod.sendKeys("1234");
		Thread.sleep(2000);

		WebElement conttoby = driver.findElement(By.id("continue"));
		conttoby.click();
		Thread.sleep(2000);
		WebElement finish = driver.findElement(By.id("finish"));
		finish.click();
		Thread.sleep(2000);
		
		
		WebElement Option = driver.findElement(By.id("react-burger-menu-btn"));

		Option.click();

		Thread.sleep(2000);

		WebElement LogOut = driver.findElement(By.id("logout_sidebar_link"));
		LogOut.click();

		Thread.sleep(2000);

		driver.close();

	}

}
