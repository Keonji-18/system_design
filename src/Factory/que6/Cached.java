package Factory.que6;

import java.util.HashMap;
import java.util.Map;

public class Cached {
    ReportGenerator pdfGenerator = new PDFGenerator();
    ReportGenerator excelExporter = new ExcelGenerator();
    Map<String, Exporter> reportMap = new HashMap<>();

//    public Map<String, Report> getReportMap() {
//        return reportMap;
//    }
    public Exporter createReport(String temp){
        if(reportMap.containsKey(temp)){
            return reportMap.get(temp);
        }
        else {
            Application application = new Application(pdfGenerator);
            Exporter report = application.generateReport();
            reportMap.put(temp, report);
            return report;
        }
    }


}
