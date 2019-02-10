package ColorModel;

import java.awt.*;
import java.util.Random;

public class ColorModel {
    private Color myColor;
    private ColorTo3dVec vecMode;

    public ColorModel(){
        makeRandomColor();
        setVecMode(new ColorToRGBVec());
    }

    public void setVecMode(ColorTo3dVec vecMode){
        this.vecMode=vecMode;
    }

    public float[] getVec(){
        this.vecMode.setColor(myColor);
        float[] result=vecMode.get3dVec();
        return result;
    }

    public void makeRandomColor(){
        Random r=new Random();
        Color c=new Color(
                (int)(r.nextFloat()*255),
                (int)(r.nextFloat()*255),
                (int)(r.nextFloat()*255));
        myColor=c;
    }

    public Color getColor(){
        return myColor;
    }
}
