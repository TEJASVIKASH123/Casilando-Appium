package Mobiletest;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Loginvalidation {

	
	
	public static AndroidDriver<AndroidElement> driver = null;
    
    @Test
   public static void LoginMeth() throws Throwable { 
  //  public static void main(String[] args) throws Throwable { 
    	        
        
    		DesiredCapabilities caps = new DesiredCapabilities();
             caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
				
				  caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
				  caps.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus 7T");
				  caps.setCapability(MobileCapabilityType.UDID,"141f90af");
				  caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		             caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "70");
		    //       caps.setCapability(MobileCapabilityType.port, "70");
		             
	       //     caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		             caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\DigientHP04\\Downloads\\IndiaPlays_QA.apk");
		             
		             
		           //  RemoteWebDriver driver = new RemoteWebDriver(url, capabilities);
		            // driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4726/wd/hub"), caps);
		             
		       driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		            System.out.println("App is Launched");
		   
		            
		            //invalid credentiuals
		            Thread.sleep(5000); 
		            try {
		            	
		           	 WebElement username = driver.findElementByXPath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
		          		Thread.sleep(4000);
		          		username.sendKeys("user65");	
		            	
		          		WebElement password = driver.findElementByXPath("//android.widget.EditText[contains(@text,'Password')]");
		          		Thread.sleep(4000);
		          		password.sendKeys("test@12345");
		          		
		          		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.ImageView")).click();
		             	 
		          		driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Login')]")).click();
		             	Thread.sleep(5000);
		             	password.clear();
		          		username.clear();
		      
		             	 System.out.println("username and password  invalid  !!");
		                 Thread.sleep(1500);
		             }
		             catch(Exception f10)      
		                 {
		                     System.out.println("username and password  empty Failed  ");
		            
		            
		                 }	            
		            
    //username and password  empty
    Thread.sleep(5000);   
    try {
     	 driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Login')]")).click();
     	
    System.out.println("username and password  empty verified  !!");
         Thread.sleep(1500);
     }
     catch(Exception f11)      
         {
             System.out.println("username and password  empty Failed  ");
         }
             
             
             //Blocked user 
             Thread.sleep(5000);   
             try {
            	 WebElement username = driver.findElementByXPath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
	          		Thread.sleep(4000);
	          		username.sendKeys("user33");	
	            	
	          		WebElement password = driver.findElementByXPath("//android.widget.EditText[contains(@text,'Password')]");
	          		Thread.sleep(4000);
	          		password.sendKeys("test@123");
	          		
	          		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.ImageView")).click();
	             	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.ImageView")).click();
	          		driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Login')]")).click();
              	
             System.out.println("username is blocked !!");
                  Thread.sleep(1500);
              }
              catch(Exception f12)      
                  {
                      System.out.println("username exists failed ");
                  }
          
             
         
           
         }}
