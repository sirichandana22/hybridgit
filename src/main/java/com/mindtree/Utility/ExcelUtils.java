package com.mindtree.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mindtree.reusablecomponents.CommonComponents;

public class ExcelUtils {
		
		
		private static Workbook workbook;
		private static Sheet sheet;
		
		
		public static void read_workbook(){
			CommonComponents.getconfig_properties();
			
			File excelfile = new File(CommonComponents.configproperty.getProperty("excelfilesource"));
			
			try {
				FileInputStream finp = new FileInputStream(excelfile);
				workbook = new XSSFWorkbook(finp);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			
		}
		
		public static String read_celldata(String sheetname,int rownum, int cellnum) {
			
			sheet = workbook.getSheet(sheetname);
			String celldata = "";
			try {
				if(sheet.getRow(rownum).getCell(cellnum).getCellType()==CellType.NUMERIC) {
					celldata = ""+sheet.getRow(rownum).getCell(cellnum).getNumericCellValue();
				}
				else {
					celldata= sheet.getRow(rownum).getCell(cellnum).getStringCellValue();
				}
				
			}
			catch(NullPointerException npexception) {
				
			}
			
			return celldata;
			
		}
		
		public static int get_Last_Row_Num(String sheetname) {
			sheet = workbook.getSheet(sheetname);
			return sheet.getLastRowNum();
		}
}
