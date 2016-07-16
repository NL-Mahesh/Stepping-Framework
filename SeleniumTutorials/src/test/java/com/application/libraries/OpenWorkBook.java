package com.application.libraries;
import java.io.*;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.apache.poi.xssf.usermodel.*;
public class OpenWorkBook
{
   public static void main(String args[])throws Exception
   { 
      File file = new File("src/test/resources/testdata/openworkbook.xlsx");
      FileInputStream fIP = new FileInputStream(file);
      //Get the workbook instance for XLSX file 
      //XSSFWorkbook workbook = new XSSFWorkbook();
      Workbook workbook = WorkbookFactory.create(fIP) ;
      Sheet sh=workbook.getSheetAt(0);
      Row row=sh.getRow(8);
      Cell cell=row.createCell(1);
      cell.setCellType(cell.CELL_TYPE_STRING);
      cell.setCellValue("Selenium");
      FileOutputStream fout= new FileOutputStream(file);
      workbook.write(fout);
      if(file.isFile() && file.exists())
      {
         System.out.println(
         "openworkbook.xlsx file open successfully.");
      }
      else
      {
         System.out.println(
         "Error to open openworkbook.xlsx file.");
      }
   }
}