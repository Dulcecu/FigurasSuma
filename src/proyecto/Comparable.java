package proyecto;

/**
 * Created by Turpitude on 14/09/2016.
 */

 interface Figuras
        {

            public double area();
        }





class rectangulo implements  Figuras {
    public double l1, l2;

    public rectangulo(double l1, double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public double area() {

        return this.l1 * this.l2;
    }
}


class cuadrado extends rectangulo {
    public cuadrado(double l){
        super (l,l);
    }
}
class triangulo implements Figuras {
    public double b, h;

    public triangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public double area() {

        return (this.b * this.h / 2);
    }
}


    class circulo implements Figuras {
        public double radio;

        public circulo(double radio) {
            this.radio = radio;
        }


        public double area() {

            return Math.PI * this.radio * this.radio;
        }
    }




