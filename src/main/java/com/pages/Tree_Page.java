package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tree_Page extends Base_Page{
	
	public Tree_Page(WebDriver driver)
	{
		super(driver);
	}

	 @FindBy(xpath="//a[@href='tree']") WebElement started; 
	 @FindBy(xpath="(//a[@class='list-group-item'])[1]") WebElement trees;
	 @FindBy(xpath="(//a[@class='list-group-item'])[2]") WebElement terminology;
	 @FindBy(xpath="(//a[@class='list-group-item'])[3]") WebElement treestypes;
	 @FindBy(xpath="(//a[@class='list-group-item'])[4]") WebElement traversals ;
	 @FindBy(xpath="(//a[@class='list-group-item'])[5]") WebElement illustration;
	 @FindBy(xpath="(//a[@class='list-group-item'])[6]") WebElement binary;
	 @FindBy(xpath="(//a[@class='list-group-item'])[7]") WebElement typesofbinary;
	 @FindBy(xpath="(//a[@class='list-group-item'])[8]") WebElement pythonimplementation;
	 @FindBy(xpath="(//a[@class='list-group-item'])[9]") WebElement binarytreetraversal; 
	 @FindBy(xpath="(//a[@class='list-group-item'])[10]") WebElement binarytreeimplementaton;
	 @FindBy(xpath="(//a[@class='list-group-item'])[11]") WebElement binaryapplication; 
	 @FindBy(xpath="(//a[@class='list-group-item'])[12]") WebElement binarysearchtree;
	 @FindBy(xpath="(//a[@class='list-group-item'])[13]") WebElement BSTimplementation;
	 @FindBy(linkText="Overview of Trees") WebElement overviewoftrees;
	 @FindBy(linkText="Terminologies") WebElement Terminologies;
	 @FindBy(linkText="Types of Trees") WebElement TypesofTrees;
	 @FindBy(linkText="Tree Traversals") WebElement TreeTraversals;
	 @FindBy(linkText="Traversals-Illustration") WebElement TraversalsIllustration;
	 @FindBy(linkText="Binary Trees") WebElement BinaryTrees;
	 @FindBy(linkText="Implementation in Python") WebElement ImplementationinPython;
	 @FindBy(linkText="Binary Tree Traversals") WebElement BinaryTreeTraversals;
	 @FindBy(linkText="Types of Binary Trees") WebElement TypesofBinaryTrees;
	 @FindBy(linkText="Applications of Binary trees") WebElement ApplicationsofBinarytrees;
	 @FindBy(linkText="Implementation of Binary Trees") WebElement ImplementationofBinaryTrees;
	 @FindBy(linkText="Binary Search Trees") WebElement BinarySearchTrees;
	 @FindBy(linkText="Implementation Of BST") WebElement ImplementationOfBST;
	 //@FindBy(linkText="Practice Questions") WebElement PracticeQuestions;
	 @FindBy(xpath = "//a[@href='/tryEditor']") WebElement TryHr;
	 @FindBy(xpath="//form/div/div/div/textarea") WebElement Txtbx;
	  @FindBy(xpath="//button[text()='Run']") WebElement Rn;
	  @FindBy(xpath="//div//pre[@id='output']") WebElement output;
	  @FindBy(xpath="//a[@class='list-group-item list-group-item-light text-info']") WebElement pracque;
	 
	 
	 
	 public void getstarted()
	  {
		  started.click();
	  }
	 public void overtrees()
	  {
		  trees.click();
	  }
	 public void terminologies()
	  {
		  terminology.click();
	  }
	 public void typesoftrees()
	  {
		 treestypes.click();
	  }
	 public void treetraversals()
	  {
		 traversals.click();
	  }
	 public void traversalsillustration()
	  {
		 illustration.click();
	  }
	 public void binarytrees()
	  {
		 binary.click();
	  }
	 public void typesofbinary()
	  {
		 typesofbinary.click();
	  }
	 public void implementationinpython()
	  {
		 pythonimplementation.click();
	  }
	 public void binarytreetraversal()
	  {
		 binarytreetraversal.click();
	  }
	 public void binarytreeimplementaton()
	  {
		 binarytreeimplementaton.click();
	  }
	 public void binaryapplication()
	  {
		 binaryapplication.click();
	  }
	 public void binarysearchtree()
	  {
		 binarysearchtree.click();
	  }
	 public void BSTimplementation()
	  {
		 BSTimplementation.click();
	  }
	 public void overviewoftrees()
	  {
		 overviewoftrees.click();
	  }
	 public void Terminologies()
	  {
		 Terminologies.click();
	  }
	 public void TypesofTrees()
	  {
		 TypesofTrees.click();
	  }
	 public void TreeTraversals()
	  {
		 TreeTraversals.click();
	  }
	 public void TraversalsIllustration()
	  {
		 TraversalsIllustration.click();
	  }
	 public void BinaryTrees()
	  {
		 BinaryTrees.click();
	  }
	 public void ImplementationinPython()
	  {
		 ImplementationinPython.click();
	  }
	 public void BinaryTreeTraversals()
	  {
		 BinaryTreeTraversals.click();
	  }
	 public void TypesofBinaryTrees()
	  {
		 TypesofBinaryTrees.click();
	  }
	 public void ApplicationsofBinarytrees()
	  {
		 ApplicationsofBinarytrees.click();
	  }
	 public void ImplementationofBinaryTrees()
	  {
		 ImplementationofBinaryTrees.click();
	  }
	 public void BinarySearchTrees()
	  {
		 BinarySearchTrees.click();
	  }
	 public void ImplementationOfBST()
	  {
		 ImplementationOfBST.click();
	  }
	 
	 public void TryHere()
	  {
		  TryHr.click();
	  }
	  public void TextBox()
	  {
		  Txtbx.sendKeys("print('Hi')");
	  }
	  public void Run()
	    {
		  Rn.click();
		  }
	  public void outputofpythoncd() 
	  {
		  output.getText();
	   }
	 
	public void practicequestion() 
	{
			 pracque.click();
	}

}
