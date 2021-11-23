package uppgift3;
import java.util.*;
public class Uppgift3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        int[]talLista = new int[5];
        for (int i=0;i<5;i++) {
        	System.out.println("Skriv heltal nummer: "+(i+1));
        	talLista[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(talLista));
        int sum = 0;
        int highest = 0;
        for (int i=0;i<talLista.length;i++) {
        	sum +=talLista[i];
        	if (talLista[i]>highest)
        		highest=talLista[i];}
        int medel=sum/talLista.length;
	
        System.out.println("Summan är "+sum);
        System.out.println("Medeltalet är "+medel);
        System.out.println("Högsta siffran är "+highest);
        }
    }

