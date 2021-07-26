/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import com.sun.webkit.ColorChooser;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Mohamed
 */
public class ProjectUserInterface extends JFrame {

    JScrollBar bar = new JScrollBar();
    JLabel width = new JLabel("width ", SwingConstants.LEFT);
    JLabel legnth = new JLabel("legnth ", SwingConstants.LEFT);
    JLabel hight = new JLabel("hight ", SwingConstants.LEFT);
    JTextField widthField = new JTextField(10);
    JTextField legnthField = new JTextField(10);
    JTextField hightField = new JTextField(10);
    JButton calculate = new JButton("calculate");
    JTextArea result = new JTextArea();
    ButtonGroup group = new ButtonGroup();
    JRadioButton twoDims = new JRadioButton("2D");
    JRadioButton threeDims = new JRadioButton("3D");
    String[] twoDimsStrings = {"", "rectangle", "triangle", "square", "circle", "oval"};
    String[] threeDimsStrings = {"", "cube", "cylinder", "sphere", "cuboid"};
    JComboBox<String> twoDimsShapes = new JComboBox<>(twoDimsStrings);
    JComboBox<String> threeDimsShapes = new JComboBox<>(threeDimsStrings);
    JButton draw = new JButton("draw");
    JPanel drawingArea = new JPanel();
    JButton chooseColor = new JButton("chooseColor");
    Color shapeColor = Color.BLUE;

