package Factory.que6;

public class ExcelGenerator implements ReportGenerator{

    @Override
    public Exporter createExporter() {
        return new ExcelExport();
    }
}
