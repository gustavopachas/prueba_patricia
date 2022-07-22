package com.everis.base.util;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Util {
    private static FileInputStream file;


    public static void updateExcel(String rowIndex, String excelName, String sheetName, String columnName, String valueCell) throws Throwable {

        file = new FileInputStream(new File("data/" + excelName + ".xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet(sheetName);

        int columnIndexTestCase = getIndexTitleColumn(excelName, sheetName, Parameters.columnTestCase);
        int columnIndexRunTest = getIndexTitleColumn(excelName, sheetName, Parameters.columnRunTest);
        int indexFindColumn = getIndexTitleColumn(excelName, sheetName, columnName);

        for (Row row : sheet) {
            Cell cellTestCase = row.getCell(columnIndexTestCase);

            if (!cellTestCase.getStringCellValue().isEmpty() && row.getRowNum() > 0 && cellTestCase.getStringCellValue().equals("Test " + rowIndex)) {
                Cell cell = row.getCell(columnIndexRunTest);
                if (cell != null) {
                    Cell cellReq = row.getCell(columnIndexRunTest);
                    Row rowOnlyYes = sheet.getRow(cellReq.getRowIndex());
                    Cell newCell = rowOnlyYes.getCell(indexFindColumn);
                    if (newCell == null) {
                        newCell = rowOnlyYes.createCell(indexFindColumn);
                    }
                    newCell.setCellValue(valueCell);
                }

                break;

            }


        }

        FileOutputStream fileOut = new FileOutputStream("data/" + excelName + ".xlsx");
        workbook.write(fileOut);
        fileOut.close();
    }

    public static int getIndexTitleColumn(String excel, String sheetName, String columnName) throws Throwable {
        int columnIndex = 0;
        file = new FileInputStream(new File("data/" + excel + ".xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet(sheetName);
        Row row = sheet.getRow(0);
        for (Cell cell : row) {
            if (cell.getStringCellValue().equals(columnName)) {
                columnIndex = cell.getColumnIndex();
            }
        }
        return columnIndex;
    }

    public static String ReadCellData(String vRow, int vColumn) {
        String value = "";

        try {
            file = new FileInputStream(new File("data/Data_Wio.xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheetAt(0);
            Row row = sheet.getRow(Integer.valueOf(vRow));
            Cell cell = row.getCell(vColumn);
            value = cell.getStringCellValue();

        } catch (IOException e1) {
            e1.printStackTrace();

        }

        return value;
    }
}