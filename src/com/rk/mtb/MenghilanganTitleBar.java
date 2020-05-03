package com.rk.mtb;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MenghilanganTitleBar extends JFrame {

    boolean MouseDipijit;
    int relatifX, relatifY;

    public MenghilanganTitleBar() {
        setUndecorated(true);
        AktifkanDragForm();
    }

    public void AktifkanDragForm() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                MouseDipijit = true;
                relatifX = e.getX();
                relatifY = e.getY();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                MouseDipijit = false;
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (MouseDipijit == true) {
                    int posX = MenghilanganTitleBar.this.getLocationOnScreen().x + e.getX();
                    int posY = MenghilanganTitleBar.this.getLocationOnScreen().y + e.getY();
                    int X = posX - relatifX;
                    int Y = posY - relatifY;
                    MenghilanganTitleBar.this.setLocation(X, Y);
                }
            }
        });

    }
}
