package menu;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MainMenu {
  public static void main(String args[]){
    JFrame menuScreen = new JFrame();

    // menu characteristics
    menuScreen.setTitle("Snake! 🐍");
    menuScreen.setSize(600, 600);
    menuScreen.setResizable(true);
    menuScreen.getContentPane().setBackground(Color.black);
    menuScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // add snake icon to menu
    ImageIcon snakeIcon = new ImageIcon("icon.png");
    menuScreen.setIconImage(snakeIcon.getImage());

    // add snake image to background of menu
    JLabel background_label = new JLabel();
    ImageIcon snakeIconImg = new ImageIcon("/Users/master/code/Java/snake_Java/src/menu/snake.png");
    Image snakeImage = snakeIconImg.getImage();
    Image smallerSnakeImage = snakeImage.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
    snakeIconImg = new ImageIcon(smallerSnakeImage);
    background_label.setIcon(snakeIconImg);
    background_label.setBackground(Color.black);
    background_label.setVerticalAlignment(JLabel.CENTER);
    background_label.setHorizontalAlignment(JLabel.LEFT);
    background_label.setOpaque(true);
    background_label.setBounds(10, 150, 600, 600);

    // move snake image to left of frame
    menuScreen.setLayout(null);

    // add game title
    JLabel gameTitle = new JLabel();
    gameTitle.setText("S n a k e  !");
    gameTitle.setForeground(Color.white);
    gameTitle.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 50));
    gameTitle.setBounds(600, 50, 500, 80);
    gameTitle.setVerticalTextPosition(JLabel.TOP);

    // StartButton startButton = new StartButton();


    // menuScreen.add(startButton);
    // menuScreen.add(exit_button);
    menuScreen.add(gameTitle);
    menuScreen.add(background_label);
    menuScreen.setVisible(true);

  }
}
