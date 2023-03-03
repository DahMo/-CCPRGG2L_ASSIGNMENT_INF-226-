import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;

public class ColorMenu extends JFrame{

    // Jlist
    JList colorList;
    // Color arrays
    private String[] colorNameArray = {"GRAY", "LIGHT GRAY", "WHITE", "BLACK"};
    private Color[] colorClassArray = {Color.GRAY, Color.LIGHT_GRAY, Color.WHITE, Color.BLACK};
    
    ColorMenu(){

        JLabel imageLabel = new JLabel();
        ImageIcon catImage = new ImageIcon("color.gif");
        imageLabel.setIcon(catImage);
        this.add(imageLabel);

        JLabel label = new JLabel();
        label.setText("Choose ur color mhie");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setForeground(Color.WHITE);
        this.add(label);

        // Jlist
        colorList = new JList(colorNameArray);
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        colorList.setFont(new Font("Arial", Font.BOLD, 25));
        this.add(colorList);

        BGColorEventHandler bgcolorHandler = new BGColorEventHandler();
        colorList.addListSelectionListener(bgcolorHandler);

        this.add(colorList);

    
        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        // set background color of frame
        this.getContentPane().setBackground(Color.BLACK);
        // lock frame

    }

    private class BGColorEventHandler implements ListSelectionListener{

        public void valueChanged(ListSelectionEvent event){
            GamePanel gp = new GamePanel();
            gp.gameBGColor = colorClassArray[colorList.getSelectedIndex()];

            // open game frame
            new GameFrame();

            // Close color menu
            dispose();
        }
    }
}
