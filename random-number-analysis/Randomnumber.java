/**
 They program generats a random number between 10 and 99
 It analyzes whether a random number is a multiple of 10, whether both digits are the same
 whether the sum of both digits are the same and whether the letter of the first digits begins with
 
 */

public class Randomnumber
{
    public static void main ( String[] args) {
          
        int min = 10;
        int max = 99;
        for (int i =1; i<=10; i++){
            
            int RandomNumber = (int)(Math.random()*(max-min+1)+min);
            
            int residuo = RandomNumber%10;
            int conciente = RandomNumber/10;
            int residuoSuma = (residuo+conciente)%2;
            System.out.println("El número: " + RandomNumber);
            if(residuo==0){
                System.out.print("El numero es un multiplo de 10. ");
            }
            else{
                System.out.print("El numero no es un multiplo de 10. ");
            }
            if(conciente==residuo){
                System.out.print("Ambos digitos son iguales. ");
            }
            else{
                System.out.print("Los digitos son distintos. ");
            }
            if(residuoSuma==0){
                System.out.println("La suma de los digitos es par. ");
            }
            else{
                System.out.println("La suma de los digitos es impar. ");
            }
            if(conciente==1){
                System.out.println("El primer digito empienza con U");
            }
            if(conciente==2){
                System.out.println("El primer digito empienza con D");
            }
            if(conciente==3){
                System.out.println("El primer digito empienza con T");
            }
            if(conciente==4 || conciente==5){
                System.out.println("El primer digito empienza con C");
            }
            if(conciente==6 || conciente==7){
                System.out.println("El primer digito empienza con S");
            }
            if(conciente==8){
                System.out.println("El primer digito empienza con O");
            }
            if(conciente==9){
                System.out.println("El primer digito empienza con N");
            }
        }
    }
}