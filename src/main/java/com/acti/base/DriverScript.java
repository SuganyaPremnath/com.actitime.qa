package com.acti.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
/*
 * script:DriverScript
 * Description:This class file is used to hold the property file and initialise browser and application
 * Developed by :suganya
 * Verified by:Suganya
*/
public class DriverScript {
	
	public static WebDriver driver;
	Properties prop;
	
	public DriverScript() throws IOException {
		
		try {
			File file = new File("./atconfig/config.properties");
			FileInputStream fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
		public void initApplication(){
			String browser = prop.getProperty("browser");
			
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./atbrowser/chromedriver.exe");
				driver=new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","./atbrowser/geckodriver.exe");
				driver=new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver","/atbrowser/msedgedriver.exe");
				driver=new EdgeDriver();
					
				}
			else
			{
				System.out.println("Browser not supported");
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
			getAppUrl();
			
			
		}
		public void getAppUrl() {
			String url = prop.getProperty("url");
			driver.get(url);
			
		}
		public void closeApplication() {
			driver.close();
		}
		
		
		
	}

	

	


