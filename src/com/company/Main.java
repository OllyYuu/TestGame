package com.company;

import java.awt.Dimension;
import com.company.TestFrame;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

        public static void main(String[] args) {
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    TestFrame.createGUI();
                }
            });
        }
    }

