package com.utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static final String currentDir = System.getProperty("user.dir");
	public static String filePath = currentDir + "/src/test/resources";
	static String excelPath ; //"testdataframe.xlsx";
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String fileName) throws IOException 
	{
		excelPath = filePath+fileName;
		workbook = new XSSFWorkbook(excelPath);
		sheet = (XSSFSheet) workbook.getSheetAt(0);
	}
	
	public static int getRowCount() {
		int rowCount = 0;
		try {
			rowCount = sheet.getPhysicalNumberOfRows();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}
	
	public static int getColCount() {
		int colCount = 0;
		try {
			colCount = sheet.getRow(0).getLastCellNum();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return colCount;
	}
	
	public static String readStringData(String sheetName, int rowNum, int colNum) throws IOException {
		
		//String excelPath = filePath+fileName;
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell c = row.getCell(colNum);
		
		return c.getStringCellValue();
	}
	
	public static int readIntegerData(String fileName, int rowNum, int colNum, String sheetname) throws IOException {
		
		String excelPath = filePath+fileName;
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rowNum);
		Cell c = row.getCell(colNum);
		int a = (int) c.getNumericCellValue();
		
		return a;
		
	}

}
	
	
	

