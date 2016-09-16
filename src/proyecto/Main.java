package proyecto;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        Figuras[] ll = new Figuras[4];
        ll[0]=new rectangulo(2,7);
        ll[1]=new cuadrado(10);
        ll[2]=new circulo(8);
        ll[3]=new triangulo(6,9);
        double suma=0;
        for (Figuras f:ll){
            suma=suma+f.area();

        }
        System.out.print(suma+"/////");
         //Ordenamos segun la condicion de ordenacion del metodo compareTo en la clase abstracta Figuras
        Arrays.sort(ll);
        
        //En este for printamos las areas de cada figura ordenadas de menor a mayor
        for(Figuras f:ll)
        {

            System.out.print(f.area()+"/////");

        }



    }

}
