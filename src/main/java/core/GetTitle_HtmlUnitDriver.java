package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class GetTitle_HtmlUnitDriver {
	public static void main( String[] args )
    {
    		//if (args.length == 0 )
    		//{	System.err.println("No arguments!");
    		//System.exit(1); 
             
    	
    	
  WebDriver driver = new HtmlUnitDriver();
    	 	
      String test_case_id = "TC-002.01";
      
    //  String param[] = args[0].split("\\|");  
     // String link = param[0];          
    //  String title_expected = param[1];    //"learn2test.net";
  
	String link = "http://www.learn2test.net";
	String title_expected = "learn2test";   
         
      driver.get(link);
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      String title_actual = driver.getTitle();
      
         if (title_expected.equals(title_actual)) 
         {System.out.println( "Test Case ID: \t\t" + test_case_id);
          System.out.println("URL: \t\t\t" + link);
          System.out.println("Title Expected: \t" + title_expected);
          System.out.println("Title Actual: \t\t " + title_actual);
          System.out.println("TestCase Result on Firefoxdriver: \t" + "PASSED");}
         
         
         else  {System.out.println( "Test Case ID: \t\t" + test_case_id);
         System.out.println("URL: \t\t\t" + link);
         System.out.println("Title Expected: \t" + title_expected);
         System.out.println("Title Actual: \t\t " + title_actual);
         System.out.println("TestCase Result on Firefoxdriver: \t" + "FAILED");}
      
      driver.quit();
      
      
    }
}
