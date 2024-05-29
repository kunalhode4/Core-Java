package basicjava;

import java.util.*;



class Shape{

    public int volume(int a) {

        return a*a*a; // Volume of cube

    }



    public int volume(int l, int b, int h) {

        return l * b * h; // Volume of cuboid

    }



    public double volume(int r, double pi) {

        return (4.0/3.0) * pi * r * r * r; // Volume of sphere

    }

}



public class Overloading {

    public static void main(String[] args) {

        Shape s = new Shape();

        Scanner ref = new Scanner(System.in);



        System.out.println("Enter side of cube: ");

        int cube = ref.nextInt();

        System.out.println("Volume of cube: " + s.volume(cube));



        System.out.println("Enter length, breadth & height of cuboid: ");

        int l = ref.nextInt();

        int b = ref.nextInt();

        int h = ref.nextInt();

        System.out.println("Volume of cuboid: " + s.volume(l, b, h));



        System.out.println("Enter radius of sphere: ");

        int radius = ref.nextInt();

        System.out.println("Enter value of pi: ");

        double pi = ref.nextDouble();

        System.out.println("Volume of sphere: " + s.volume(radius, pi));



        ref.close();

    }

}