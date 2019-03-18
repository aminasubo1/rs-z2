package ba.unsa.etf.rs;

import java.util.Scanner;

public class Main {
    public static int sumaCifara(int n){
        int s=0;
        while(n!=0) {
            s=s+n%10;
            n=n/10;
        }
        return s;
    }


    public static void main(String[] args) {
        int n;
        Scanner ulaz=new Scanner(System.in);
        System.out.println("Unesite do kojeg broja zelite ispis");
        n=next.UlazInt();
        for(int i=0;i<n;i++){
            if(i%sumaCifara==0)
                System.out.println(i);

        }
	// write your code here
    }
}
