import java.util.Scanner;

public class TersUcgen{
    public static void main(String[] args) {
        //Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
        Scanner sc = new Scanner(System.in);
        System.out.println("Kaç basamaklı bir ters üçgen istiyorsunuz: ");
        int n = sc.nextInt();
        for(int i = n; i>0; i--){
            for(int j=0; j<n-1; j++){
                System.out.print(" ");
            }
            for(int k = 0; k<2*i -1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}