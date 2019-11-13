package com.vuukle.blog.framework.page.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.vuukle.blog.framework.driver.Driver;
import com.vuukle.blog.framework.page.objects.PostPage;

public class PostPageActions {

	PostPage postPage = new PostPage();

	public void clickButton(String buttonText) {

		WebElement button = Driver.instance.findElement(
				By.xpath("//button[(text() = '" + buttonText + "') or ./*/text() = '" + buttonText + "']"));
		hover(button);
		button.click();
	}

	private void hover(WebElement element) {
		Actions actions = new Actions(Driver.instance);
		actions.moveToElement(element).build().perform();
	}
	
	public void enterText(WebElement element, String text) {
		JavascriptExecutor js = (JavascriptExecutor) Driver.instance;
		
		js.executeScript("arguments[0].innerText='" + text + "';", element);
	}

	public void login() throws InterruptedException {

		Driver.instance.switchTo().frame(postPage.commentFrame);

		hover(postPage.commentInputDiv);

		postPage.commentInputDiv.click();

		enterCredentials();
		
		clickButton("Sign in");
		Thread.sleep(3000);
	}
	
	private void enterCredentials() throws InterruptedException {
		String email = "vuukle.test@yopmail.com";
		String password = "vuukle.test";

		Thread.sleep(2000);

		postPage.emailInput.sendKeys(email);
		postPage.passwordInput.sendKeys(password);
		postPage.privacyPolicyCheckBox.click();
	}

	public void enterComment(String comment) {
		enterText(postPage.commentTextField, comment);
	}

}
