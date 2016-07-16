package com.application.libraries;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class CreateWorkBook 
{
   public static void main(String[] args)throws Exception 
   {
	 //Create Blank workbook
      XSSFWorkbook workbook = new XSSFWorkbook();
	  // FileInputStream fis= new FileInputStream("src/test/resources/testdata/data.xlsx");
	  // Workbook workbook = WorkbookFactory.create(fis) ;
      //Create file system using specific name
      FileOutputStream out = new FileOutputStream(new File("src/test/resources/testdata/data1.xlsx"));
      //write operation workbook using file out object 
      workbook.write(out);
      out.close();
      System.out.println("createworkbook.xlsx written successfully");
   }
}