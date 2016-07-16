package com.application.libraries;
 
import java.io.*;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

public class ExcelLibrary {	
	public String getExcelData(String strSheetName, int introwNum, int intcellNum){		
		String retValue=null;
		try {
			FileInputStream fis=new FileInputStream("src/test/resources/testdata/CommonData.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sheet=wb.getSheet(strSheetName);
			Row row=sheet.getRow(introwNum);
			Cell cell=row.getCell(intcellNum);
			retValue=cell.getStringCellValue();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} 
		catch (InvalidFormatException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}		
		return retValue;		
	}
}
