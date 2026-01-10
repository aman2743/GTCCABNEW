package workingWithExcel;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataFromExcelSheet {
    public static void main(String[] args) throws IOException {
   File f=new File("D:\\SeleniumTestData\\Login.xlsx");
        System.out.println(f.exists());
        FileInputStream fis=new FileInputStream(f);
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        XSSFSheet ws =wb.getSheetAt(1);
        int rowCount=ws.getLastRowNum();
        System.out.println(rowCount);
        int columnCount=ws.getRow(0).getLastCellNum();
        System.out.println(columnCount);
      for(int i=1;i<=rowCount;i++){
          XSSFRow row=ws.getRow(i);
          System.out.println();
          for(int j=0;j<columnCount;j++){
              XSSFCell cell=row.getCell(j);
              CellType celltype=cell.getCellType();
              switch (celltype){
                  case STRING:
                      System.out.print(cell.getStringCellValue());  ;
                      System.out.print(" ");
                     break;
                  case NUMERIC:
//                      int intValue=(int)cell.getNumericCellValue();
                      System.out.println((int)cell.getNumericCellValue()); ;
                      System.out.print(" ");
                      break;
                  case BOOLEAN:
                      cell.getBooleanCellValue();
                     break;
                  default :
                      System.out.println("Incorrect cell type");
              }
          }
      }

    }
}
