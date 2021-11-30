import java.io.*;
public class FileTest2 {
    public static void main(String[] args) {
        File file=new File("d:/myword","word.txt");
        try {
            FileOutputStream out = new FileOutputStream(file);
            byte buy[] = "woyouyizhixiaomaoli,woconglaiyebuqi.".getBytes();
            out.write(buy);
            out.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
        try {
            FileInputStream in = new FileInputStream(file);
            byte byt[] = new byte[1024];
            int len = in.read(byt);
            System.out.println("File is info: " + new String(byt, 0, len));
            in.close();
        }catch(Exception e){
            e.printStackTrace();

        }
    }
}
