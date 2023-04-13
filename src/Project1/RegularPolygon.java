/*
author: Alex J. Reveles
date: 11-APR-2023
project1
description: Class that defines a solid regular polygon object
 */

package Project1;

import java.awt.*;

class RegularPolygon extends SolidPolygon {
    public RegularPolygon(Color color, Point center, int sides, int radius) {
        super(color, sides);
        int[] x_points = new int[sides];
        int[] y_points = new int[sides];
        for(int i = 0; i < sides; i++) {
            x_points[i] = (int) (center.x + radius * Math.cos(i * (2 * Math.PI) / sides));
            y_points[i] = (int) (center.y + radius * Math.sin(i * (2 * Math.PI) / sides));
        }
        createPolygon(x_points, y_points);
    }
}
