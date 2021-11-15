package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import StepDefinition.GoogleSearchSteps;

public class Navigation_to_Unstructred_Dashboard {
	
	int length1=0;
	int index=0;
	String result= "";
	String result1= "";

	WebDriver driver;
	int totallength=0;
	By dasboard= By.xpath("//html[1]/body[1]/div[1]/div[6]/div[1]/aside[1]/div[1]/div[2]/div[1]/div[6]/div[1]");
	By intelligence= By.xpath("//*[text()='Sensitive Data Intelligence & Protection']");
	By button= By.xpath("/html/body/div[1]/div[26]/main/div/div[1]/div[1]/span/button");
	
	By countPD= By.xpath("(//div[@class=\"v-select-list v-card theme--light\"]/div[@role=\"list\"])[7]/div[@role=\"listitem\"]");
	By datastoreclick= By.xpath("//*[text()='Data Store']/..//* [@class='f-filter-label']/../../../../../..//*[@class='v-expansion-panel__header__icon']/../..//*[@class='v-input__icon v-input__icon--append']");
	By selectionremove= By.xpath("//*[@class='v-icon material-icons theme--dark' and text()='cancel']");
	By CoutLocation= By.xpath("(//div[@class=\"v-select-list v-card theme--light\"]/div[@role=\"list\"])[8]/div[@role=\"listitem\"]");
	By Locationclick= By.xpath("//*[text()='Data Store Location']/..//* [@class='f-filter-label']/../../../../../..//*[@class='v-expansion-panel__header__icon']/../..//*[@class='v-input__icon v-input__icon--append']");
	By OwnerCount= By.xpath("(//div[@class=\"v-select-list v-card theme--light\"]/div[@role=\"list\"])[9]/div[@role=\"listitem\"]");
	By ownerclick= By.xpath("//*[text()='Data Store Owner']/..//* [@class='f-filter-label']/../../../../../..//*[@class='v-expansion-panel__header__icon']/../..//*[@class='v-input__icon v-input__icon--append']");
	By PDC = By.xpath("(//div[@class=\"v-select-list v-card theme--light\"]/div[@role=\"list\"])[10]/div[@role=\"listitem\"]");
	By PDCClick= By.xpath("//*[text()='Data Element Category']/..//* [@class='f-filter-label']/../../../../../..//*[@class='v-expansion-panel__header__icon']/../..//*[@class='v-input__icon v-input__icon--append']");
	By DET= By.xpath("(//div[@class=\"v-select-list v-card theme--light\"]/div[@role=\"list\"])[11]/div[@role=\"listitem\"]");
	By DETClick=  By.xpath("//*[text()='Data Element Types']/..//* [@class='f-filter-label']/../../../../../..//*[@class='v-expansion-panel__header__icon']/../..//*[@class='v-input__icon v-input__icon--append']");
	By DTC= By.xpath("(//div[@class=\"v-select-list v-card theme--light\"]/div[@role=\"list\"])[12]/div[@role=\"listitem\"]");
	By DTCClick=  By.xpath("//*[text()='Document Type Category']/..//* [@class='f-filter-label']/../../../../../..//*[@class='v-expansion-panel__header__icon']/../..//*[@class='v-input__icon v-input__icon--append']");
	By FolderPath= By.xpath("(//div[@class=\"v-select-list v-card theme--light\"]/div[@role=\"list\"])[13]/div[@role=\"listitem\"]");
	By FolderPathclick= By.xpath("//*[text()='Folder Path']/..//* [@class='f-filter-label']/../../../../../..//*[@class='v-expansion-panel__header__icon']/../..//*[@class='v-input__icon v-input__icon--append']");
	By FileFormat= By.xpath("(//div[@class=\"v-select-list v-card theme--light\"]/div[@role=\"list\"])[14]/div[@role=\"listitem\"]");
	By FileFormatclick= By.xpath("//*[text()='File Format']/..//* [@class='f-filter-label']/../../../../../..//*[@class='v-expansion-panel__header__icon']/../..//*[@class='v-input__icon v-input__icon--append']");
	By ContentProfile= By.xpath("(//div[@class=\"v-select-list v-card theme--light\"]/div[@role=\"list\"])[15]/div[@role=\"listitem\"]");
	By ContentProfileclick= By.xpath("//*[text()='Content Profile']/..//* [@class='f-filter-label']/../../../../../..//*[@class='v-expansion-panel__header__icon']/../..//*[@class='v-input__icon v-input__icon--append']");
	By countDocProfile= By.xpath("//*[descendant::*[text()='Documents Per Content Profiles']]/./following-sibling::*[contains(@class,'treemap')]//*[name()='svg']//*[name()='text']");
	By SearchProfile= By.xpath("//input[@aria-label='Search by content profiles']");
	By searchvalue= By.xpath("/html/body/div[1]/div[26]/main/div/div[1]/div[6]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr/td[2]/div");
	By doctype= By.xpath("//input[@aria-label='Search by document types']");
	By docvalue=By.xpath("//*[text()='By Document Type']/../../../..//tr[@class='f-child-level-row']//td[1]");
	By fileformat= By.xpath("//input[@aria-label='Search by file formats']");
	By fileformatval= By.xpath("//*[text()='By File Formats']/../../../..//tr[1]//td[1]");
	By datastore= By.xpath("//input[@aria-label='Search by data stores']");
	By datastorevalue= By.xpath("//*[text()='By Data Stores']/../../../..//tr[1]//td[1]");
	By ElementType= By.xpath("//input[@aria-label='Search by categories and types']");
	By ElementTypevalue= By.xpath("//*[text()='By Data Element Types']/../../../..//tr[2]//td[1]");
	By closefilter= By.xpath("//*[contains(@class,'f-filters-close-btn') and text()='close']");
	
