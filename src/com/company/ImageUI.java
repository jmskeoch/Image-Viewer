package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

import static javax.swing.BoxLayout.Y_AXIS;

public class ImageUI implements ActionListener{
    private final JFrame frame;
    private final ImagePanel imgPanel;
    private JPanel functionPanel, buttonPanel;
    private JButton right, left, setDir, remove;
    private LTPanel directory;
    private ArrayList<File> images;
    private File dir;
    private int idx;

    public ImageUI() {
        //JFrame setup
        frame = new JFrame("Image UI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(900, 700));

        //Create UI panel at bottom of screen
        functionPanel = new JPanel();
        functionPanel.setLayout(new BoxLayout(functionPanel, Y_AXIS));
        frame.add(functionPanel, BorderLayout.SOUTH);

        //Create buttons and fields
        buttonPanel = new JPanel();
        right = new JButton("Next");
        left = new JButton("Back");
        setDir = new JButton("Open Folder");
        remove = new JButton("Remove");
        directory = new LTPanel("Image Folder: ");
        right.addActionListener(this);
        left.addActionListener(this);
        setDir.addActionListener(this);
        remove.addActionListener(this);

        //Add buttons to buttonPanel
        buttonPanel.add(left);
        buttonPanel.add(right);
        buttonPanel.add(setDir);
        buttonPanel.add(remove);

        //Add buttonPanel and other functions to the UI panel at bottom
        functionPanel.add(buttonPanel);
        functionPanel.add(directory);

        //ImgPanel setup
        imgPanel = new ImagePanel(directory.getText());
        frame.add(imgPanel);

        //Pack and show
        frame.pack();
        frame.setVisible(true);

        //Image directory index initialization
        idx = 0;
        dir = new File(directory.getText());
        images = new ArrayList<>();
    }

    public void actionPerformed(ActionEvent ae) {
        //OPEN FOLDER FUNCTION
        if (ae.getActionCommand().equals("Open Folder")) {
            dir = new File(directory.getText()); //Get the specified path from text box
            for (File item : Objects.requireNonNull(dir.listFiles())) {
                images.add(item); //List all files and place them in the array variable
                imgPanel.setFile(images.get(idx).getPath()); //Set the current file of Image Panel to the first image in array
                frame.update(frame.getGraphics()); //Update the frame
            }
        }
        //BACK FUNCTION
        if (ae.getActionCommand().equals("Back") && idx != 0) {
            idx--; //Go back once in the idx
            imgPanel.setFile(images.get(idx).getPath()); //Set current image
            frame.update(frame.getGraphics()); //Update
            System.out.println("Back");
        }
        //NEXT FUNCTION
        if (ae.getActionCommand().equals("Next") && idx != images.size() - 1) {
            idx++; //Go forward once in the idx
            imgPanel.setFile(images.get(idx).getPath()); //Set current image
            frame.update(frame.getGraphics()); //Update
            System.out.println("Next");
        }
        //REMOVE
        if (ae.getActionCommand().equals("Remove")) {
            images.remove(idx);
            imgPanel.setFile(images.get(idx).getPath());
            frame.update(frame.getGraphics());
            System.out.println("Removed");
        }
    }
}
