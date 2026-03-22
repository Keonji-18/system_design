package Factory;

public class Client{
    public static void main(String[] args){
        Parse parse = DocumentParser.createParse("example.json");
        parse.parse();

        Parse parse1 = DocumentParser.createParse("example.xml");
        parse1.parse();

    }
}