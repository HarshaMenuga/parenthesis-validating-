package com.java.demo.rest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CsvToXls {

	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream(new File("C:\\Users\\harsh\\OneDrive\\Desktop\\DemoCSV.csv"));

		ArrayList<String> list = new ArrayList<String>();

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet spreadsheet = workbook.createSheet("Sheet1");
		XSSFRow row;
		XSSFCell cells;
		
		Scanner sc = new Scanner(in);

		while (sc.hasNextLine()) {
			list.add(sc.nextLine());

		}

		for (int i = 0; i < list.size(); i++) {
			row = spreadsheet.createRow(i);
			String[] data = list.get(i).split(",");
			for (int j = 0; j < data.length; j++) {
				String newData = data[j];
				cells = row.createCell(j);
				cells.setCellValue(newData);
			}
		}
		FileOutputStream op = new FileOutputStream(new File("C:\\Users\\harsh\\OneDrive\\Desktop\\XLSheet.xls"));
		workbook.write(op);
		op.close();
		System.out.println("file created successfully");
	}
}
