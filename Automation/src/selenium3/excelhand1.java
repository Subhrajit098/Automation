package selenium3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelhand1 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis =new FileInputStream("D:\\Selenium\\EXCEL FILES\\Book1.xlsx");
	Workbook book=WorkbookFactory.create(fis);
	Sheet sh=book.getSheet("Sheet1");
	 String value=sh.getRow(0).getCell(0).getStringCellValue();
	 System.out.print(value);
	 String value1=sh.getRow(0).getCell(1).getStringCellValue();
	 System.out.println(" "+value1);
	 
}
}
