/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Mohamed
 */
public class SquarePanel extends JPanel {

    Square c;
    Color c1;

    public SquarePanel(Square c, Color c1) {
        this.c = c;
        this.c1 = c1;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(c1);
        g2.fillRect(95, 18, (int) c.width, (int) c.width);
        validate();
        repaint();
    }
}
