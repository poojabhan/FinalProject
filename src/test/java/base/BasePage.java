package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	public BasePage(WebDriver driver) {
		//page factory class and initElements method to initialize driver
		PageFactory.initElements(driver, this);

}}
