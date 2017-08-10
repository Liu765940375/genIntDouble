package Double;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * Created by root on 8/10/17.
 */
public class RepeateDouble {
    public static void main(String args[]) throws IOException {
        File repeatintfile = new File("doublerepeat");
        BufferedWriter bw = new BufferedWriter(new FileWriter(repeatintfile));
        Random rd = new Random();
        double distinct = 0.9;
        double repeatnum = 0,min = 0,max = Math.pow(2,30);
        int repeatsize=0;
        for(int i=0; i<50000000; i++){
            if(rd.nextDouble()>distinct){
                bw.write(rd.nextDouble()*max+"\n");
            }else{
                if(repeatsize==0){
                    repeatsize = Math.abs((int)rd.nextGaussian()*100);
                    repeatnum = rd.nextDouble()*max;
                    bw.write(repeatnum+"\n");
                }else{
                    bw.write(repeatnum+"\n");
                    repeatsize--;
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
