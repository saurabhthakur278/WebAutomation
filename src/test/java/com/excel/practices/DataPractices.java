package com.excel.practices;

import com.exel.utils.ExcellReadWriteUtil;

public class DataPractices {
	
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		String File ="\\ExcelDataFile\\DataReadWriteFile.xlsx";
		ExcellReadWriteUtil data = new ExcellReadWriteUtil(projectPath+File);
		System.out.println(data.getCellData("Sheet1", "Vaibhav", 2));
		System.out.println(data.getCellData("Sheet1", "Saurabh", 2));
		System.out.println(data.setCellData("Sheet1", "Vaibhav", 2, "456"));
		System.out.println(data.setCellData("Sheet1", "Saurabh", 2, "123"));
		System.out.println(data.getCellData("Sheet1", "Vaibhav", 2));
		System.out.println(data.getCellData("Sheet1", "Saurabh", 2));
		System.out.println(data.addColumn("Sheet1", "Ganesh"));
		System.out.println(data.addSheet("Saurabh"));
	}

}
