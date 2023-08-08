package resuable;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelHandling {


    public static String readSheet(String sheetName,int row,int col) throws IOException {
        FileInputStream fig=new FileInputStream("src/main/resources/excel_sheet/");
        XSSFWorkbook workbook=new XSSFWorkbook(fig);
        XSSFSheet sheet=workbook.getSheet(sheetName);
        String cellValue=sheet.getRow(row).getCell(col).getStringCellValue();
        return cellValue;
    }
}
