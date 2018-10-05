package org.apache.maven.selenium_project.selenium_project;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
        System.setProperty("webdriver.chrome.driver","/home/edureka/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);

        System.out.println("Hi, Welcome to Edureka's YouTube Live session on Selenium WebDriver");
        
        driver.get("http://localhost:8888/web");

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.className("v-button")).click();
        driver.findElement(By.id("gwt-uid-5")).sendKeys("Edureka");
        driver.findElement(By.id("gwt-uid-7")).sendKeys("DevOps");
        driver.findElement(By.id("gwt-uid-9")).sendKeys("9834562709");
        driver.findElement(By.id("gwt-uid-11")).sendKeys("Devops@edureka.co");
        driver.findElement(By.id("gwt-uid-13")).sendKeys("01/01/2015");
        driver.findElement(By.className("v-button-primary")).click();
        //Thread.sleep(5000);
        driver.quit();

    }
}
