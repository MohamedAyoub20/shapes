/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Mohamed
 */
public class testing extends JFrame {

    public testing() throws HeadlessException {
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.setSize(6, 6);
        this.add(b);
        this.add(new JLabel());
        

    }
    JButton b = new JButton();

    
    
    private class DrawStuff extends JComponent {

        @Override
        public void paint(Graphics g) {
            Graphics2D graphics2D = (Graphics2D) g;
            graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            Line2D.Float line = new Line2D.Float(20, 90, 55, 250);
            graphics2D.setPaint(Color.BLUE);
            graphics2D.draw(line);

        }
    }

}
