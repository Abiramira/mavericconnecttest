/*package com.maveric.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static XSSFSheet getSheetLevel(String fileNameWithPath, String sheetName) throws IOException
	{
		FileInputStream fileIn = new FileInputStream(fileNameWithPath); //location
		
		XSSFWorkbook book = new XSSFWorkbook(fileIn);	//opening workbook	
		XSSFSheet sheet = book.getSheet(sheetName);	//sheet name	
		return sheet;
		
	}
	
	public static XSSFRow getRowLevel(String fileNameWithPath, String sheetName, int rowNum) throws IOException
	{
		
		XSSFSheet sheet = ExcelUtils.getSheetLevel(fileNameWithPath, sheetName);
		
		XSSFRow row = sheet.getRow(rowNum);
		return row;
		
		
	}

	public static String getCellValueAsString(String fileNameWithPath, String sheetName, int rowNum,int cellNum) throws IOException
	{		
		XSSFRow row = ExcelUtils.getRowLevel(fileNameWithPath, sheetName, rowNum);
		
		int columnCount = row.getPhysicalNumberOfCells();
		System.out.println(columnCount);
		
		XSSFCell cell = row.getCell(cellNum);
		
		DataFormatter format = new DataFormatter();
		String value = format.formatCellValue(cell);
		return value;
		
	}


	public static Object[][] getSheetAsObjectForDataProvider(String fileNameWithPath, String sheetName) throws IOException
	{
		XSSFSheet sheet = ExcelUtils.getSheetLevel(fileNameWithPath, sheetName);
		XSSFRow row = sheet.getRow(0);
		int rowsCount = sheet.getPhysicalNumberOfRows();
		int columnCount = row.getPhysicalNumberOfCells();
		
		Object[][] obj = new Object[rowsCount-1][columnCount];
		for (int i = 1; i < rowsCount; i++) 
		{
			for (int j = 0; j <columnCount; j++) {
				XSSFCell cellVal = sheet.getRow(i).getCell(j);
				DataFormatter format1 = new DataFormatter();
				obj[i-1][j] = format1.formatCellValue(cellVal);
				//System.out.println(obj[i-1][j]);
			}
			
		}
		return obj;
	}
	
	
}
*/