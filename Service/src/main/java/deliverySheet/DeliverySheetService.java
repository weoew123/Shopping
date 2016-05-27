package deliverySheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DeliverySheetService {
	public void DelivertSheetRead() {
		File file = new File("/Users/qwe/Documents/TEST.xlsx");
		XSSFWorkbook workbook;
		try {
			workbook = new XSSFWorkbook(new FileInputStream(file));
			// List<ShoppingVo> list = new ArrayList<ShoppingVo>();
			// 첫번재 sheet 내용 읽기
			for (Row row : workbook.getSheetAt(0)) {
				// 둘째줄부
				if (row.getRowNum() < 2) {
					continue;
				}

				// 두번째 셀이 비어있으면 for문을 멈춘다.
				if (row.getCell(1) == null) {
					break;
				}
				Cell cellProduct = row.getCell(1);
				Cell cellPrice = row.getCell(2);
				Cell cellCompany = row.getCell(3);

				// list.add(new ShoppingVo(cellProduct.getStringCellValue(),cellPrice.getNumericCellValue(),cellCompany.getStringCellValue()));
				System.out.println("상품명 : "+cellProduct+", 상품가격 : "+cellPrice+", 상호명 : "+cellCompany);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
