package game;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;


public class GameScreen {

  public static void main(String args[]) {
    JFrame gameScreen = new JFrame();



    // screen characteristics
    gameScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gameScreen.setVisible(true);
    gameScreen.getContentPane().setBackground(Color.black);
    gameScreen.setTitle("Snake! 🐍");
    gameScreen.setSize(900, 900);
    gameScreen.setLayout(new GridLayout(30, 30, 1, 1));
    gameScreen.setLocationRelativeTo(null);

    // make each grid square a panel for visibility
    for (int i = 0; i < 900; i++) {
      JPanel bckgrndPanel = new JPanel();
      bckgrndPanel.setBackground(Color.red);

      gameScreen.add(bckgrndPanel);
    }

    // make the snake
    JPanel snakePanel = new JPanel();
    snakePanel.setBackground(Color.green);


    System.out.println(gameScreen.getComponents());
    gameScreen.setResizable(true);
  }


}


// Snake Navigation System Design
// How should the game be set up such that the snake moves?
// A grid seems a good place to start. I need a means of identifying each cell as to allow the snake
// to move and also to place the food.
// What data structure should this identification system use? An array of each instance of JPanel may work
// as the index of each panel can identify it/it's cell.
// Or an array of arrays where each nested array contains row number and column number
// Or a hash/map?
// I need to consider how this will impact the difficulty of moving the snake and placing
// the food randomly in order to decide what's best, as well as perhaps efficiency (although
// that is not a priority here).
// I think a double array is the best way to go as the grid does not need to dynamically
// change size (it is fixed) and every cell is populated with a color to identify
// it as empty space, food, or the snake.
