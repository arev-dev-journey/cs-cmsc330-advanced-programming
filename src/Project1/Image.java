/*
author: Alex J. Reveles
date: 11-APR-2023
project1
description: Abstract base class that defines all image objects
 */

package Project1;
import java.awt.*;

abstract class Image {

    private Color color;

    // Constructor that can only be called by the subclasses to initialize the color

    public Image(Color color) {
        this.color = color;
    }

    // Sets the color of the image to be drawn. Must be called first by the draw function of the subclasses

    public void colorDrawing(Graphics graphics) {
        graphics.setColor(color);
    }

    abstract void draw(Graphics graphics);
}


