package Factory.que6;

public class PDFGenerator implements ReportGenerator{

    @Override
    public Exporter createExporter() {
        return new PDFExport();
    }
}
