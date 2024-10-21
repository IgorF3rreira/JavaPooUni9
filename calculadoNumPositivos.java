import java.util.Scanner;

public class Main{
  public static void main(String args[]){

    float x,y, res;
    Scanner teclado = new Scanner(System.in);


    System.out.print("Calculadora de valores positivos");

    System.out.print("\n\nDigite o valor de x: ");
    x = teclado.nextFloat();

    System.out.print("\nDigite o valor de y: ");
    y = teclado.nextFloat();

    try{
      if(y > x){//se o valor a ser substituido for menor, sobre a exceção
          throw new IllegalArgumentException("\n Y não pode ser subtraido de X, pois é maior");
   
      }else{
        res = x - y;
        System.out.println("Resultado: " + res);
      }
    }catch(IllegalArgumentException e){
      System.out.println(e.getMessage());
    }
  }  
}
