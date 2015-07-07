package com.company;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

/**
 * Created by OllyYuu on 21.06.2015.
 */
public class TestFrame {


        public static void createGUI() {
           // JFrame.setDefaultLookAndFeelDecorated(true);
            JFrame frame = new JFrame("Test frame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.getContentPane().setLayout(null);
            frame.setPreferredSize(new Dimension(675, 695));
            frame.getContentPane().setBackground(Color.black);

            Field field = new Field();
            field.setField();

            final GameView gameView = new GameView(field);
            gameView.setBounds(10, 10, 10*GameView.CELL_SIZE, 10*GameView.CELL_SIZE);
            //gameView.setPreferredSize(new Dimension(10*GameView.CELL_SIZE,10*GameView.CELL_SIZE));
            frame.getContentPane().add(gameView);

         //   JTextField tf = new JTextField();
        //    tf.setSize(0, 25);
          //  tf.setLocation(10, 10);

            frame.addKeyListener(new KeyListener() {
                public void keyPressed(KeyEvent e) {
                    System.out.println("keyPressed");
                    System.out.println(e.getKeyCode());
                    gameView.setCell(e.getKeyCode());
                    gameView.repaint();

                }

                public void keyReleased(KeyEvent e) {
                    System.out.println("keyReleased");
                    System.out.println(e.getKeyCode());

                }

                public void keyTyped(KeyEvent e) {
                    System.out.println("keyTyped");
                    System.out.println(e.getKeyChar());
                }
            });

        //    frame.getContentPane().setLayout(null);
        //    frame.getContentPane().add(tf);
           // tf.setVisible(false);


            frame.pack();
            frame.setVisible(true);
        }

}
