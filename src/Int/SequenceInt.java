package Int;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * Created by root on 8/10/17.
 */
public class SequenceInt {
    public static void main(String args[]) throws IOException {
        File repeatintfile = new File("intsequence");
        BufferedWriter bw = new BufferedWriter(new FileWriter(repeatintfile));
        Random rd = new Random();
        double skipchance = 0.2;
        int num = 0;
        for(int i=0; i<100000000; i++){
            while (rd.nextDouble()<0.2){
                num++;
            }
            num++;
            bw.write(num+"\n");
        }
        bw.flush();
        bw.close();
    }
}
