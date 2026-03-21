You have a ReportGenerator abstract class with a factory method createExporter() — subclasses return PDFExporter or ExcelExporter.
A new requirement says exporters must be cached — if the same type is requested twice, return the same instance.
Where should the caching logic live — in the factory method, in the concrete subclass, or in a separate layer?
Discuss the trade-offs with respect to SRP and the purpose of Factory Method.