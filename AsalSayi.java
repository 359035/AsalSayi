/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asalsayi;

/**
 *
 * @author Samsung
 */
public class AsalSayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count=0;
        for(int i=2;i<=100;i++){
            for(int j=1;j<=100;j++){
                if(i%j==0){
                    count++;
                }
                
                
                }
            int sayac=count;
            count=0;
            if(sayac<3){
                System.out.print(i+" ");
            }
        }
    }
    
}
