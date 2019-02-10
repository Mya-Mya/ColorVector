package ColorView;

import ColorModel.TwoColors;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame
implements FreshButtonListener
{
    private MainPanel myPanel;

    public MainFrame(){
        super();
        setName("色をベクトルに");
        setPreferredSize(new Dimension(700,700));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        myPanel=new MainPanel(this);
        add(myPanel);

        pack();
        setVisible(true);
    }

    @Override
    public void fireFreshButton() {
        freshNewTwoColors();
    }

    private void freshNewTwoColors(){
        TwoColors tc=new TwoColors();
        myPanel.setTwoColors(tc);
    }
}
