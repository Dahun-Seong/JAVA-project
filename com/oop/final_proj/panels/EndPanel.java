package com.oop.final_proj.panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EndPanel extends JPanel {
    ImageIcon btn = new ImageIcon("img/end/okbutton.png");	// 확인 버튼
    JButton btnNewButton;
    JLabel lblNewLabel_1;
    JLabel lblNewLabel_2;
    JLabel lblNewLabel;

    public void setResultScore(int resultScore) {
        lblNewLabel_2.setText(resultScore+"");
    }

    public EndPanel(Object o) {
        //버튼
        btnNewButton = new JButton(btn);
        btnNewButton.setName("endAccept");
        btnNewButton.addMouseListener((MouseListener) o);
        btnNewButton.setBounds(300, 300, 229, 76);
        btnNewButton.setBorderPainted(false);
        btnNewButton.setFocusPainted(false);
        btnNewButton.setContentAreaFilled(false);
        add(btnNewButton);

        //점수 글자
        lblNewLabel_1 = new JLabel("SCORE");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 37));
        lblNewLabel_1.setBounds(571, 40, 205, 55);
        add(lblNewLabel_1);

        lblNewLabel_2 = new JLabel("0");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setFont(new Font("Harlow Solid Italic", Font.PLAIN, 49));
        lblNewLabel_2.setBounds(433, 91, 459, 87);
        add(lblNewLabel_2);
        
        //배경
        lblNewLabel = new JLabel("");
        lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel.setBackground(SystemColor.activeCaptionText);
        lblNewLabel.setIcon(new ImageIcon("img/end/sm_end_bg.png"));
        lblNewLabel.setBounds(0, 0, 784, 461);
        add(lblNewLabel);
    }
}
