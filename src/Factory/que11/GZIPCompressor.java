package Factory.que11;

public class GZIPCompressor implements Compressor{

    @Override
    public void compress() {
        System.out.println("Compressing to gzip ...");
    }
}
