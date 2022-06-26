/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticaofor;

/**
 *
 * @author alsgo
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  for (int cc = 0; cc<=100; cc+=10){
            System.out.println(cc); //teste simplificado  com
        }
    }
    */
      
      for(int cc = 0; cc<=4; cc++){
          for( int ca = 1; ca <=3; ca++){
          System.out.println(cc);
          System.out.println(ca);//for aninhado gerando duas condicionais trabalhando de forma alternada. 
      }
    }
  }
}