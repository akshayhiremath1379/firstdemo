package learn;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.close();
		
		int[] abc = new int[2];
		int[] abc2 = {1,2,3,4,5,6};
		abc[0] = 1;
		abc[1] = 2;
		System.out.println(abc[0]);
		System.out.println(abc2[5]);
		
		List<String> abcd = new ArrayList<String>();
		abcd.add("ad");
        System.out.println(abcd.get(0));
        
        first d1 = new first();
        second d2= new second();
        d1.getData();
        System.out.println(d2.getdata1());
        
        String akshay = new String("Welcome");
        System.out.println(akshay);       
        

	}
	
	public void getData() {
		System.out.println("hello");
		
	}

}
