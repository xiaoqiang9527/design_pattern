import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Description:
 * @Author qin
 * @Date 2017/12/19
 */
public class test {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("语文", "数学", "外语", "物理", "化学", "生物", "政治");

        List<String> list = new ArrayList<>();
        list.add("物理");
        list.add("化学");
        list.add("生物");
        list.add("政治");
        list.add("历史");
        list.add("地理");
        list.add("语文");
        list.add("数学");
        list.add("英语");
        list.add("体育");

        // 操作方式1：while（Iterator）：不报错
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if ("数学".equals(s)) {
                it.remove();
            }
        }


        String number = "22";
        //数字对应的汉字
        String[] num = {"", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
        //单位
        String[] unit = {"", "十", "百", "千"};
        //将输入数字转换为字符串
        String result = String.valueOf(number);
        //将该字符串分割为数组存放
        char[] ch = result.toCharArray();
        //结果 字符串
        String str = "";
        int length = ch.length;
        for (int i = 0; i < length; i++) {
            int c = (int) ch[i] - 48;
            if (c == 1 && length == 2 && length - i != i) {
                str += unit[c];
            } else if (c != 0 && c > 1) {
                str += num[c] + unit[length - i - 1];
            } else {
                str += num[c];
            }
        }
        System.out.println(str);


        try {
            FileOutputStream fos = new FileOutputStream("D:\\13.xls");

            Workbook wb = new HSSFWorkbook();

            Sheet sheet = wb.createSheet();
        /*
         * 设定合并单元格区域范围
         *  firstRow  0-based
         *  lastRow   0-based
         *  firstCol  0-based
         *  lastCol   0-based
         */
            CellRangeAddress cra = new CellRangeAddress(0, 3, 3, 9);

            //在sheet里增加合并单元格
            sheet.addMergedRegion(cra);

            Row row = sheet.createRow(0);

            Cell cell_1 = row.createCell(3);

            cell_1.setCellValue("When you're right , no one remembers, when you're wrong ,no one forgets .");

            //cell 位置3-9被合并成一个单元格，不管你怎样创建第4个cell还是第5个cell…然后在写数据。都是无法写入的。
            Cell cell_2 = row.createCell(10);

            cell_2.setCellValue("what's up ! ");

            wb.write(fos);

            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int id = 3;
        int nums = Math.abs(id - 1);
        System.out.println(nums);


    }


}


