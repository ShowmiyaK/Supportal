package org.datadriven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DataDriven {
	  static WebDriver driver;
	    WebDriverWait wait;
	    XSSFWorkbook w;
	    XSSFSheet S;
	    XSSFRow r;
	    XSSFCell s;
	    public static String readData(int row, int col,String sheetname) throws Throwable {
	    File file = new File("C:\\Users\\showmiya.k\\eclipse-workspace\\SupportalHealth\\src\\test\\resources\\Excel files\\TestData.xlsx");
	    FileInputStream fis = new FileInputStream(file);
	    Workbook W = WorkbookFactory.create(fis);
	    Sheet S = W.getSheet(sheetname);
	    //System.out.println(S);
	    Row r = S.getRow(row);
	    Cell s = r.getCell(col);
	    String data = s.toString();
	    return data;
	    }


}
