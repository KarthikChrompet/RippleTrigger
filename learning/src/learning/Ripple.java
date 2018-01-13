package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ripple {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://DevTools//chromedriver.exe");
				
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		for(int i=1;i<=10000;i++) {
			
			dr.get("http://koinex.in/exchange/ripple");
			

			Thread.sleep(30000);
			
			WebElement element =dr.findElement(By.xpath("//b[contains(text(),'XRP/INR')]"));
			String price =element.getText();
			System.out.println(price);
			
			String array1[] = price.split(":");
			
			System.out.println(array1[1]);
			//System.out.println("Successfully opened the web site");
			float amount=Float.parseFloat(array1[1].trim());
			System.out.println("Ripple Price "+i+" ..: "+amount);
			
			if(amount > 152.00)	{
				WebDriver dr1 = new ChromeDriver();
				dr1.get("https://www.youtube.com/watch?v=tT1RNYIdPwA");
				Thread.sleep(5000);			
			}
			
			if(amount < 145.00)	{
				WebDriver dr2 = new ChromeDriver();
				dr2.get("https://www.youtube.com/watch?v=ZVx_ELdttg8");
				Thread.sleep(5000);		
			//	if(amount < 130.00) {WebDriver dr3 = new ChromeDriver().get("https://www.youtube.com/watch?v=tT1RNYIdPwA");}
			}
		}
			dr.quit();
	}
}
