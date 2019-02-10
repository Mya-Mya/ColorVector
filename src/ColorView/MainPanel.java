package ColorView;

import ColorModel.ColorToRGBVec;
import ColorModel.TwoColors;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    private TwoColors twoColors;

    private ColorPreviewer oneColorPrev=new ColorPreviewer();
    private ColorPreviewer anotherColorPrev=new ColorPreviewer();

    private FreshButtonListener freshButtonListener;
    private JLabel vecModeLabel=new JLabel();
    private JLabel underMessage=new JLabel();
    private JButton freshButton=new JButton();

    public MainPanel(FreshButtonListener fbl){
        this.freshButtonListener=fbl;

        setLayout(new BorderLayout());
        add(vecModeLabel,BorderLayout.NORTH);
        freshButton.addActionListener(e -> {freshButtonListener.fireFreshButton();});
        add(freshButton,BorderLayout.WEST);

        Panel colorsPreviewer=new Panel();
            colorsPreviewer.setLayout(new GridLayout(2,1));
            colorsPreviewer.add(oneColorPrev);
            colorsPreviewer.add(anotherColorPrev);
        add(colorsPreviewer,BorderLayout.CENTER);

        add(underMessage,BorderLayout.SOUTH);

        setVisible(true);
    }
    public void setVecMode(String vecMode){
        this.vecModeLabel.setText(vecMode);
    }
    public void setTwoColors(TwoColors twoColors){
        this.twoColors=twoColors;
        twoColors.setVecMode(new ColorToRGBVec());
        underMessage.setText(Double.toString( twoColors.getDistance() ) );
        oneColorPrev.setColor(twoColors.getTwoModels()[0].getColor());
        anotherColorPrev.setColor(twoColors.getTwoModels()[1].getColor());
        repaint();
    }
}
