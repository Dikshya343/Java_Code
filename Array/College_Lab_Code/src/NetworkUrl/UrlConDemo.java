package NetworkUrl;
import java.net.*;
import java.io.*;
public class UrlConDemo {
    public static void main(String args[])throws Exception {
        URL url = new URL("https://www.facebook.com");
        URLConnection con = url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
        while(true){
            String line = br.readLine();
            if(line == null){
                break;
            }
            System.out.println(line);
        }
        br.close();

    }
}
