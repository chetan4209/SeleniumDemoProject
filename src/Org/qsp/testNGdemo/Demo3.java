package Org.qsp.testNGdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {

		@Test(priority=1)   //testcases execute from low to high No. count and Default count=0  
		public void m1() {
			Reporter.log("hiiiiiiiiii......1",true);
		}
		@Test(priority=0)
		public void m2() {
			Reporter.log("hiiiiiiiiii........2",true);
		}
		@Test(priority=5)
		public void m3() {
			Reporter.log("hiiiiiiiiii.....3",true);
		}


	}



