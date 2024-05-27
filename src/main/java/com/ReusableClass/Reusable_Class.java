package com.ReusableClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.BaseClass.Base_Class;

public class Reusable_Class extends Base_Class{

	//public Actions act;
	//public Robot rob;
	//public Alert alt;
	
	public void toClick(WebElement ele1) {
		
		ele1.click();
		
	}
	
	public void enterValue(WebElement ele2, String value) {
		
		ele2.sendKeys(value);	
		
		}
	
	public void mouseHover(WebElement ele3) {
		Actions act2 = new Actions(driver);
		act2 = new Actions(driver);
		act2.moveToElement(ele3).build().perform();
		
	}
	
	public void doubleClick(WebElement ele4) {
		Actions act1 = new Actions(driver);
		act1.contextClick(ele4).build().perform();
	}
	
	public void dragAndDrop(WebElement source, WebElement target) {
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
	}
	

	public void forEnterkey() throws AWTException {
		
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void forKeyDown() throws AWTException {
		Robot tb3 = new Robot();
		
		tb3.keyPress(KeyEvent.VK_DOWN);
		tb3.keyRelease(KeyEvent.VK_DOWN);
	}
	
	public void forTabKey() throws AWTException {
		Robot rb1 = new Robot();
		rb1.keyPress(KeyEvent.VK_TAB);
		rb1.keyRelease(KeyEvent.VK_TAB);
	}
	
	public void forPageDown() throws AWTException {
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		rb.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
	
	public void toScrollDown(WebElement ele6) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(ture)", ele6);
	}
	
	public void toScrollUp(WebElement ele7) {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView(False)", ele7);
	}
	
	public void forWindowHandles() {
		Set<String> set = driver.getWindowHandles();
		List<String> list = new ArrayList<String>();
		list.addAll(set);
		driver.switchTo().window(list.get(1));
		
	}
	
	public void toTakeScreenshot(String val) throws IOException {
		TakesScreenshot scrnsht = (TakesScreenshot) driver;
		File file = scrnsht.getScreenshotAs(OutputType.FILE);
		File destn = new File(val);
		FileUtils.copyFile(file, destn);
		
			}
	
	public void forSelect(WebElement ele7, String val) {
			
		Select sel = new Select(ele7);
		sel.selectByValue(val);
		
	}
	
	public void toAcceptAlert() {
		Alert alert = driver.switchTo().alert();
	//alt = driver.switchTo().alert();
	alert.accept();
		
	}
	
	public void toDismiss() {
		
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}
	
	public void toSendKeys(String val) {
		Alert alt1 = driver.switchTo().alert();
		alt1.sendKeys(val);
	}
	
	public String forConvertingText(WebElement ele8) {
		
		String text = ele8.getText();
		System.out.println(text);
		return text;
		
	}
	
	
}

