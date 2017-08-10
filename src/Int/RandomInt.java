package Int;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * Created by root on 8/10/17.
 */
public class RandomInt {
    public static void main(String args[]) throws IOException {
        File repeatintfile = new File("intrandom");
        BufferedWriter bw = new BufferedWriter(new FileWriter(repeatintfile));
        Random rd = new Random();
        for(int i=0; i<100000000; i++){
            bw.write(rd.nextInt()+"\n");
        }
        bw.flush();
        bw.close();
    }
}
