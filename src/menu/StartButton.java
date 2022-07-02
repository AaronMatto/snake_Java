package menu;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartButton extends JLabel implements ActionListener {


  public static void main(String args[]){
    StartButton startButton = new StartButton();
  }



  JButton startButton;
  JLabel buttonLabel;

  StartButton(){
    startButton = new JButton();

    startButton.setText("Start Game!");
    startButton.setFocusable(false);
    startButton.setHorizontalTextPosition(JButton.CENTER);
    startButton.setVerticalTextPosition(JButton.CENTER);
    // startButton.setFont(new Font("Comic Sans", Font.BOLD, 15));
    startButton.setBackground(Color.orange);
    startButton.addActionListener(this);

    this.setLayout(null);
    this.setBackground(Color.red);
    this.setOpaque(true);
    this.add(startButton);
  }


  @Override
  public void actionPerformed(ActionEvent e) {

  }


}
