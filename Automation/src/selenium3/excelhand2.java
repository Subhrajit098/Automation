package selenium3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelhand2 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis =new FileInputStream("D:\\Selenium\\EXCEL FILES\\Book1.xlsx");
	Workbook book=WorkbookFactory.create(fis);
	Sheet sh=book.getSheet("Sheet1");
	DataFormatter format=new DataFormatter();
	String line1= format.formatCellValue(sh.getRow(0).getCell(0));
	String line2=format.formatCellValue(sh.getRow(1).getCell(0));
	System.out.println(line1);
	System.out.println(line2);
	// to find last row number &cell number
	int lastrow=sh.getLastRowNum();
	System.out.println(lastrow);
	short lastcell=sh.getRow(0).getLastCellNum();
	System.out.println(lastcell);

}
}
