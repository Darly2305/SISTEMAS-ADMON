/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas.admon;

/**
 *
 * @author jose_
 */
public class MatrizOriginal {
    String nombre_objeto;
    int filas_original;
    int columnas_original;
    final int MAX = 10;
    int matriz_original[][] = new int[MAX][MAX];
    
    public MatrizOriginal(String nombre_objeto, int filas_localidades, int columnas_objeto, int matrizOriginal[][]){
        this.nombre_objeto = nombre_objeto;
        this.filas_original = filas_localidades;
        this.columnas_original = columnas_objeto;
        this.matriz_original = matriz_original;
    }
}
