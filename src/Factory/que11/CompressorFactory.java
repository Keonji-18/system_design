package Factory.que11;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class CompressorFactory {
    public static Map<String, Supplier<Compressor>> compressorMap = new HashMap<>();

    public static Compressor createCompressor(String type){
        if(compressorMap.containsKey(type)){
            System.out.println("this got executed");
            return compressorMap.get(type).get();

        }
        else {
            switch (type.toLowerCase()){
                case "zip" :
                    compressorMap.put("zip", ZIPCompressor::new);
                    return compressorMap.get("zip").get();

                case "rar" :
                    compressorMap.put("rar",()-> RARCompressor::new);
                    return compressorMap.get("rar").get();

                case "gzip" :
                    compressorMap.put("gzip",()-> GZIPCompressor::new);
                    return compressorMap.get("gzip").get();

                default: throw new IllegalArgumentException("Type of compressor doesn't available");
            }
        }
    }
}
