/*
author: Alex J. Reveles
date: 11-APR-2023
project1
description: Class that defines the panel for drawing the images
 */

package Project1;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class DrawingPanel extends JPanel {

    private ArrayList<Image> images = new ArrayList<>();

    // Adds a graphic object to the drawing panel

    public void addImage(Image image) {

        images.add(image);
      }

    // Draws all the images on the drawing panel

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        for (Image image : images)
            image.draw(graphics);
    }
}
