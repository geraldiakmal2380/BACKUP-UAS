/*
 Nama : Geraldi Akmal Syandana
 NIM : 244107020165 
 No absen : 10
 */
import java.util.Scanner;
public class UAS1B10{

    public static void printdatatim(int[][] brpjumlahtim10,String[][] apasjnamatimnya10){
            System.out.println("Nama tim        Level1        Level2        Total Skor");
            System.out.println(apasjnamatimnya10[0][0]+"          "+brpjumlahtim10[0][0]+"         "+brpjumlahtim10[0][1]+"         "+(brpjumlahtim10[0][0]+brpjumlahtim10[0][1]));
            System.out.println(apasjnamatimnya10[1][0]+"          "+brpjumlahtim10[1][0]+"         "+brpjumlahtim10[1][1]+"         "+(brpjumlahtim10[1][0]+brpjumlahtim10[1][1]));
            System.out.println(apasjnamatimnya10[2][0]+"          "+brpjumlahtim10[2][0]+"         "+brpjumlahtim10[2][1]+"         "+(brpjumlahtim10[2][0]+brpjumlahtim10[2][1]));
            System.out.println(apasjnamatimnya10[3][0]+"          "+brpjumlahtim10[3][0]+"         "+brpjumlahtim10[3][1]+"         "+(brpjumlahtim10[3][0]+brpjumlahtim10[3][1]));
            System.out.println("Maaf sedikit belepotan");
               
            
            

        }//kurung tutup fungsi printdatati,


    public static void memasukandatatim(int[][] berapajumlahtimnya10,String[][] apasajanamatimnya10){//fungsi pilihan menu 1 utk memasukan data tim
        Scanner mlebu10 = new Scanner(System.in);
        for(int i=0;i<berapajumlahtimnya10.length;i++){
            System.out.print("Masukan nama tim ke-"+(i+1)+" :");
            apasajanamatimnya10[i][0] = mlebu10.next();
            mlebu10.nextLine();
            System.out.print("Masukan skor "+apasajanamatimnya10[i][0]+" untuk level 1 : ");
            berapajumlahtimnya10[i][0] = mlebu10.nextInt();
            System.out.print("Masukan skor "+apasajanamatimnya10[0][1]+" untuk level 2 : ");
            berapajumlahtimnya10[i][1] = mlebu10.nextInt();
            System.out.println("");
            System.out.println("");
            

        }

    }//kurung tutup method
    public static void main(String args[]){
        int jumlahtim10[][]  = new int[4][2];//yang kiri 0-1 utk level 1 dan 2,sedangkan yang kanan(10) untuk kapasitas looping
        String namatim10[][] = new String[4][2];//saya kasih 4 karena cuman ada 4 tim
        Scanner mlebu10 = new Scanner(System.in);
        int pilihamenu10 = 0;

    do{
        
        System.out.println("===Menu utama===");
        System.out.println("1.Input data skor tim");
        System.out.println("2.Tampilkan skor");
        System.out.println("3.Tentukan Juara");
        System.out.println("4.Keluar");
        System.out.print("masukan pilihan (1-4) : ");
        pilihamenu10  = mlebu10.nextInt();
        if (pilihamenu10 == 1||pilihamenu10 == 2|| pilihamenu10 == 3||pilihamenu10 == 4){
            if(pilihamenu10==1){
            memasukandatatim(jumlahtim10,namatim10);
               
            }
            if(pilihamenu10==2){
                printdatatim(jumlahtim10,namatim10);
            }
            if(pilihamenu10==3){
                System.out.println("maaf sedang dibangun");
                //under construction
            }
            if(pilihamenu10==4){
                System.out.println("Terimakasih!");
                System.exit(0);
            }
        }
        else{
            System.out.println("silahkan coba lagi");
        }

    }while(true);//kurung e do
    }
}