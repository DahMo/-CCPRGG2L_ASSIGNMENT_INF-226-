import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TryAgain extends JFrame{
    private Object g;

    TryAgain(){
        
        JLabel imageLabel = new JLabel();
        ImageIcon catImage = new ImageIcon("hays.gif");
        imageLabel.setIcon(catImage);
        this.add(imageLabel);
        
        JLabel label = new JLabel();
        label.setText("Dissapoints in kermit*");
        label.setFont(new Font("Arial", Font.BOLD, 25));
        label.setForeground(Color.WHITE);
        this.add(label);

        


        JButton tryAgainButton = new JButton();
        tryAgainButton.setText("Play Again");
        tryAgainButton.setFont(new Font("Arial", Font.BOLD, 25));
        TryAgainEventHandler tryHandler = new TryAgainEventHandler();
        tryAgainButton.addActionListener(tryHandler);

        JButton exitButton = new JButton();
        exitButton.setText("Exit");
        exitButton.setFont(new Font("Arial", Font.BOLD, 25));
        ExitEventHandler exithandler = new ExitEventHandler();
        exitButton.addActionListener(exithandler);

        this.add(tryAgainButton);
        this.add(exitButton);

        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(850,550);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        // set background color of frame
        this.getContentPane().setBackground(Color.black);
    }

    private class TryAgainEventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            App.main(null);
            dispose();
        }
    }

    private class ExitEventHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            dispose();
        }
    }
}
