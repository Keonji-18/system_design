package Factory.que6;

public class Application {
    public ReportGenerator generator;
    public Application(ReportGenerator generator){
        this.generator = generator;
    }
    public Exporter generateReport(){
        return this.generator.createExporter();
    }

}
