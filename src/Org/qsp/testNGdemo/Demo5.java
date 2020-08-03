package Org.qsp.testNGdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo5 {
	
	@Test(priority=1) 
	public void m1() {
		Reporter.log("hii......1",true);
		}

	@Test(priority=3)    
	public void m2() {
		Reporter.log("hii........2",true);
	}
	
	@Test(priority=0,invocationCount=3)
	public void m3() {
		Reporter.log("hi.....3",true);
	}

}
