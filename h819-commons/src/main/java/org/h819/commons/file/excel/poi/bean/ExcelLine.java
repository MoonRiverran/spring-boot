package org.h819.commons.file.excel.poi.bean;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Description : TODO(excel 行数据，单元格无内容时，跳过，所以单元格可以不连续)
 * User: h819
 * Date: 2014-10-20
 * Time: 12:29
 * To change this template use File | Settings | File Templates.
 */
public class ExcelLine {

    private String fileName = "";
    private int SheetNmuber = 0;
    private int lineNumber = 0;

    //有序 Set ，按添加顺序。
    private Set<ExcelCell> cellValues = new LinkedHashSet();


    public ExcelLine() {

    }

    /**
     * 构造 Excel 行数据
     *
     * @param fileName    行所在文件名称
     * @param SheetNmuber 行所在 sheet 名称
     * @param lineNumber  行号
     * @param cellValues  行单元格
     */
    public ExcelLine(String fileName, int SheetNmuber, int lineNumber, Set<ExcelCell> cellValues) {

        this.fileName = fileName;
        this.SheetNmuber = SheetNmuber;
        this.lineNumber = lineNumber;
        this.cellValues = cellValues;

    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getSheetNmuber() {
        return SheetNmuber;
    }

    public void setSheetNmuber(int sheetNmuber) {
        SheetNmuber = sheetNmuber;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public Set<ExcelCell> getCellValues() {
        return cellValues;
    }

    public void setCellValues(Set<ExcelCell> cellValues) {
        this.cellValues = cellValues;
    }

    /**
     * 增加一个单元格
     *
     * @param cellValue
     */
    public void addCellValue(ExcelCell cellValue) {
        this.cellValues.add(cellValue);
    }

}
