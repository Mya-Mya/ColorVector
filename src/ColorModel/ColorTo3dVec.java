package ColorModel;

import java.awt.*;

public abstract class ColorTo3dVec {
    protected Color myColor;
    public ColorTo3dVec(){
        myColor=Color.BLACK;
    }
    public void setColor(Color color){
        myColor=color;
    }
    public float[] get3dVec(){
        float[] result=new float[3];
        result[0]=get0();
        result[1]=get1();
        result[2]=get2();

        //ベクトルの大きさを1にする
        double size=Math.sqrt(
                Math.pow(result[0],2)+Math.pow(result[1],2)+Math.pow(result[2],2)
        );
        for(int i=0;i<result.length;i++)result[i]/=size;

        return result;
    }
    abstract protected float get0();
    abstract protected float get1();
    abstract protected float get2();
}
