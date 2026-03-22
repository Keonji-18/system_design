package Factory;

public abstract class DocumentParser {
//     public  Parse createParser(){
////         checkFileExtension();
//
//     }

    String fileName;
     public static String getFileExtension(String fileName){
         int dotIndex = fileName.indexOf(".");
         return fileName.substring(dotIndex+1);
     }

     public static Parse createParse(String fileName){
         String fileExtension = getFileExtension(fileName);
         if(fileExtension.equals("json")){
             return new JSONParse();
         }else if (fileExtension.equals("xml")){
             return new XMLParse();
         }else {
             throw new IllegalArgumentException("Can not parse this type of File");
         }
     }


}
