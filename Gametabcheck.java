package Mobiletest;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Gametabcheck {
  
	

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
			             
			             
			           
			             driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
			            System.out.println("App is Launched");
			            

			           //  Login valid credentails 
			             Thread.sleep(5000);   
			             try {
			            	 
			            	 WebElement username = driver.findElementByXPath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
				          		Thread.sleep(4000);
				          		username.sendKeys("user54");	
				          		Thread.sleep(2000);
				         		WebElement password1 = driver.findElementByXPath("//android.widget.EditText[contains(@text,'Password')]");          	
				          		
				         	password1.sendKeys("test@123");	  
				         	Thread.sleep(2000);
				          		
				          		driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.ImageView")).click();
                              Thread.sleep(2000);
				          	  driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Login')]")).click();
					            System.out.println("Login button clicked");
					            
			 	            
			 	         
			             System.out.println("Login successfull !!");
			                  Thread.sleep(1500);
			              }
			              catch(Exception f13)      
			                  {
			                      System.out.println("Login failed");
			                  }    
			         
			   
			           // driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Button[2]")).click();
			          
			            Thread.sleep(5000);   
			             try {
			            //Native Rummy icon  
			            driver.findElement(By.xpath("//android.widget.Button[contains(@text,'Next slide')]")).click();
			            	
			            
			            Thread.sleep(4000);
			            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[5]/android.view.View/android.view.View/android.widget.Button")).click();
			            System.out.println("Rummy playnow clicked ");
			             }
			             catch(Exception f14)      
		                  {
		                      System.out.println("native lobby failed");
		                  } 
			           
			             Thread.sleep(45000);   
			             try {
			            	//2d icon
			            	 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup[5]/android.widget.ImageView")).click();
			            	//pools tab
			            	 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View")).click();
			            	// deals tab
			            	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[5]/android.widget.TextView[2]")).click();
			                //powerplay tab
			            	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[4]/android.view.View")).click();
			                // tour tab
			            	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[2]")).click();
			                //Practice tab
			            	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View[3]")).click();
			             }
			             catch(Exception f16)      
		                  {
		                      System.out.println("pools deals pp tab clicked");
		                  } 
			           
	
	    
}}
