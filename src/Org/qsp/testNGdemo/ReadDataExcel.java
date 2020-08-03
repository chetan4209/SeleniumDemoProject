package Org.qsp.testNGdemo;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadDataExcel {
	@DataProvider
	public String[][] getData() throws Exception, InvalidFormatException, IOException {
		String st[][];
		FileInputStream fis = new FileInputStream(".\\Data\\sel.xlsx");
		Workbook W = WorkbookFactory.create(fis);
		Sheet sh = W.getSheet("Sheet1");
		st = new String[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
		for (int i=1; i<sh.getPhysicalNumberOfRows();i++) {
			for (int j = 0; j <sh.getRow(i).getLastCellNum();j++) {
				st[i-1] [j] = sh.getRow(i).getCell(j).toString();
			}
		
	}
		return st;

	}}
