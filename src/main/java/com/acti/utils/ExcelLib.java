package com.acti.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLib {
	
		XSSFWorkbook xs;
		public ExcelLib(String path) {
			// TODO Auto-generated method stub
			
			try {
				File file=new File(path);
				FileInputStream fis = new FileInputStream(file);
				xs = new XSSFWorkbook(fis);
			} catch (IOException e) {
				
				e.printStackTrace();
			}

		}


	public int getcount(int sheetindex) {
		int count = xs.getSheetAt(sheetindex).getLastRowNum()+1;
		return count;
	}
	public String getelements(int sheetindex,int rowno,int columnno) {
		String s = xs.getSheetAt(sheetindex).getRow(rowno).getCell(columnno).toString();
		
		return s;
	}
	}



