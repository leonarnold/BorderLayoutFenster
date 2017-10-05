package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class BorderLayout extends JFrame {

        JPanel jPNorth;
        JPanel jPSouth;
        JPanel jPWest;
        JPanel jPEast;
        JPanel jPCenter;

    public BorderLayout() throws HeadlessException {
        this.setTitle("BorderLayout");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);
        this.initComponents();
        this.initEvent();
        this.setVisible(true);
    }


    public void initComponents() {

        jPNorth = new JPanel();
        jPSouth = new JPanel();
        jPWest = new JPanel();
        jPEast = new JPanel();
        jPCenter = new JPanel();

        JLabel jLNorth = new JLabel("North");
        JLabel jLSouth = new JLabel("South");
        JLabel jLEast = new JLabel("East");
        JLabel jLWest = new JLabel("West");
        JLabel jLCenter = new JLabel("Center");

        JPanel jFlow = new JPanel();
        jFlow.setLayout(new FlowLayout(FlowLayout.LEFT));
        for(int i = 0; i < 5; i++){
            jFlow.add(new JLabel("Text " + (i + 1)));
        }

        jPNorth.add(jLNorth);
        jPSouth.add(jLSouth);
        jPEast.add(jLEast);
        jPWest.add(jLWest);
        jPCenter.add(jLCenter);

        jPNorth.setBorder(BorderFactory.createDashedBorder(Color.BLACK));
        jPSouth.setBorder(BorderFactory.createDashedBorder(Color.BLACK));
        jPEast.setBorder(BorderFactory.createDashedBorder(Color.BLACK));
        jPWest.setBorder(BorderFactory.createDashedBorder(Color.BLACK));
        jPCenter.setBorder(BorderFactory.createDashedBorder(Color.BLACK));

        this.add(jPNorth, java.awt.BorderLayout.NORTH);
        this.add(jPSouth, java.awt.BorderLayout.SOUTH);
        this.add(jPEast, java.awt.BorderLayout.EAST);
        this.add(jPWest, java.awt.BorderLayout.WEST);
        this.add(jFlow, java.awt.BorderLayout.CENTER);


    }

    private void initEvent(){

        Random r = new Random();

        jPNorth.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jPNorth.setBackground(new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
            }
        });

        jPEast.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jPEast.setBackground(new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
            }
        });

        jPWest.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jPWest.setBackground(new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
            }
        });

        jPSouth.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jPSouth.setBackground(new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
            }
        });
        //
    }
}




