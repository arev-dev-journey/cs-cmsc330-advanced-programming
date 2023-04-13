/*
author: Alex J. Reveles
date: 11-APR-2023
project1
description: Class that defines a solid isosceles triangle object
 */

package Project1;

import java.awt.*;

class IsoscelesTriangle extends SolidPolygon {
    public IsoscelesTriangle(Color color, Point upperLeft, int height, int width) {
        super(color, 3);
        int[] x_points = {upperLeft.x, upperLeft.x + (width / 2), upperLeft.x - (width / 2)};
        int[] y_points = {upperLeft.y, upperLeft.y + height, upperLeft.y + height};
        createPolygon(x_points, y_points);
    }
}
