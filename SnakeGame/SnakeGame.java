package SnakeGame;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class SnakeGame extends JPanel implements KeyListener {

    public static void main(String[] args) {
        SnakeGame game = new SnakeGame();
        JFrame frame = new JFrame("Snake Game");
        frame.add(game);
        frame.addKeyListener(game);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setFocusable(true);
    }

    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()) {
            case KeyEvent.VK_W: 
                System.out.println("Up"); 
                break;
            case KeyEvent.VK_S: 
                System.out.println("Down"); 
                break;
            case KeyEvent.VK_A: 
                System.out.println("Left"); 
                break;
            case KeyEvent.VK_D: 
                System.out.println("Right"); 
                break;
        }
    }

    // Required by KeyListener interface
    public void keyReleased(KeyEvent e) {
        // Empty - but required
    }

    public void keyTyped(KeyEvent e) {
        // Empty - but required
    }
}

