/*
author: Alex J. Reveles
date: 11-APR-2023
project1
description:
 */

package Project1;

import java.awt.*;

class IsoscelesTriangle extends HollowPolygon {
    public IsoscelesTriangle(Color color, Point upperLeft, int height, int width) {
        super(color,3);
        int[] x_points = {upperLeft.x, upperLeft.x + width, upperLeft.x};
        int[] y_points = {upperLeft.y, upperLeft.y, upperLeft.y + height};
        createPolygon(x_points, y_points);
    }
}
