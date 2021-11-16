package uppgift3;
import java.util.*;
import java.io.*;
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
        int mean = 0;
        int highest = 0;
        for (int i=0;i<talLista.length;i++) {
        	sum +=talLista[i];
        	mean +=talLista[i];	
        	if (talLista[i]>highest)
        		highest=talLista[i];}
        int medel=mean/talLista.length;
        /*
        for (int e : talLista) {
            sum += e;
        }
        int mean = 0;
        for (int e : talLista) {
            mean += e;
        }
        int medel=mean/talLista.length;
        int highest=0;
        for (i=0;i<talLista.length;i++) {
        	if (talLista[i]>highest)
        		highest=talLista[i];}
        */	
        System.out.println("Summan är "+sum);
        System.out.println("Medeltalet är "+medel);
        System.out.println("Högsta siffran är "+highest);
        }
    }
	
