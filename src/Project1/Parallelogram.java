package Project1;

import java.awt.*;

class Parallelogram extends HollowPolygon {
    public Parallelogram(Color color, Point upperLeft, Point lowerRight, int offset) {
        super(color, 4);
        int[] x_points = {upperLeft.x, upperLeft.x + offset, lowerRight.x, lowerRight.x + offset};
        int[] y_points = {upperLeft.y, upperLeft.y + offset, lowerRight.y, lowerRight.y + offset};
        createPolygon(x_points, y_points);
    }


}
