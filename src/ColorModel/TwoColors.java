package ColorModel;

import java.awt.*;
import java.util.Random;

public class TwoColors {
    private ColorModel one;
    private ColorModel another;
    public TwoColors(){
        makeRandomColors();
    }

    private void makeRandomColors() {
        one=new ColorModel();
        another=new ColorModel();
    }

    public void setVecMode(ColorTo3dVec vecMode){
        one.setVecMode(vecMode);
        another.setVecMode(vecMode);
    }

    public ColorModel[] getTwoModels(){
        ColorModel[] result=new ColorModel[2];
        result[0]=one;
        result[1]=another;
        return result;
    }

    public double getDistance(){
        double distance=0.000f;
        float[] oneVec=one.getVec();
        float[] anotherVec=another.getVec();
        for(int i=0;i<oneVec.length;i++){
            distance+=Math.pow(
                    (double)(oneVec[i]-anotherVec[i]),
                    2);
        }
        distance=Math.sqrt(distance);
        return distance;
    }

}
