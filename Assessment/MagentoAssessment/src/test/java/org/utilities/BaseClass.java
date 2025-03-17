package org.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;

	public static void launchBrowser() {
		driver = new ChromeDriver();
	}

	public static void maxBrowser() {
		driver.manage().window().maximize();
	}

	public static void closeBrowser() {
		driver.quit();
	}

	public static void launchUrl(String urlLoad) {
		driver.get(urlLoad);
	}

	public static void sendData(WebElement ele, String text) {
		ele.sendKeys(text);
	}

	public static void getSnap(String fileName) throws IOException {

		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File(fileName);
		FileUtils.copyFile(src, des);
	}

	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	public static void buttonClick(WebElement ele) {
		ele.click();
	}

	public static String excelData(String sheet, int rows, int cells) throws IOException {

		File f = new File("C:\\Users\\VISHAL\\Downloads\\Megneto\\Luma\\ExcelFiles\\Credential.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet s = w.getSheet(sheet);

		Row row = s.getRow(rows);

		Cell c = row.getCell(cells);

		String value = "";

		int cellType = c.getCellType();

		if (cellType == 1) {
			value = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			Date date = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("YYYY-MM-DD");
			value = sim.format(date);
		} else {
			double dd = c.getNumericCellValue();
			long l = (long) dd;
			value = String.valueOf(l);
		}
		return value;

	}

}
