package Factory.que11;

public class Client {
    public static void main(String[] args) {
        Compressor compressor = CompressorFactory.createCompressor("zip");
        compressor.compress();

/*
        getting object form map
        Compressor compressor2 = CompressorFactory.createCompressor("zip");
        compressor2.compress();
*/
    }
}
