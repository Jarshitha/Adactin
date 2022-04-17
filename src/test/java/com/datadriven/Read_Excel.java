package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel {

	public static void main(String[] args) throws IOException {
	
		File f=new File("C:\\Users\\Abhi\\Documents\\Datadriven.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(2);
		Cell cell = row.getCell(2);
		
		CellType cellType = cell.getCellType();
		
		
		if(cellType.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println("string value:"+stringCellValue);
			
		}
		
		else if(cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			System.out.println("numeric value:"+numericCellValue );
			
		}
		
		//to get whole values
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		System.out.println("numberofrows:"+numberOfRows);
		
		for(int i=0;i<numberOfRows;i++) {
			Row row2 = sheetAt.getRow(i);
			int cellcount = row2.getPhysicalNumberOfCells();
			
			for(int j=0;j<cellcount;j++) {
				Cell cell2 = row2.getCell(j);
				String stringCellValue = cell2.getStringCellValue();
				System.out.print(stringCellValue+" ");
			}
			System.out.println();
		}
	}
}
