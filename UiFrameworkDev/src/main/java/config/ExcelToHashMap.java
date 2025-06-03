package config;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExcelToHashMap {

    public static void main(String[] args) {
        String excelFilePath = System.getProperty("user.dir")+"/src/test/resources/Automation.xlsx"; // Replace with your file path
        Map<String, String> excelData = readExcelData(excelFilePath);

        if (excelData != null) {
            excelData.forEach((key, value) -> System.out.println(key + ": " + value));
        }
        
        System.out.println(excelData.get("username"));
    }


    public static Map<String, String> readExcelData(String filePath) {
        Map<String, String> dataMap = new HashMap<>();
        try (FileInputStream file = new FileInputStream(new File(filePath));
             Workbook workbook = new XSSFWorkbook(file)) {

            Sheet sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet
            Row headerRow = sheet.getRow(0);

            if (headerRow == null) {
                System.out.println("No header row found.");
                return null;
            }

            // Extract header values for keys
            String keyHeader = headerRow.getCell(0).getStringCellValue();
            String valueHeader = headerRow.getCell(1).getStringCellValue();

            for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
                Row row = sheet.getRow(rowIndex);
                if (row != null) {
                    Cell keyCell = row.getCell(0);
                    Cell valueCell = row.getCell(1);

                    // Extract key and value from cells
                    String key = (keyCell != null) ? getCellValueAsString(keyCell) : "";
                    String value = (valueCell != null) ? getCellValueAsString(valueCell) : "";

                    dataMap.put(key, value);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return dataMap;
    }

    private static String getCellValueAsString(Cell cell) {
        if (cell == null) {
            return "";
        }
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                return String.valueOf(cell.getNumericCellValue());
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                try{
                    return String.valueOf(cell.getNumericCellValue());
                } catch (IllegalStateException e){
                    return cell.getStringCellValue();
                }
            default:
                return "";
        }
    }
}