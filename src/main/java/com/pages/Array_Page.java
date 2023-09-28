package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Array_Page extends Base_Page{
	
public Array_Page(WebDriver driver)
{
	super(driver);
}

@FindBy(xpath="(//a[text()='Get Started'])[2]")WebElement arrgtst;
@FindBy(xpath="//a[text()='Arrays in Python']")WebElement arrpytn;
@FindBy(xpath="//a[text()='Try here>>>']")WebElement arrpytryhr ;
@FindBy(xpath="//div[@class='CodeMirror-scroll']")WebElement arrpytxtbx;
@FindBy(xpath="//button[text()='Run']")WebElement arrpyrun;
@FindBy(xpath="//a[text()='Arrays Using List']")WebElement arruselst;
@FindBy(xpath="//a[@class='btn btn-info']")WebElement arruselsttryhr;
@FindBy(xpath="//div[@class='CodeMirror-scroll']")WebElement arruselsttxtbx;
@FindBy(xpath="//button[@type='button']")WebElement arruselstrun;
@FindBy(xpath="//a[text()='Basic Operations in Lists']")WebElement bsopelst;
@FindBy(xpath="//a[@class='btn btn-info']")WebElement bsopelsttryhr;
@FindBy(xpath="//div[@class='CodeMirror-scroll']")WebElement bsopelsttxtbx;


@FindBy(xpath="//button[@type='button']")WebElement bsopelstrun;
@FindBy(xpath="//a[text()='Applications of Array']")WebElement apparr;
@FindBy(xpath="//a[text()='Try here>>>']")WebElement apparrtryhr;
@FindBy(xpath="//div[@class='CodeMirror-scroll']")WebElement apparrtxtbx;
@FindBy(xpath="//button[text()='Run']")WebElement apparrrun;


public void arrayStart() {
	arrgtst.click();
}

public void arrayPython() {
	arrpytn.click();

}
public void arrayPyTryHere() {
	arrpytryhr.click();
}
public void arrayPyTextBox() {
	arrpytxtbx.click();
}
public void arrayPyRun() {
	arrpyrun.click();
}
public void arrayUsingList() {
	arruselst.click();
}
public void arrayUsingListTryHere() {
	arruselsttryhr.click();
}

public void arrayUsingListTextBox() {
	arruselsttxtbx.click();
}
public void arrayUsingListRun() {
	 arruselstrun.click();
}
public void basicOperList() {
	bsopelst.click();
}
public void basicOperListTryHere() {
	bsopelsttryhr.click();
}

public void basicOperListTextBox() {
bsopelsttxtbx.click();
}

public void basicOperListRun() {
	bsopelstrun.click();
}
public void appArray() {
apparr.click();
}
public void appArrayTryHere(){
	apparrtryhr.click();
}
public void appArrayTextBox() {
apparrtxtbx.click();
}

public void appArrayRun() {
apparrrun.click();

}

}



