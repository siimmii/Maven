package GENERIC_UTILTY;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtiliy {
	
	public String getExcelData(String SheetName,int RowNum,int ColNum) throws Throwable 
	{
	
	FileInputStream fis=new FileInputStream("C:\\Users\\akhil\\OneDrive\\Desktop\\latest_excel.xlsx");
	Workbook book=WorkbookFactory.create(fis);
	Sheet sh = book.getSheet("ProductNameSheet");
	Row row = sh.getRow(RowNum);
	Cell cell = row.getCell(ColNum);
	String value = cell.getStringCellValue();
	return value;
	
	
	}

}
