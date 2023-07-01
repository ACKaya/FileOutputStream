import java.io.File;
import java.io.FileOutputStream;
public class Main {
    public static void main(String[] args) {
       String str="\nI love Java";
        try{
            FileOutputStream out=new FileOutputStream("test",true);
            byte[] arr=str.getBytes();
            out.write(arr);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
