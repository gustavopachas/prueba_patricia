package com.everis.base.util;

public class DomWebServices {

    public void guardarResultadosTablaDatos(String rowIndex, String excelName, String sheetName, String columnName, String value) throws Throwable {
        Util.updateExcel(rowIndex, excelName, sheetName, columnName, value);
    }

}