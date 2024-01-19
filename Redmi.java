//package Mobiletest;

//public class Redmi {
	package Mobiletest;
	import java.net.URL;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.Test;

	import io.appium.java_client.AppiumDriver;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidElement;
	import io.appium.java_client.remote.MobileCapabilityType;


	public class Redmi {

	 public static RemoteWebDriver driver;
		
		    @Test
		    public static void LoginMeth() throws Throwable { 
		      
		        
		          DesiredCapabilities caps = new DesiredCapabilities();
		             caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		             caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		             caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		             caps.setCapability(MobileCapabilityType.UDID,"c6c434779806");  
		        //     caps.setCapability(MobileCapabilityType.UDID,"10.0.1.234:5555"); 
//		             caps.setCapability(MobileCapabilityType.UDID,"192.168.43.67:5555");
		             caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		             caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "70");
		    //       caps.setCapability(MobileCapabilityType.port, "70");
		             
		         //    caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		 
		             caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\DigientHP04\\Downloads\\IndiaPlays_QA.apk");
		             
		             
		           //  RemoteWebDriver driver = new RemoteWebDriver(url, capabilities);
		             
		             driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps);
		            System.out.println("App is Launched");
		            Thread.sleep(5000);
		            driver.findElement(By.xpath("//android.widget.ImageView[@class='android.widget.ImageView']")).click();
		            Thread.sleep(5000);
		            driver.findElement(By.xpath("//android.widget.EditText[@text='Mobile Number / Username']")).sendKeys("test");    
		            Thread.sleep(5000); 
		            
		           
		            
		    }
		    
		    @AfterTest
		    public void teardown() {
		        
		     //   driver.quit();
		    }
		    
		}
		



