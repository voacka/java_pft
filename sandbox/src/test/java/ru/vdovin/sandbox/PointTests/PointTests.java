package ru.vdovin.sandbox.PointTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.vdovin.sandbox.Point.Distance;
import ru.vdovin.sandbox.Point.Point;

public class PointTests {


    @Test
    public void testDistance() {
        Point p1 = new Point(10, 10);
        Point p2 = new Point(14, 13);

        Assert.assertEquals(Distance.Distance(p1, p2), 5);
    }

    @Test
    public void testSayDistanceto(){
        Point p1 = new Point(10, 10);
        Point p2 = new Point(14, 13);
        Assert.assertEquals(p1.sayDistanceto(p2), 5);
        Assert.assertEquals(p2.sayDistanceto(p1), 5);
        Assert.assertEquals(p2.sayDistanceto(p1), Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2)));

    }

}
