package Org.qsp.testNGdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DataExcelDemo {
	@Test(dataProviderClass =ReadDataExcel.class, dataProvider = "getData")
	public void m1(String UN, String PW) {
		Reporter.log(UN + " " + PW, true);
	}

}