	public Navigation_to_Unstructred_Dashboard() {
		this.driver= GoogleSearchSteps.driver;
		
		
	}
	public void click_dasboard() {
		
		driver.findElement(dasboard).click();
	}
	public void clicksensitivedata() throws InterruptedException {
		driver.findElement(intelligence).click();
		Thread.sleep(3000);
	}
	public void clickfilterbutton() throws InterruptedException {
		driver.findElement(button).click();
		Thread.sleep(3000);
		
	}
	
	public void get_length_for_datastore() { length1= driver.findElements(countPD).size();}
	public void select_data_intelligence() throws InterruptedException {
		
		
		this.get_length_for_datastore();
		
		for (int i =1; i<=length1;i++) {
			
			driver.findElement(datastoreclick).click();
			
			driver.findElement(By.xpath("(//div[@class=\"v-select-list v-card theme--light\"]/div[@role=\"list\"])[7]/div[@role=\"listitem\"]['"+i+"']")).click();
			this.remove();
			
		}
	}
	
	public void remove() {
		
		driver.findElement(selectionremove).click();
	}
	
	public void locationpresent() {
		
		Boolean Display=driver.findElement(Locationclick).isDisplayed();
		Boolean Display1=true;
		
	    Assert.assertEquals(Display1, Display);
}
	
	
	public void getlengthforlocation() {length1= driver.findElements(CoutLocation).size();}
	
	
	public void select_Location() throws InterruptedException {
		
		 
		//System.out.println("The length is" + length1);
		for (int i =1; i<=length1;i++) {
			driver.findElement(Locationclick).click();
			
			driver.findElement(By.xpath("(//div[@class=\"v-select-list v-card theme--light\"]/div[@role=\"list\"])[8]/div[@role=\"listitem\"]['"+i+"']")).click();
			this.remove();
			
		
	}
		
	}
	
public void ownerpresent() {
		
		Boolean Display=driver.findElement(ownerclick).isDisplayed();
		Boolean Display1=true;
		
	    Assert.assertEquals(Display1, Display);
}
	
public void getlengthforowner() {length1= driver.findElements(OwnerCount).size();}
	


public void set_owner() {
		
		 
		
		for (int i =1; i<=length1;i++) {
			
			driver.findElement(ownerclick).click();
			driver.findElement(By.xpath("(//div[@class=\"v-select-list v-card theme--light\"]/div[@role=\"list\"])[9]/div[@role=\"listitem\"]['"+i+"']")).click();
			this.remove();
		
		
	}
}

public void PDCpresent() {
	
	Boolean Display=driver.findElement(PDCClick).isDisplayed();
	Boolean Display1=true;
	
    Assert.assertEquals(Display1, Display);
}


public void getlengthPDC()

{length1= driver.findElements(PDC).size();}

public void PDC() {
		
	 
		
		for (int i =1; i<=length1;i++) {
			
			driver.findElement(PDCClick).click();
			
			driver.findElement(By.xpath("(//div[@class='v-select-list v-card theme--light']/div[@role='list'])[10]/div[@role='listitem']["+i+"]")).click();
		
			this.remove();
		
		
	}
}



public void DETpresent() {
	
	Boolean Display=driver.findElement(DETClick).isDisplayed();
	Boolean Display1=true;
	
    Assert.assertEquals(Display1, Display);
}


public void getlengthDET()

{length1= driver.findElements(DET).size();}





public void DET() {
	
	
	for (int i =1; i<=length1;i++) {
		
		driver.findElement(DETClick).click();
		
		driver.findElement(By.xpath("(//div[@class='v-select-list v-card theme--light']/div[@role='list'])[11]/div[@role='listitem']["+i+"]")).click();
		
		this.remove();
	
	
}
}

public void DTCpresent() {
	
	Boolean Display=driver.findElement(DTCClick).isDisplayed();
	Boolean Display1=true;
	
    Assert.assertEquals(Display1, Display);
}


public void getlengthDTC()

{length1= driver.findElements(DTC).size();}






public void DTC() {
	
	
	for (int i =1; i<=length1;i++) {
		
		driver.findElement(DTCClick).click();
		driver.findElement(By.xpath("(//div[@class='v-select-list v-card theme--light']/div[@role='list'])[12]/div[@role='listitem']["+i+"]")).click();
		this.remove();
	
	
}
}

public void FolderPathpresent() {
	
	Boolean Display=driver.findElement(FolderPathclick).isDisplayed();
	Boolean Display1=true;
	
    Assert.assertEquals(Display1, Display);
}


public void getlengthFolderPath()

{length1= driver.findElements(FolderPath).size();}




public void FolderPath() {
	
	
	for (int i =1; i<=length1;i++) {
		
		driver.findElement(FolderPathclick).click();
		driver.findElement(By.xpath("(//div[@class='v-select-list v-card theme--light']/div[@role='list'])[13]/div[@role='listitem']["+i+"]")).click();
		this.remove();
	
	
}
}


public void FileFormatPathpresent() {
	
	Boolean Display=driver.findElement(FileFormatclick).isDisplayed();
	Boolean Display1=true;
	
    Assert.assertEquals(Display1, Display);
}


public void getlengthFileFormat()

{length1= driver.findElements(FileFormat).size();}




public void FileFormat() {
	
	
	for (int i =1; i<=length1;i++) {
		
		driver.findElement(FileFormatclick).click();
		driver.findElement(By.xpath("(//div[@class='v-select-list v-card theme--light']/div[@role='list'])[14]/div[@role='listitem']["+i+"]")).click();
		this.remove();
	
	
}
}


public void ContentProfilePathpresent() {
	
	Boolean Display=driver.findElement(ContentProfileclick).isDisplayed();
	Boolean Display1=true;
	
    Assert.assertEquals(Display1, Display);
}


public void getlengthContentProfile()

{length1= driver.findElements(ContentProfile).size();}





public void ContentProfile() throws InterruptedException {
	
	
	for (int i =1; i<=length1;i++) {
		
		driver.findElement(ContentProfileclick).click();
		driver.findElement(By.xpath("(//div[@class='v-select-list v-card theme--light']/div[@role='list'])[15]/div[@role='listitem']["+i+"]")).click();
		
		this.remove();
	
	
}
	Thread.sleep(3000);
	driver.findElement(closefilter).click();
}

public void doccount() throws InterruptedException {
	Thread.sleep(3000);
	totallength=driver.findElements(countDocProfile).size();
	
	
}








public void getindexval()  {
	
	int half = totallength/2;
	   
	   System.out.println(totallength);
	   String currentvar="";
	   for (int i =1; i<=totallength;i++){
	  currentvar=driver.findElement(By.xpath("//*[descendant::*[text()='Documents Per Content Profiles']]/./following-sibling::*[contains(@class,'treemap')]//*[name()='svg']//*[name()='text']["+i+"]")).getText();
	 
	   if (currentvar.equals("PII")){
		   
	     index=half+i;
	    
	     break;}
	   }
}




public void AssertIndexVal() throws InterruptedException{
	  String result = driver.findElement(By.xpath("//*[descendant::*[text()='Documents Per Content Profiles']]/./following-sibling::*[contains(@class,'treemap')]//*[name()='svg']//*[name()='text']["+index+"]")).getText();
	  driver.findElement(SearchProfile).sendKeys("PII");
	  String result1 = driver.findElement(searchvalue).getText();
	  Thread.sleep(5000);
	  System.out.println(result);
	  System.out.println(result1);

	  Assert.assertEquals(result, result1);
	  
}




public void getindexval1() throws InterruptedException {
	
	int half = totallength/2;
	   
	   
	   String currentvar="";
	   for (int i =1; i<=totallength;i++){
	  currentvar=driver.findElement(By.xpath("//*[descendant::*[text()='Documents Per Content Profiles']]/./following-sibling::*[contains(@class,'treemap')]//*[name()='svg']//*[name()='text']["+i+"]")).getText();
	  
	   if (currentvar.equals("ITAR")){
		   
	     index=half+i;
	     
	     break;}
	   }
	   
}





public void RemoveIndexVal1() throws InterruptedException{
	 //  driver.findElement(SearchProfile).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
	   while (!driver.findElement(SearchProfile).getAttribute("value").equals("")) {
		   driver.findElement(SearchProfile).sendKeys(Keys.BACK_SPACE);
	       }
}




public void AssertIndexVal1() throws InterruptedException{
	   Thread.sleep(2000);
	   String result = driver.findElement(By.xpath("//*[descendant::*[text()='Documents Per Content Profiles']]/./following-sibling::*[contains(@class,'treemap')]//*[name()='svg']//*[name()='text']["+index+"]")).getText();
	  driver.findElement(SearchProfile).sendKeys("ITAR");
	  Thread.sleep(2000);
	  String result1 = driver.findElement(searchvalue).getText();
	  Thread.sleep(5000);
	  
	  Assert.assertEquals(result, result1);
	  
}






public void getindexval2() throws InterruptedException {
	
	int half = totallength/2;
	  
	   
	   String currentvar="";
	   for (int i =1; i<=totallength;i++){
	  currentvar=driver.findElement(By.xpath("//*[descendant::*[text()='Documents Per Content Profiles']]/./following-sibling::*[contains(@class,'treemap')]//*[name()='svg']//*[name()='text']["+i+"]")).getText();
	  
	   if (currentvar.equals("PHI")){
		   
	     index=half+i;
	     
	     break;}
	   }
}




public void RemoveIndexVal2() throws InterruptedException{
	  while (!driver.findElement(SearchProfile).getAttribute("value").equals("")) {
		   driver.findElement(SearchProfile).sendKeys(Keys.BACK_SPACE);
	       }
}




public void AssertIndexVal2() throws InterruptedException{
	  String result = driver.findElement(By.xpath("//*[descendant::*[text()='Documents Per Content Profiles']]/./following-sibling::*[contains(@class,'treemap')]//*[name()='svg']//*[name()='text']["+index+"]")).getText();

	  Thread.sleep(2000);
	  driver.findElement(SearchProfile).sendKeys("PHI");
	  Thread.sleep(2000);
	  String result1 = driver.findElement(searchvalue).getText();
	  Thread.sleep(5000);
	  

	  Assert.assertEquals(result, result1);
	  
}




// To be done by tomorrow

public void docindexvalue() throws InterruptedException{
	
	Thread.sleep(5000);
	 result=driver.findElement(By.xpath("(//*[descendant::*[text()='Displaying all documents']]/././following-sibling::*//*[name()='svg']//*[name()='text'][6])[1]")).getText();
	
}


public void getdocindexval() throws InterruptedException {
	
	   
	   
	   

	  
	   
	   
	 
	  driver.findElement(doctype).sendKeys(result);
	  Thread.sleep(2000);
	  result1 = driver.findElement(docvalue).getText();
	  Thread.sleep(5000);
}




public void matchdocindexval() {
	

	  Assert.assertEquals(result, result1);
	  
}




public void docindexvalue1() throws InterruptedException {
	Thread.sleep(5000);
	 result=driver.findElement(By.xpath("(//*[descendant::*[text()='Displaying all documents']]/././following-sibling::*//*[name()='svg']//*[name()='text'][4])[1]")).getText();
	
}

public void removedoc() throws InterruptedException {
	
	while (!driver.findElement(doctype).getAttribute("value").equals("")) {
		   driver.findElement(doctype).sendKeys(Keys.BACK_SPACE);
	       }
	  Thread.sleep(2000);
}

public void getdocindexval2() throws InterruptedException {
	
	   	   
	  driver.findElement(doctype).sendKeys(result);
	  Thread.sleep(2000);
	   result1 = driver.findElement(docvalue).getText();
	  Thread.sleep(5000);
}



public void matchdocindex1() {
	
	

	  Assert.assertEquals(result, result1);
}

public void docinndexval3() throws InterruptedException 

{
	
    Thread.sleep(5000);
 

    result=driver.findElement(By.xpath("(//*[descendant::*[text()='Displaying all documents']]/././following-sibling::*//*[name()='svg']//*[name()='text'][4])[1]")).getText();

}

public void removedoc2() throws InterruptedException {
	
	
	while (!driver.findElement(doctype).getAttribute("value").equals("")) {
		   driver.findElement(doctype).sendKeys(Keys.BACK_SPACE);
	       }
	  Thread.sleep(2000);
	  
	  
}

public void getdocindexval3() throws InterruptedException {
	
	   
	   
	    
	
	   
	  driver.findElement(doctype).sendKeys(result);
	  Thread.sleep(2000);
	   result1 = driver.findElement(docvalue).getText();
	  Thread.sleep(5000);
	  

}


public void matchindex3() {Assert.assertEquals(result, result1);}

public void docindexval4() throws InterruptedException 

{ 
	
	Thread.sleep(5000);
    result=driver.findElement(By.xpath("(//*[descendant::*[text()='Displaying all documents']]/././following-sibling::*//*[name()='svg']//*[name()='text'][5])[1]")).getText();
}

public void removedoc3() throws InterruptedException 

{
	   while (!driver.findElement(doctype).getAttribute("value").equals("")) {
	   driver.findElement(doctype).sendKeys(Keys.BACK_SPACE);
}
       Thread.sleep(2000);
       

}

public void getdocindexval4() throws InterruptedException {
	
	   
	   
	  

	  
	   
	   
	   
	  driver.findElement(doctype).sendKeys(result);
	  Thread.sleep(2000);
	  result1 = driver.findElement(docvalue).getText();
	  Thread.sleep(5000);
	  

	  
	  
}




public void matchindex4() {Assert.assertEquals(result, result1);}



public void fileindexval() throws InterruptedException {
	
	   
	   Thread.sleep(5000);
	 result=driver.findElement(By.xpath("//*[descendant::*[text()='Displaying all documents']]/././following-sibling::*//*[name()='svg']//*[name()='text'][20]")).getText();
	
	
}

public void removefileindexvalue() throws InterruptedException
{
	while (!driver.findElement(fileformat).getAttribute("value").equals("")) {
		   driver.findElement(fileformat).sendKeys(Keys.BACK_SPACE);
	       }
	  Thread.sleep(2000);
}

public void getfileindexval() throws InterruptedException {
	
	   
	

	   
	   
	   
	   
	  driver.findElement(fileformat).sendKeys(result);
	  Thread.sleep(2000);
	  result1 = driver.findElement(fileformatval).getText();
	  Thread.sleep(5000);
	  

	  
	  
}

public void matchfileindexval() {Assert.assertEquals(result, result1);}





public void fileindexval1() throws InterruptedException {
	
	
	 Thread.sleep(5000);
	 result=driver.findElement(By.xpath("//*[descendant::*[text()='Displaying all documents']]/././following-sibling::*//*[name()='svg']//*[name()='text'][18]")).getText();
	
}

public void removefileindexvalue1() throws InterruptedException 

{
	
	 while (!driver.findElement(fileformat).getAttribute("value").equals("")) {
		   driver.findElement(fileformat).sendKeys(Keys.BACK_SPACE);
	       }
	  Thread.sleep(2000);
}
public void getfileindexval1() throws InterruptedException {
	
	   
	   
	  

	  
	   
	   
	  
	  driver.findElement(fileformat).sendKeys(result);
	  Thread.sleep(2000);
	   result1 = driver.findElement(fileformatval).getText();
	  Thread.sleep(5000);
	  

	  
	  
}

public void matchfileindexval1() 

{
	
Assert.assertEquals(result, result1);


}

public void fileindexval2() throws InterruptedException { 
	
	Thread.sleep(5000);
    result=driver.findElement(By.xpath("//*[descendant::*[text()='Displaying all documents']]/././following-sibling::*//*[name()='svg']//*[name()='text'][19]")).getText();
}

public void removefileindexvalue2() throws InterruptedException {
	
	
	while (!driver.findElement(fileformat).getAttribute("value").equals("")) {
		   driver.findElement(fileformat).sendKeys(Keys.BACK_SPACE);
	       }
	  Thread.sleep(5000);
}

public void getfileindexval2() throws InterruptedException {
	
	   
	   
	  

	   
	   
	   
	   
	  driver.findElement(fileformat).sendKeys(result);
	  Thread.sleep(2000);
	   result1 = driver.findElement(fileformatval).getText();
	  Thread.sleep(5000);
	  

	 
	  
}



public void matchfileindexval2() { Assert.assertEquals(result, result1);}


public void datastoreindexval() throws InterruptedException 
{
	
	 Thread.sleep(5000);
	  result=driver.findElement(By.xpath("//*[descendant::*[text()='Displaying all documents']]/././following-sibling::*//*[name()='svg']//*[name()='text'][2]")).getText();
		

}

public void removedatastoreval() throws InterruptedException 
{
	while (!driver.findElement(datastore).getAttribute("value").equals("")) {
		   driver.findElement(datastore).sendKeys(Keys.BACK_SPACE);
	       }
	  Thread.sleep(2000);	

}

public void getdatastoreindexval() throws InterruptedException {
	
	   
	   
	  

	   
	   
	   
	   
	  driver.findElement(datastore).sendKeys(result);
	  Thread.sleep(2000);
	   result1 = driver.findElement(datastorevalue).getText();
	  Thread.sleep(5000);
	  

	  
	  
}

public void matchindexdatastore() {
	
	Assert.assertEquals(result, result1);
}



public void dataelementindexval() throws InterruptedException 
{
	 Thread.sleep(5000);
	  result="Social";	

}


public void removedataelement() throws InterruptedException 

{
	while (!driver.findElement(ElementType).getAttribute("value").equals("")) {
		   driver.findElement(ElementType).sendKeys(Keys.BACK_SPACE);
	       }
	  Thread.sleep(2000);	


}
public void getdataelementindexval() throws InterruptedException {
	
	   
	   
	  
	   
	   
	   
	   
	  driver.findElement(ElementType).sendKeys(result);
	  Thread.sleep(2000);
	  result1 = driver.findElement(ElementTypevalue).getText();
	  Thread.sleep(5000);
	  

	  
	  
}

public void matchdataelementindexval() 
{
	Assert.assertEquals(result, result1);	

}


public void dataelementindexval1() throws InterruptedException 

{
	
	 Thread.sleep(5000);
	 result="Medical";
}


public void removedataelementindexval1() throws InterruptedException 

{
	
	while (!driver.findElement(ElementType).getAttribute("value").equals("")) {
		   driver.findElement(ElementType).sendKeys(Keys.BACK_SPACE);
	       }
	  Thread.sleep(2000);
}
public void getdataelementindexval1() throws InterruptedException {
	
	   
	   
	  
	   
	   
	   
	   
	  driver.findElement(ElementType).sendKeys(result);
	  Thread.sleep(2000);
	  result1 = driver.findElement(ElementTypevalue).getText();
	  Thread.sleep(5000);
	  

	  
	  
}

public void matchdatastoreindexval1() 
{
	
	Assert.assertEquals(result, result1);


}



 public void navigate_to_dasboard() throws InterruptedException {
	 this.click_dasboard();
	 Thread.sleep(3000);
	 this.select_data_intelligence();
	 
 }
 
}