    public ProjectUserInterface() {
        setTitle("the shapes calculator");
        setSize(500, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container pane = getContentPane();
        pane.setLayout(new GridLayout(7, 2));
        twoDims.setSelected(true);
        threeDimsShapes.setEnabled(false);
        group.add(twoDims);
        group.add(threeDims);
        add(twoDims);
        add(threeDims);
        add(twoDimsShapes);
        add(threeDimsShapes);
        add(width);
        add(widthField);
        add(legnth);
        add(legnthField);
        add(hight);
        add(hightField);
        add(calculate);
        add(result);
        result.add(bar);
        add(draw);
        add(chooseColor);

        chooseColor.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                shapeColor = JColorChooser.showDialog(null, "choose color", shapeColor);

            }
        });

        draw.addActionListener((ActionEvent e) -> {
            JFrame frame = new JFrame();
            frame.setVisible(true);
            frame.setSize(500, 500);
            frame.setDefaultCloseOperation(HIDE_ON_CLOSE);

            Shape2D shape2D;
            switch (twoDimsShapes.getSelectedItem().toString()) {
                case "square":
                    shape2D = new Square(Double.parseDouble(legnthField.getText()));
                    SquarePanel s = new SquarePanel((Square) shape2D, shapeColor);
                    frame.add(s);
                    break;

                case "rectangle":
                    shape2D = new Rectangle(Double.parseDouble(legnthField.getText()), Double.parseDouble(widthField.getText()));
                    RectanglePanel r = new RectanglePanel((Rectangle) shape2D, shapeColor);
                    frame.add(r);
                    break;
                case "circle":
                    shape2D = new Circle(Double.parseDouble(legnthField.getText()));
                    CirclePanel c = new CirclePanel((Circle) shape2D, shapeColor);
                    frame.add(c);
                    break;
                case "oval":
                    shape2D = new Oval(Double.parseDouble(legnthField.getText()), Double.parseDouble(widthField.getText()));
                    OvalPanel p = new OvalPanel((Oval) shape2D, shapeColor);
                    frame.add(p);

                    break;
            }

        });
        twoDimsShapes.addActionListener((ActionEvent e) -> {
            JComboBox cb = (JComboBox) e.getSource();
            String shape1 = cb.getSelectedItem().toString();
            hight.setVisible(false);
            hightField.setVisible(false);
            switch (shape1) {
                case "triangle":
                    width.setVisible(false);
                    widthField.setVisible(false);
                    legnth.setText("length");
                    break;
                case "rectangle":
                    width.setVisible(true);
                    widthField.setVisible(true);
                    width.setText("width");
                    legnth.setText("length");

                    break;
                case "circle":
                    legnth.setText("redious");
                    width.setVisible(false);
                    widthField.setVisible(false);
                    break;
                case "square":
                    width.setVisible(false);
                    widthField.setVisible(false);
                    legnth.setText("length");

                    break;
                case "oval":
                    width.setVisible(true);
                    widthField.setVisible(true);
                    legnth.setText("long radiuos");
                    width.setText("short radious");
            }
        });

        twoDims.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                threeDimsShapes.setEnabled(false);
                twoDimsShapes.setEnabled(true);
                hight.setVisible(false);
                hightField.setVisible(false);
                threeDimsShapes.setSelectedIndex(0);
                twoDimsShapes.setSelectedIndex(0);
                width.setVisible(false);
                widthField.setVisible(false);
                legnth.setVisible(false);
                legnthField.setVisible(false);
            }
        });
        threeDims.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                twoDimsShapes.setEnabled(false);
                threeDimsShapes.setEnabled(true);
                width.setVisible(false);
                widthField.setVisible(false);
                legnth.setVisible(false);
                legnthField.setVisible(false);
                hight.setVisible(false);
                hightField.setVisible(false);
                threeDimsShapes.setSelectedIndex(0);
                twoDimsShapes.setSelectedIndex(0);
            }
        });
        threeDimsShapes.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                JComboBox cb = (JComboBox) e.getSource();
                String shape = cb.getSelectedItem().toString();
                width.setVisible(false);
                widthField.setVisible(false);
                legnth.setVisible(false);
                legnthField.setVisible(false);
                switch (shape) {

                    case "cube":
                        width.setVisible(false);
                        widthField.setVisible(false);
                        legnth.setVisible(false);
                        legnthField.setVisible(false);
                        hight.setText("legnth");

                        break;
                    case "cylinder":
                        width.setVisible(false);
                        widthField.setVisible(false);
                        legnth.setVisible(true);
                        legnthField.setVisible(true);
                        hight.setVisible(true);
                        hightField.setVisible(true);
                        legnth.setText("redious");
                        hight.setText("hight");
                        break;

                    case "sphere":
                        legnth.setText("redious");
                        width.setVisible(false);
                        widthField.setVisible(false);
                        hight.setVisible(false);
                        hightField.setVisible(false);
                        legnth.setVisible(true);
                        legnthField.setVisible(true);
                        break;
                    case "cuboid":
                        width.setVisible(true);
                        widthField.setVisible(true);
                        hight.setVisible(true);
                        hightField.setVisible(true);
                        legnth.setVisible(true);
                        legnthField.setVisible(true);
                        legnth.setText("length");
                        width.setText("width");
                        hight.setText("hight");
                }
            }
        });
        calculate.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (twoDims.isSelected()) {
                    Shape2D shape2D;
                    switch (twoDimsShapes.getSelectedItem().toString()) {
                        case "square":
                            shape2D = new Square(Double.parseDouble(legnthField.getText()));
                            result.setText(shape2D.toString());
                            break;
                        case "triangle":
                            shape2D = new Triangle(Double.parseDouble(legnthField.getText()));
                            result.setText(shape2D.toString());
                            break;
                        case "rectangle":
                            shape2D = new Rectangle(Double.parseDouble(legnthField.getText()), Double.parseDouble(widthField.getText()));
                            result.setText(shape2D.toString());
                            break;
                        case "circle":
                            shape2D = new Circle(Double.parseDouble(legnthField.getText()));
                            result.setText(shape2D.toString());
                            break;
                        case "oval":
                            shape2D = new Oval(Double.parseDouble(legnthField.getText()), Double.parseDouble(widthField.getText()));
                            result.setText(shape2D.toString());
                            break;
                    }
                } else if (threeDims.isSelected()) {
                    Shape3D shape3D;
                    switch (threeDimsShapes.getSelectedItem().toString()) {
                        case "cube":
                            shape3D = new Cube(Double.parseDouble(hightField.getText()));
                            result.setText(shape3D.toString());
                            break;
                        case "cylinder":
                            shape3D = new Cylinder(Double.parseDouble(legnthField.getText()), Double.parseDouble(hightField.getText()));
                            result.setText(shape3D.toString());
                            break;
                        case "sphere":
                            shape3D = new Sphere(Double.parseDouble(legnthField.getText()));
                            result.setText(shape3D.toString());
                            break;
                        case "cuboid":
                            shape3D = new Cuboid(Double.parseDouble(legnthField.getText()), Double.parseDouble(widthField.getText()), Double.parseDouble(hightField.getText()));
                            result.setText(shape3D.toString());
                            break;
                    }
                }
            }
        });
        hight.setVisible(false);
        hightField.setVisible(false);
    }

}
