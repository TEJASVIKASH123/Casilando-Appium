package Mobiletest;


import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class Hamburgermenu {

	 public static AndroidDriver<AndroidElement> driver = null;
	    
	    @Test
	   public static void LoginMeth() throws Throwable { 
	  //  public static void main(String[] args) throws Throwable { 
	    	        
	        
	    		DesiredCapabilities caps = new DesiredCapabilities();
	             caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
					
					  caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
					  caps.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus 7T");
					  caps.setCapability(MobileCapabilityType.UDID,"141f90af");
					 
					
					
	            // caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
					//	  caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
				//		  caps.setCapability(MobileCapabilityType.UDID,"c6c434779806");
						 		             //autoGrantPermissions
			           //  caps.setCapability("autoGrantPermissions",true); 
	             
	             
				//	  caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
				//	  caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
				//	  caps.setCapability(MobileCapabilityType.UDID,"c6c434779806");
					 		             //autoGrantPermissions
		         //    caps.setCapability("autoGrantPermissions",true); 
	             
	             
	        //     caps.setCapability(MobileCapabilityType.UDID,"10.0.1.234:5555"); 
//	             caps.setCapability(MobileCapabilityType.UDID,"192.168.43.67:5555");
	             caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
	             caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "70");
	    //       caps.setCapability(MobileCapabilityType.port, "70");
	             
       //     caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	             caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\DigientHP04\\Downloads\\IndiaPlays_QA.apk");
	             
	             
	           //  RemoteWebDriver driver = new RemoteWebDriver(url, capabilities);
	             
	             driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
	            System.out.println("App is Launched");
	            
	            
	        //    Thread.sleep(5000);
	          //  driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView")).click();
	           // System.out.println("Promotion popup closed");
	            
	            Thread.sleep(5000);
	            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText")).sendKeys("user61");    
	            System.out.println("Username entered");
	            
	            
	            
	            driver.findElement(By.xpath("//android.widget.EditText[contains(@text,'Password')]")).sendKeys("test@123");
	            System.out.println("Password entered");
	            
	            
	            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.ImageView")).click();
	            
	            
	            driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Login')]")).click();
	            System.out.println("Login button clicked");
	            
	            Thread.sleep(3000);
	           // driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Button[2]")).click();
	           
	            driver.findElement(By.xpath("//android.widget.Button[contains(@text,'Next slide')]")).click();
	            	
	            
	            Thread.sleep(4000);
	            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[5]/android.view.View/android.view.View/android.widget.Button")).click();
	            System.out.println("Rummy playnow clicked ");
	          
	            Thread.sleep(45000);
	            //driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup[5]/android.widget.ImageView")).click();
	            //System.out.println("3d button clicked  ");
	            
	            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")).click();
	            System.out.println("Hamburgermenu clicked");
	            
	            
	            
	            
	            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[5]/android.view.View/android.widget.TextView")).click();
	            System.out.println("Mywallet clicked");
	       
	            
	            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup")).click();
	            System.out.println("Mywallet popup closed");
	        
	            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[5]/android.widget.TextView[2]")).click();
	            System.out.println("Profile clicked");
	    }	    
	    @AfterTest
	    public void teardown() {
	        
       driver.quit();
	    }
	    
	}
	

