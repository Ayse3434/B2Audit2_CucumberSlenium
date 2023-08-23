package com.devbook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostsPage extends BasePage{
    @FindBy(id = "post-form-btn")
    public WebElement submitBtn;
    @FindBy(xpath = "//a[text()='All Posts']")
    public WebElement allPostsBtn;
    @FindBy(id = "posts-heading")
    public WebElement postText;

}
