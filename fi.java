package org.example;

import java.awt.*;
import java.awt.event.*;

// An AWT GUI program inherits the top-level container java.awt.Frame
public class fi extends Frame {
    private Button btna, btnb, btnc, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25, btn26, btn27;

    // Constructor to setup GUI components and event handlers
    public fi () {
        setLayout(new GridLayout(10, 3, 4, 4));
        // "super" Frame sets layout to 3x2 GridLayout, horizontal and vertical gaps of 3 pixels

        // The components are added from left-to-right, top-to-bottom

        int a = 5;
        btnb = new Button("Event:" + a);
        add(btnb);
        btnc = new Button("Heat:");
        add(btnc);
        btna = new Button("");
        add(btna);

        btn1 = new Button("Lane");
        add(btn1);
        btn2 = new Button("Place");
        add(btn2);
        btn3 = new Button("Time");
        add(btn3);

        btn4 = new Button("1");
        add(btn4);
        btn5 = new Button("b");
        add(btn5);
        btn6 = new Button("c");
        add(btn6);
        btn7 = new Button("2");
        add(btn7);
        btn8 = new Button("b");
        add(btn8);
        btn9 = new Button("c");
        add(btn9);
        btn10 = new Button("3");
        add(btn10);
        btn11 = new Button("b");
        add(btn11);
        btn12 = new Button("c");
        add(btn12);
        btn13 = new Button("4");
        add(btn13);
        btn14 = new Button("b");
        add(btn14);
        btn15 = new Button("c");
        add(btn15);
        btn16 = new Button("5");
        add(btn16);
        btn17 = new Button("b");
        add(btn17);
        btn18 = new Button("c");
        add(btn18);
        btn19 = new Button("6");
        add(btn19);
        btn20 = new Button("b");
        add(btn20);
        btn21 = new Button("c");
        add(btn21);
        btn22 = new Button("7");
        add(btn22);
        btn23 = new Button("b");
        add(btn23);
        btn24 = new Button("c");
        add(btn24);
        btn25 = new Button("8");
        add(btn25);
        btn26 = new Button("b");
        add(btn26);
        btn27 = new Button("c");
        add(btn27);


        setTitle("GridLayout Demo"); // "super" Frame sets title
        setSize(280, 150);           // "super" Frame sets initial size
        setVisible(true);            // "super" Frame shows
    }

    // The entry main() method
    public static void main(String[] args) {

        new fi();  // Let the constructor do the job
    }
}

