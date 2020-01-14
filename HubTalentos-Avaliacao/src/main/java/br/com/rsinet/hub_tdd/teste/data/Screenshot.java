package br.com.rsinet.hub_tdd.teste.data;


	import java.io.File;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.util.Calendar;


	import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;


	public class Screenshot {
	    
		@Rule
		public static TestName testName = new TestName();
		
	    public static String getTimeStamp() {
	        return new SimpleDateFormat("dd_MM_yyyy HH.mm.ss").format(Calendar.getInstance().getTime());
	    }
	    
	    public static void getScreenShot(WebDriver driver){
	        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        
	        try {
	            FileUtils.copyFile(file, new File("target/screenshot/"+ testName.getMethodName()+ getTimeStamp() + ".png"));
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
	 





