import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFCell;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ExcelService {

    public static void writeToExcelSheet(List<Product> products, String filePath) {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Products");

        // Create header row
        HSSFRow headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("ID");
        headerRow.createCell(1).setCellValue("Name");
        headerRow.createCell(2).setCellValue("Category");
        headerRow.createCell(3).setCellValue("Buy Price");
        headerRow.createCell(4).setCellValue("Sell Price");
        headerRow.createCell(5).setCellValue("Expiration Date");
        headerRow.createCell(6).setCellValue("Quantity");

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Create data rows
        int rowNum = 1;
        for (Product product : products) {
            HSSFRow dataRow = sheet.createRow(rowNum++);
            dataRow.createCell(0).setCellValue(product.getId());
            dataRow.createCell(1).setCellValue(product.getName());
            dataRow.createCell(2).setCellValue(product.getCategory());
            dataRow.createCell(3).setCellValue(product.getBuyPrice());
            dataRow.createCell(4).setCellValue(product.getSellPrice());
            dataRow.createCell(5).setCellValue(product.getExpirationDate().format(dateFormatter));
            dataRow.createCell(6).setCellValue(product.getQuantity());
        }

        try {
            FileOutputStream fileOut = new FileOutputStream(filePath);
            workbook.write(fileOut);
            fileOut.close();
            System.out.println("Excel file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
