package com.vuukle.blog.framework.page.assertions;

import org.testng.Assert;

import com.vuukle.blog.framework.driver.Driver;
import com.vuukle.blog.framework.page.objects.PostPage;

public class Assertions {

	PostPage postPage = new PostPage();
	
	public void assertCommentSuccessfulMessage(String message) throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(postPage.warningMessage.getText(), message);
	}

	public void assertTitle(String title) {

		Assert.assertEquals(Driver.instance.getTitle(), title);

	}
}
