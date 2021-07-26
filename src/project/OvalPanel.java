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
public class OvalPanel extends JPanel {

    Oval o;
    Color c;

    public OvalPanel(Oval o, Color c) {
        this.o = o;
        this.c = c;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(c);
        g2.fillOval(95, 18, (int) o.radios1, (int) o.radios2);
        validate();
        repaint();
    }

}
