package ColorModel;

import java.awt.*;

public class ColorToHSBVec extends ColorTo3dVec {
   private float[] myHSB;

    @Override
    public void setColor(Color color) {
        super.setColor(color);
        myHSB=Color.RGBtoHSB(
                myColor.getRed(),myColor.getGreen(),myColor.getBlue(),null
        );
    }

    @Override
    protected float get0() {
        return myHSB[0];
    }

    @Override
    protected float get1() {
        return myHSB[1];
    }

    @Override
    protected float get2() {
        return myHSB[2];
    }

    @Override
    public String toString() {
        return "HSB";
    }
}
