package com.youneek.demo1;

/**
 * Created by Administrator on 2016/4/15.
 */

class Point20160415 {
        double x,y,z;
        Point20160415 (double _x ,double _y,double _z){
        x = _x;
        y = _y;
        z = _z;
        }
        void setX(double _x) {
        x = _x;
        }
        void setY(double _y) {
        y = _y;
        }
        void setZ(double _z) {
        z = _z;
        }

        double get_Distance(Point20160415 p) {
          return (x-p.x)*(x-p.x)+(y-p.y)*(y-p.y)+(z-p.z)*(z-p.z);
        }
        }

public class TestPoint {
    public static void main(String[] args) {
        Point20160415 pp   = new Point20160415( 4.0 , 3.0 , 3.0);
        Point20160415 pp_1 = new Point20160415( 0 , 0 , 0);
        pp.setZ(5.0);
        //System.out.println(pp.x);
        //System.out.println(pp.y);
        //System.out.println(pp.z);
        System.out.println(pp.get_Distance(pp_1));
        System.out.println(pp.get_Distance(new Point20160415(0, 0, 0)));
    }
}
