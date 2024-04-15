package entities;
public class Rectangle {
    public double width;
    public double heigth;


    public double area(){
        double a = heigth * width;
        return a;
    }

    public double perimetro(){
            double p = 2 * (heigth + width);
            return p;

    }

    public double diagonal (){
        double result = (heigth * heigth) + (width * width);
        double d = Math.sqrt(result);
        return d;

    }


}

