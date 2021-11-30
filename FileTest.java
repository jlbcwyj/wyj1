import java.io.File;
public class FileTest {
    public static void main(String[] args) {
        File file=new File("D:/myword","word.txt");
        if(file.exists()){
            file.delete();
            System.out.println("File is delete!!!");
        }else{
            try{
                file.createNewFile();
                System.out.println("File is create");
            }catch (Exception e ){
                e.printStackTrace();
            }
        }
    }
}
