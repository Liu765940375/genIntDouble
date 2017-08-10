package Int;

import java.io.*;
import java.util.Random;

/**
 * Created by root on 8/9/17.
 */
public class RepeatInt {
    public static void main(String args[]) throws IOException{
        File repeatintfile = new File("intrepeat");
        BufferedWriter bw = new BufferedWriter(new FileWriter(repeatintfile));
        Random rd = new Random();
        double distinct=0.9;
        int repeatnum=0,repeatsize=0;
//        int range = Math.abs(rd.nextInt());
        int range = (int)Math.pow(2,31);
        for(int i=0;i<100000000;i++){
            if(rd.nextDouble()>distinct){
                bw.write(rd.nextInt(range)+"\n");
            }else{
                if(repeatsize==0){
                    repeatsize = Math.abs((int)rd.nextGaussian()*100);
                    repeatnum = rd.nextInt(range);
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
