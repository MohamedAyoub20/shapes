/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import javafx.scene.shape.Ellipse;
import javax.swing.JPanel;

/**
 *
 * @author Mohamed
 */
public class CirclePanel extends JPanel {

    Circle c;
    Color color;

    public CirclePanel(Circle c, Color color) {
        this.c = c;
        this.color = color;
        

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(color);
        g2.fillOval(95, 18, (int) c.radios1, (int) c.radios1);
        validate();
        repaint();
    }

}
