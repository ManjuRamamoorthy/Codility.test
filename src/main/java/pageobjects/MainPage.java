package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

	public void navigateURL() {
		Setup.driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_csharp_search/862b0faa506b8487c25a3384cfde8af4/static/attachments/reference_page.html");
		Setup.driver.manage().window().maximize();
	}
	
	public boolean verifyInputQueryDisplayed() {
		WebDriverWait wait = new WebDriverWait(Setup.driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search-input")));
		return Setup.driver.findElement(By.id("search-input")).isDisplayed();
	}
	
	public boolean verifySearchButtonDisplayed() {
		WebDriverWait wait = new WebDriverWait(Setup.driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search-button")));
		return Setup.driver.findElement(By.id("search-button")).isDisplayed();
	}
	
	public void clickonSearch() {
		Setup.driver.findElement(By.id("search-button")).click();
	}
	
	public boolean verifyEmptyQuery(String EmptyText) {
		WebDriverWait wait = new WebDriverWait(Setup.driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search-results")));
		if(EmptyText.equals(Setup.driver.findElement(By.id("search-results")).getText().toString())){
			return true;
		}
		return false;
	}
	
	public void enterQueryText(String Query) {
		WebDriverWait wait = new WebDriverWait(Setup.driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search-input")));
		Setup.driver.findElement(By.id("search-input")).click();
		Setup.driver.findElement(By.id("search-input")).clear();
		Setup.driver.findElement(By.id("search-input")).sendKeys(Query);
	}
	
	
}
