public class Main {

    public static void main(String[] args)  {
        suma ( 33 , 42 , 50 );

    Coche miCoche = new Coche();

    miCoche. sumarpuertas();
    miCoche. sumarpuertas();
    miCoche. sumarpuertas();
    System.out.println ( "El numero de puertas es:" +miCoche.numeroDepuertas );
    }

    public static void suma (int a, int b, int c){
        int resultado;
        resultado = a + b + c ;
        System.out.println ( resultado );
    }
}



class Coche {
    public int numeroDepuertas = 8;


    public void sumarpuertas() {
        this.numeroDepuertas ++;
    }


}