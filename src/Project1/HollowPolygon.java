/*
author: Alex J. Reveles
date: 11-APR-2023
project1
description: Abstract class that defines all hollow polygons
 */

package Project1;
import java.awt.*;

abstract class HollowPolygon extends Polygon_ {

    // Constructor that calls super constructor

    public HollowPolygon(Color color, int vertexCount) {
        super(color, vertexCount);
    }
}
