import java.io.*;
import java.util.*;

public class Main{
	 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
        long n = Long.parseLong(br.readLine());
        br.close();
        
        bw.write(String.valueOf(((n-1)*n)/2+"\n"));
        bw.write("2");
        
        bw.flush();
        bw.close();
    }
}
