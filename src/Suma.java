import java.util.Scanner;
public class Suma {
    
    public static void main (String[] args) {
        Scanner cin = new Scanner(System.in);
        int x[];
        x = new int [5];
        for(int i=0;i<5;i++){
            System.out.println("Ingrese el "+(i+1)+" numero:");
            x[i] = cin.nextInt();
        }
        System.out.println("\nLa sumatoria de los numeros es: "+suma(x));
    }
    
    static int suma(int[] x){
        int suma=0;
        for(int j:x){
            suma=suma+j;
        }
        return suma;
    }
}