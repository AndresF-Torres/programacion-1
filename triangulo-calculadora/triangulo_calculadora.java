
/**
 Con 2 catetos te da el area, hpotenusa, perimetro y angulos
 */
import java.util.Scanner;

public class triangulo_calculadora{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);//objeto que escanea el teclado
        
        System.out.println("escriba la longitud de un cateto");
        
        int cateto1 = sc.nextInt();
        
        System.out.println("escriba la longitud del otro cateto");
        
        int cateto2 = sc.nextInt();
        
        int area = cateto1*cateto2/2;
        
        System.out.println("El area es: " + area);
        
        double Hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
        //se usan los metodos de raiz y potencias 
        
        System.out.println("La hipotenusa mide: " + Hipotenusa);
        
        double Perimetro = cateto1+cateto2+Hipotenusa;
        
        System.out.println("El perimetro mide: " + Perimetro);
        
        double anguloRadianes1 = Math.asin(cateto1/Hipotenusa);
        
        double anguloGrados1 = Math.toDegrees(anguloRadianes1);
        
        double anguloRadianes2 = Math.asin(cateto2/Hipotenusa);
        
        double anguloGrados2 = Math.toDegrees(anguloRadianes2);
        
        System.out.println("El angulo adyacente al primer cateto dado mide: " + anguloRadianes2
        + " radianes o " + anguloGrados2 + " grados");
        
        System.out.println("El angulo adyacente al segundo cateto dado mide: " + anguloRadianes1
        + " radianes o " + anguloGrados1 + " grados");
    }
}