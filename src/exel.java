import java.io.File;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exel {
	public static void main(String[] args)
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		// fis = new FileInputStream("‪‪‪‪C:\\Users\\hp\\Desktop\\new.xlsx");
		File f = new File(".\\Data\\sel.xlsx");
		Workbook W = WorkbookFactory.create(f);
		Sheet sh = W.getSheet("Sheet1");
		Row firstRow = sh.getRow(0);
		int rowCount = sh.getPhysicalNumberOfRows();
		int colCount = firstRow.getLastCellNum();
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				Cell cl = sh.getRow(i).getCell(j);

				System.out.print(cl + "  ");

			}
			System.out.println();

		}
	}
}