package Org.qsp.testNGdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDEmo {
	@Test
	public void m1() {
		String aName = "Ankur";
		String eName = "Aman";
		Assert.assertEquals(aName, eName);
		System.out.println("matched");
		
	}

}
