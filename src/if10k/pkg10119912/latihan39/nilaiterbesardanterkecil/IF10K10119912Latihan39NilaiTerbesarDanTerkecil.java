/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119912.latihan39.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Rezki Ramadhan
 * KELAS : IF10K
 * NIM  `: 10119912
 * 
 */

class Nilai{
    public String nama_petugas;
    public int maksimum, minimum, jumlah_mhs, i, array[];
    
    public void TerbesarTerkecil(String nama, int jlh, int arr[]){
     Scanner scan = new Scanner(System.in);
     for(i = 0; i < jlh; i++) {
          System.out.print("Masukan Nilai Mahasiswa Ke-"+ (i+1) +" = " );
          arr[i] = scan.nextInt();
        }
        maksimum = arr[0];        
        minimum = arr[0];

        for(i = 0; i < jlh; i++) {
          if (arr[i] > maksimum){
            maksimum = arr[i];
          }
          else if(arr[i] < minimum){
              minimum = arr[i];  
            }  
        }
        
        System.out.println();
        System.out.println("---------- Hasil Nilai Mahasiswa -----------");

        for(i = 0; i < jlh; i++) {
          System.out.println("Nilai Mahasiswa Ke-" + (i+1) + " " + arr[i] );
          
        }        
        System.out.println();
        System.out.println("Nilai Terbesar adalah " + maksimum);
        System.out.println("Nilai Terkecil adalah " + minimum);        
        
        System.out.println();        
        System.out.println("Petugas : " + nama);

    }
}

public class IF10K10119912Latihan39NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Nilai val = new Nilai();
        
        System.out.print("Masukkan Nama Petugas: ");
        val.nama_petugas = scan.next();
        System.out.print("Masukkan Banyak Nilai Mahasiswa: ");
        val.jumlah_mhs = scan.nextInt();
        val.array = new int[val.jumlah_mhs];
        
        val.TerbesarTerkecil(val.nama_petugas, val.jumlah_mhs, val.array);

       
    }
    
}
