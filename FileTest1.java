import java.io.*;
public class FileTest1 {
    public static void main(String[] args) {
        File file=new File("D:/myword","word.txt");
        if(file.exists()){
            String name=file.getName();
            long length=file.length();
            boolean hidden=file.isHidden();
            System.out.println("File name is: "+name);
            System.out.println("File length is: "+length);
            System.out.println("File is not display? "+hidden);
        }
        else {
            System.out.println("File is nonono!!!");
        }
    }
}
