package com.company;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel{

    private BufferedImage image;
    private String imagePath;

    public ImagePanel(String path) {
        imagePath = path;
        try {
            image = ImageIO.read(new File(imagePath));
        } catch (IOException ex) {
            System.out.println("IOException");
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 25, 25, 825, 625, this); // see javadoc for more info on the parameters
    }

    public void setFile(String path) {
        imagePath = path;
        try {
            image = ImageIO.read(new File(imagePath));
        } catch (IOException ex) {
            System.out.println("IOException");
        }
    }

}