/*
author: Alex J. Reveles
date: 11-APR-2023
project1
description: Class that defines a text object
 */

package Project1;

import java.awt.*;

class Text extends Image {
    private Point location;
    private String msg;

    public Text(Color color, Point location, String msg) {
        super(color);
        this.location = location;
        this.msg = msg;
    }

    @Override
    public void draw(Graphics graphics) {
        colorDrawing(graphics);
        graphics.drawString(msg, location.x, location.y);
    }
}