package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Write_Excel {
	
public static void main(String[] args) throws IOException {
			File f=new File("C:\\Users\\Abhi\\Documents\\Datadriven.xlsx");
			FileInputStream fis=new FileInputStream(f);
			
			Workbook wb=new XSSFWorkbook();
			
			Sheet mysheet = wb.createSheet("project");
			Row createRow = mysheet.createRow(0);
			Cell createCell = createRow.createCell(0);
			
			createCell.setCellValue("fruits");
			
			wb.getSheet("project").createRow(1);
			wb.getSheet("project").createRow(2);
			wb.getSheet("project").createRow(3);
			
			wb.getSheet("project").getRow(0).createCell(1).setCellValue("veggies");
			wb.getSheet("project").getRow(0).createCell(2).setCellValue("flowers");
			wb.getSheet("project").getRow(1).createCell(0).setCellValue("Banana");
			wb.getSheet("project").getRow(1).createCell(1).setCellValue("carrot");
			wb.getSheet("project").getRow(1).createCell(2).setCellValue("rose");
			wb.getSheet("project").getRow(2).createCell(0).setCellValue("apple");
			wb.getSheet("project").getRow(2).createCell(1).setCellValue("potato");
			wb.getSheet("project").getRow(2).createCell(2).setCellValue("marigold");
			wb.getSheet("project").getRow(3).createCell(0).setCellValue("Mango");
			wb.getSheet("project").getRow(3).createCell(1).setCellValue("Drumstick");
			wb.getSheet("project").getRow(3).createCell(2).setCellValue("Sunflower");
			
			FileOutputStream fos=new FileOutputStream(f);
			wb.write(fos);
			
			
		}
			
}	