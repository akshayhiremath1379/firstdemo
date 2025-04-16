package learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class second {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();

		WebElement drop = driver.findElement(By.id("bcd"));
		Select dropdown = new Select(drop);
		dropdown.selectByIndex(0);
	};
 public String getdata1() {
	 return "hello world";
 }
}
