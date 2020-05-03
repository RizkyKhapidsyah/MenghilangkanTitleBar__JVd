package com.rk.mtb;

import javax.swing.*;
import java.awt.*;

public class FormUtama extends MenghilanganTitleBar {
    JLabel Label_1;
    JPanel Panel_1;

    public FormUtama() {
        Inisialisasi_Komponen();
    }

    public void Inisialisasi_Komponen() {
        Panel_1 = new JPanel(new BorderLayout());
        Panel_1.setBorder(new javax.swing.border.LineBorder(Color.BLACK, 12, true));
        add(Panel_1);

        Label_1 = new JLabel("Klik, Tahan dan Geser Untuk memindahkan Frame/Form!");
        Label_1.setHorizontalAlignment(SwingConstants.CENTER);
        Label_1.setFont(new Font("Cambria", 1, 14));
        Panel_1.add(Label_1, BorderLayout.CENTER);

        setPreferredSize(new Dimension(400, 100));
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
