import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import javax.swing.text.DateFormatter;
import java.io.File;
import java.io.IOException;

public class DataLoader {

    public static final String SAMPLE_XLSX_FILE_PATH ="C:/Users/WinPuX/Desktop/სასტუმრო.xlsx";

    public static void main(String[] args) throws IOException, InvalidFormatException {

        // Creating a Workbook from an Excel file (.xls or .xlsx)
        Workbook workbook = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH));
        Sheet sheet = workbook.getSheetAt(0);
        for(Row row : sheet) {
            for(Cell cell : row) {
                DataFormatter dataFormatter = new DataFormatter();
                String x = dataFormatter.formatCellValue(cell);
                System.out.println(x);
            }
        }


        // Retrieving the number of sheets in the Workbook
        System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");
    }
}
