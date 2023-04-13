/*
author: Alex J. Reveles
date: 11-APR-2023
project1
description: abstract class that defines all solid polygons
 */
package Project1;

import java.awt.*;

abstract class SolidPolygon extends Polygon_ {

    public SolidPolygon(Color color, int vertexCount) {
        super(color, vertexCount);
    }

    @Override
    public void draw(Graphics graphics) {
        colorDrawing(graphics);
        graphics.fillPolygon(polygon);
    }
}
