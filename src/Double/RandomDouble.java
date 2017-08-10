package Double;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * Created by root on 8/10/17.
 */
public class RandomDouble {
    public static void main(String args[]) throws IOException {
        File repeatintfile = new File("doublerandom");
        BufferedWriter bw = new BufferedWriter(new FileWriter(repeatintfile));
        Random rd = new Random();
        double max = Math.pow(2,30);
        for(int i=0; i<50000000; i++){
            bw.write(rd.nextDouble()*max+"\n");
        }
        bw.flush();
        bw.close();
    }
}
