package ColorModel;


public class ColorToRGBVec extends ColorTo3dVec {

    @Override
    protected float get0() {
        return myColor.getRed();
    }

    @Override
    protected float get1() {
        return myColor.getBlue();
    }

    @Override
    protected float get2() {
        return myColor.getGreen();
    }

    @Override
    public String toString() {
        return "RGB";
    }
}
