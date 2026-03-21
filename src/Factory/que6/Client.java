package Factory.que6;

public class Client {
    public static void main(String[] args) {
        ReportGenerator pdfExporter = new PDFGenerator();
        ReportGenerator excelExporter = new ExcelGenerator();


    }
}
