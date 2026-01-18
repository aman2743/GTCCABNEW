package workingWithExcel;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataFromExcelSheetToApplicaion {

    @DataProvider(name = "DataSupplierNew")
    public Object[][] DataSupplier() throws IOException {
        File f = new File("D:\\SeleniumTestData\\Login.xlsx");
        System.out.println(f.exists());

        try (FileInputStream fis = new FileInputStream(f);
             XSSFWorkbook wb = new XSSFWorkbook(fis)) {

            XSSFSheet ws = wb.getSheetAt(1);
            int rowCount = ws.getLastRowNum(); // excludes header
            int columnCount = ws.getRow(0).getLastCellNum();

            Object[][] arr = new Object[rowCount][columnCount];

            for (int i = 0; i < rowCount; i++) {
                XSSFRow row = ws.getRow(i + 1); // skip header
                for (int j = 0; j < columnCount; j++) {
                    XSSFCell cell = row.getCell(j);
                    switch (cell.getCellType()) {
                        case STRING:
                            arr[i][j] = cell.getStringCellValue();
                            break;
                        case NUMERIC:
                            arr[i][j] = cell.getNumericCellValue(); // keep double
                            break;
                        case BOOLEAN:
                            arr[i][j] = cell.getBooleanCellValue();
                            break;
                        default:
                            arr[i][j] = null;
                    }
                }
                wb.close();
                 fis.close();
            }
            return arr;

        }

    }
}