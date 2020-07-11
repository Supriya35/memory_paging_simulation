import java.lang.Math;
import java.util.Scanner;
public class Main{
     public static void main(String[] args) {
//hard disk
        RandomIntegers[] hdlist = new RandomIntegers[100];

        //Generates 100 Random Numbers in the range 1 -100
        for(int i = 0; i < hdlist.length; i++) {
          hdlist[i] = (int)(Math.random() * 100)+1;
          
            RandomIntegers hdlist = new RandomIntegers();
            numbers[i] = hdlist;
        }
        //user input
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int usrinpt[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            usrinpt[i] = s.nextInt();
        }
        //ram
         int ram[]= new int[50];
            for(int j:ram){
             System.out.print(j + " "); 
            }
        for(i=0;i<=usrinpt.length;i++){
           int x=usrinpt[i];
           int rand=(int)(Math.random() * 50) + 1; 
            if(ram[rand]==0){
            ram[rand]=hdlist[x];
            }
            else {
                i--
            }
            } 
        }
          

        }
}