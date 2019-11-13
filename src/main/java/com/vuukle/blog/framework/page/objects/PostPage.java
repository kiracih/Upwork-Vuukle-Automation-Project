package com.vuukle.blog.framework.page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.vuukle.blog.framework.driver.Driver;

public class PostPage {

	public PostPage() {
		PageFactory.initElements(Driver.instance, this);
	}
	
	@FindBy(how = How.CSS, using = "#write-comment-1")
	public WebElement commentInputDiv;
	
	@FindBy(how = How.CSS, using = "#write-comment-1 p")
	public WebElement commentTextField;
	
	@FindBy(how = How.NAME, using = "email")
	public WebElement emailInput;
	
	@FindBy(how = How.NAME, using = "password")
	public WebElement passwordInput;
	
	@FindBy(how = How.NAME, using = "terms")
	public WebElement privacyPolicyCheckBox;
	
	@FindBy(how = How.ID, using = "v-comments")
	public WebElement commentFrame;
	
	@FindBy(how = How.CSS, using = "*[type='warning'] > span")
	public WebElement warningMessage;
	
}
