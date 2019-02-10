package ColorView;

import javax.swing.*;
import java.awt.*;

public class ColorPreviewer extends JPanel {
    public ColorPreviewer(){

    }
    public void setColor(Color color){
        setBackground(color);
        repaint();
    }

}
