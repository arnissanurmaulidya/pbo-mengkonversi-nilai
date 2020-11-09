/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilai_04;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class nilaiRapot {
  
  private String pengetahuan;
  private double keterampilan;
  int nilaiPengetahuan;
  int nilaiKeterampilan;
  String Ggrade;
  String grade;
  
  
 
public nilaiRapot(String nilaiPengetahuan, double nilaiKeterampilan){
    System.out.println();
    this.pengetahuan = nilaiPengetahuan;
    this.keterampilan = nilaiKeterampilan;
}

void getInfo(){
    System.out.println("----Info nilai rapot siswa----");
    System.out.println("Nilai Pengetahuan = " +this.pengetahuan);
    System.out.println("Nilai Keterampilan= " +this.keterampilan);
    
    
    
    
    if ( nilaiPengetahuan >=91 ){
        Ggrade = "A";
    }else if ( nilaiPengetahuan >=81 ){
        Ggrade = "B+";
     }else if ( nilaiPengetahuan >=71 ){
        Ggrade = "B";
     }else if ( nilaiPengetahuan >=60 ){
        Ggrade = "C";
     }else if ( nilaiPengetahuan <60 ){
        Ggrade = "D";
     }
    
    if ( nilaiKeterampilan >=91 ){
        grade = "A";
    }else if ( nilaiKeterampilan >=81 ){
        grade = "B+";
     }else if ( nilaiKeterampilan >=71 ){
        grade = "B";
     }else if ( nilaiKeterampilan >=60 ){
        grade = "C";
     }else if ( nilaiKeterampilan <60 ){
        grade = "D";
     }
    
    
    
  
    System.out.println("---Hasil Konversi---"); 
    System.out.println("Konversi Pengetahuan : " +this.Ggrade);
    System.out.println("Konversi Keterampilan : " +this.grade);

}

    
}
