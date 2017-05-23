package tool.convert;

/**
 * Author: shuyunguo
 * Date: 2017/5/23
 */
public class ReadExcelTest {
    public static void main(String[] args){
        ExcelUtil excelUtil=ExcelUtil.getInstance();

        excelUtil.readFile("/Users/shuyunguo/Downloads/industry.xlsx");
    }
}
