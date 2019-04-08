import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Open {
    public static void main(String[] argc){
        String arr = new String();
        int cnt = 0;

        try{
            File file = new File("/root/Desktop/LogActivity.java");
            Scanner scan = new Scanner(file);
            while( scan.hasNextLine()){
                arr = scan.nextLine();
                if(arr.indexOf("Log.e")>-1){
                    System.out.println("find!");
                    cnt++;
                }
            }if(cnt == 0) System.out.println("Can't find");
        }catch (FileNotFoundException e){
            System.out.println("No file");
        }
    }

}

