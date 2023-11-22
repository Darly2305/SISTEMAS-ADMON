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
    float matriz_original[][] = new float[MAX][MAX];
    
    public MatrizOriginal(String nombre_objeto, int filas_localidades, int columnas_objeto, float matrizOriginal1[][]){
        this.nombre_objeto = nombre_objeto;
        this.filas_original = filas_localidades;
        this.columnas_original = columnas_objeto;
        this.matriz_original = matriz_original;
        for(int i=0;i<filas_localidades;i++){
            for(int j=0;j<columnas_objeto;j++){
                this.matriz_original[i][j] = matrizOriginal1[i][j];
            }
        }
    }
}
