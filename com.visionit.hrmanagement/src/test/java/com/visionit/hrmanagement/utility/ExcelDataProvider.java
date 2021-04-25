package com.visionit.hrmanagement.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook workbook;

	public ExcelDataProvider() {
		try {
			File fis = new File("./TestData/TestData.xlsx");
			FileInputStream fins = new FileInputStream(fis);
			workbook = new XSSFWorkbook(fins);
		} catch (Exception e) {
			System.out.println("File not found :" + e);
		}
	}

	public String getStringCellData(String sheetname, int row, int col) {
		XSSFSheet sheet = workbook.getSheet(sheetname);
		return sheet.getRow(row).getCell(col).getStringCellValue();
	}

	public String getStringCellData(int sheetIndex, int row, int col) {
		XSSFSheet sheet = workbook.getSheetAt(sheetIndex);
		return sheet.getRow(row).getCell(col).getStringCellValue();
	}

	public int getNumericCellData(String sheetname, int row, int col) {
		XSSFSheet sheet = workbook.getSheet(sheetname);
		return (int) sheet.getRow(row).getCell(col).getNumericCellValue();
	}

	public int getNumericCellData(int sheetIndex, int row, int col) {
		XSSFSheet sheet = workbook.getSheetAt(sheetIndex);
		return (int) sheet.getRow(row).getCell(col).getNumericCellValue();
	}
	
	
	public Object[][] getExcelData(String sheetname) {
		
		XSSFSheet sheet = workbook.getSheet(sheetname);
		
		int totalRow = sheet.getLastRowNum();
		short totalCols = sheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[totalRow][totalCols];
		
		for (int i = 0; i < totalRow; i++) {
			
			for (int j = 0; j < totalCols; j++) {
				
				data[i][j] =sheet.getRow(i+1).getCell(j).toString();
			}
		}
		
		return data;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
