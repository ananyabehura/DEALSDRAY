package dealsdry;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dealsdryTest {

	public static void main(String[] args) throws InterruptedException {

		// Initialize the WebDriver instance
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://demo.dealsdray.com/");

		WebElement usernameField = driver.findElement(By.name("username"));
		usernameField.sendKeys("prexo.mis@dealsdray.com");

		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("prexo.mis@dealsdray.com", Keys.ENTER);

		Thread.sleep(2000);

		WebElement orderOption = driver.findElement(By.xpath("//span[contains(text(),'Order')]"));
		orderOption.click();

		WebElement ordersOption = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/a/button"));
		ordersOption.click();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]")).click();

		Thread.sleep(2000);

		WebElement BulkOrders = driver.findElement(By.xpath("//button[contains(text(),'Add Bulk Orders')]"));
		BulkOrders.click();

		Thread.sleep(2000);

		WebElement fileinput = driver.findElement(By.cssSelector("input.MuiOutlinedInput-input"));
		Thread.sleep(2000);
		fileinput.sendKeys("C:\\Users\\Surya\\Downloads\\demo-data.xlsx");

		driver.findElement(By.cssSelector("button.css-6aomwy")).click();

		driver.findElement(By.xpath("//button[contains(text(), 'Validate Data')]")).click();

		Thread.sleep(1000);

		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.quit();

	}
}
