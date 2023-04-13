/*
author: Alex J. Reveles
date: 11-APR-2023
project1
description: Class that defines a hollow rectangle object
 */

package Project1;

import java.awt.*;

class Rectangle extends HollowPolygon {

    // Constructor that initializes the vertices of the rectangle

    public Rectangle(Color color, Point upperLeft, int height, int width) {
        super(color, 4);
        int[] x_points = {upperLeft.x, upperLeft.x + width, upperLeft.x + width, upperLeft.x};
        int[] y_points = {upperLeft.y, upperLeft.y, upperLeft.y + height, upperLeft.y + height};
        createPolygon(x_points, y_points);
    }
}
