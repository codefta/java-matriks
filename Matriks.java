/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fathi, Dimas
 * 17523233 - 17523193
 * stackoverflow.com/questions/5062310/matrix-manipulation-oop-in-java 
 * that is our reference.. pahami tiru dan modifikasi
 * MEMBUAT MATRIKS 2X2 DAN OPERASINYA DENGAN MENGGUNAKAN CARA PEMROGRAMAN PROSEDURAL
 */
public class Matriks {
    int[][] matriks1 = {{1,2},{3,4}}; //Membuat matriks elemen 2,2
    int[][] matriks2 = {{5,6},{7,8}}; //Membuat matriks elemen 2,2 
    int[][] hasil = new int[2][2];
    //Prosedur matriks 1 (untuk menampilkan matriks 1)
    public void Matriks1() {
        for (int i=0; i <matriks1.length;i++){
            for(int j=0; j<matriks1[0].length;j++){
                System.out.print(matriks1[i][j]+" ");
            }
            System.out.println();
        }
    }
    //Prosedur matriks 2 (untuk menampilkan matriks 2)
    public void Matriks2(){
        for (int i=0; i<matriks2.length; i++){
            for(int j=0; j<matriks2[0].length;j++){
                System.out.print(matriks2[i][j]+" ");
            }
            System.out.println();
        }
    }
    //Prosedur penambahan pada matriks 1 dan 2
    public void tambahMatriks(){
        for(int i=0; i<matriks1.length; i++){
            for(int j=0; j<matriks1[0].length; j++){
                System.out.print(matriks1[i][j]+matriks2[i][j]+" ");
            }
            System.out.println();
        }
    }
    //Prosedur pengurangan matriks 1 dan 2
    public void kurangMatriks(){
        for(int i=0; i<matriks1.length;i++){
            for(int j=0; j<matriks1[0].length;j++){
                System.out.print(matriks1[i][j]-matriks2[i][j]+" ");
            }
            System.out.println();
        }
    }
    //Prosedur operasi perkalian matriks
    public void kaliMatriks(){
        for (int i=0; i< matriks1.length; i++){
            for (int j=0; j< matriks1[0].length; j++){
                for (int k=0; k< hasil.length;k++){
                    hasil[i][j]+= matriks1[i][k] * matriks2[k][j];
                }
                System.out.print(hasil[i][j]+" ");
            }
            System.out.println();
        }
    }
    //Prosedur untuk operasi perkalian skalar matriks1
    public void skalarMatriks(){
        for(int i=0; i<matriks1.length; i++){
            for(int j=0; j<matriks1[0].length;j++){
                System.out.print(2 * matriks1[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    //Prosedur untuk operasi perkalian matriks skalar pada matriks 2
    public void skalarMatriks2(){
        for(int i=0; i<matriks1.length; i++){
            for(int j=0; j<matriks1[0].length; j++){
                System.out.print(2 * matriks2[i][j]+" ");
            }
            System.out.println();
        }
    }
    //Prosedur transpose matriks 1
    public void transposeMatriks(){
        for(int i=0; i<matriks1.length;i++){
            for(int j=0; j<matriks1.length;j++){
                System.out.print(matriks1[j][i]+" ");
            }
            System.out.println();
        }
    }
    //Prosedur transpose matriks 2
    public void transposeMatriks2(){
        for(int i=0; i<matriks1.length;i++){
            for(int j=0; j<matriks1.length;j++){
                System.out.print(matriks2[j][i] + " ");
            }
            System.out.println();
        }
    }
    //Prosedur untuk menampilkan matriks
    public void tampilMatriks(){
        //intansiasai objek pada kelas Matriks untuk memanggil prosedur/fungsi
        Matriks matriks = new Matriks();
        //Memberikan judul program
        System.out.println("Matriks 2X2 dan Operasi-Operasinya");
        System.out.println("==================================");
        System.out.println();
        //Menampilkan Matriks 1
        System.out.println("Matriks 1");
        matriks.Matriks1();
        //Menampilkan Matriks 2
        System.out.println("Matriks 2");
        matriks.Matriks2();
        //Menampilkan Hasil Penambahan Matriks 1 dan Matriks 2
        System.out.println("Hasil Penambahan Matriks");
        matriks.tambahMatriks();
        //Menampilkan Hasil Pengurangan Matriks 1 dan Matriks 2
        System.out.println("Hasil Pengurangan Matriks");
        matriks.kurangMatriks();
        //Menampilkan Hasil Perkalian Matriks 1 dan Matriks 2
        System.out.println("Hasil Perkalian Matriks");
        matriks.kaliMatriks();
        //Menampilkan Perkalian Skalar Matriks 1 dengan dikali 2
        System.out.println("Hasil Perkalian Skalar Matriks 1");
        matriks.skalarMatriks();
        //Menampilkan Perkalian Skalar Matriks 2 dengan dikali 2
        System.out.println("Hasil Perkalian Skalar Matriks 2");
        matriks.skalarMatriks2();
        //Menampilkan Hasil Transpose Matriks 1
        System.out.println("Hasil transpose matriks 1");
        matriks.transposeMatriks();
        //Menampilkan Hasil Transpose Matriks 2
        System.out.println("hasil transpose matriks 2");
        matriks.transposeMatriks2();
    }
    
    public static void main(String[] args){
        Matriks view = new Matriks();
        
        view.tampilMatriks();
    }
}

