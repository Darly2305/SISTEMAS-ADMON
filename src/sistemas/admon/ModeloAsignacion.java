/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas.admon;

import java.util.Scanner;

/**
 *
 * @author jose_
 */
public class ModeloAsignacion {
    public float[][] obtenerMatrizFicticia(MatrizOriginal matriz_original){
        Scanner sc = new Scanner(System.in);
        ModeloAsignacion obtenerMatrizResultante = new ModeloAsignacion();
        
        int filas_ficticias, columnas_ficticias, diferencia = 0;
        final int MAX = 10;
        float matriz_ficticia[][] = new float[MAX][MAX];   
        
        //matriz_original = obtenerMatrizResultante.llenarMatriz(matriz_original);
        
        
        if(matriz_original.filas_original > matriz_original.columnas_original){
            diferencia = matriz_original.filas_original - matriz_original.columnas_original;
            filas_ficticias =  matriz_original.filas_original;
            columnas_ficticias = matriz_original.columnas_original + diferencia;
        }else{
            diferencia = matriz_original.columnas_original - matriz_original.filas_original;
            columnas_ficticias =  matriz_original.columnas_original;
            filas_ficticias = matriz_original.filas_original + diferencia;
        }
        
        for(int i=0;i<filas_ficticias;i++){
            for(int j=0;j<columnas_ficticias;j++){
                matriz_ficticia[i][j] = 0;
            }
        }
        
        for(int i=0;i<matriz_original.filas_original;i++){
            for(int j=0;j<matriz_original.columnas_original;j++){
                matriz_ficticia[i][j] = matriz_original.matriz_original[i][j];
            }
        }
        
        System.out.println("");       
        for(int i=0;i<filas_ficticias;i++){
            for(int j=0;j<columnas_ficticias;j++){
                if(i < 3){
                    System.out.print(matriz_ficticia[i][j] + " ");
                }else{
                    System.out.print(matriz_ficticia[i][j] + " ");
                }
            }
            System.out.println("");
        }
        
        matriz_ficticia = obtenerMatrizResultante.restarMenorFilas(matriz_ficticia, filas_ficticias, columnas_ficticias);
        
        System.out.println("");        
        for(int i=0;i<filas_ficticias;i++){
            for(int j=0;j<columnas_ficticias;j++){
                if(i < 3){
                    System.out.print(matriz_ficticia[i][j] + " ");
                }else{
                    System.out.print(matriz_ficticia[i][j] + " ");
                }
            }
            System.out.println("");
        }
        
        matriz_ficticia = obtenerMatrizResultante.restarMenorColumnas(matriz_ficticia, filas_ficticias, columnas_ficticias);
        
        System.out.println("");        
        for(int i=0;i<filas_ficticias;i++){
            for(int j=0;j<columnas_ficticias;j++){
                if(i < 3){
                    System.out.print(matriz_ficticia[i][j] + " ");
                }else{
                    System.out.print(matriz_ficticia[i][j] + " ");
                }
            }
            System.out.println("");
        }
        
        //mandar matriz_ficticia
        matriz_ficticia = obtenerMatrizResultante.matrizResultante(matriz_ficticia, filas_ficticias, columnas_ficticias, matriz_original);
        
        System.out.println("");  
        
        for(int i=0;i<filas_ficticias;i++){
            for(int j=0;j<columnas_ficticias;j++){
                if(matriz_ficticia[i][j] > 0.001){
                    System.out.print(matriz_ficticia[i][j] + " ");
                }else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println("");
        }
        
        System.out.println("oiasfsabfkjafjsbdjfbkfbajbfjaibjfsbl");
        
        return matriz_ficticia;
    }
    
    public MatrizOriginal llenarMatriz(MatrizOriginal matriz_original){
        Scanner sc = new Scanner(System.in);
        
        final int MAX = 10;
        int menor = 1000000000, fila = 0, columna = 0, cont_filas = 0;
        System.out.println("Digite la matriz: ");
        
        for(int i=0;i<matriz_original.filas_original;i++){
            for(int j=0;j<matriz_original.columnas_original;j++){              
                matriz_original.matriz_original[i][j] = sc.nextInt();    
            }
        }
        
        return matriz_original;
    }
    
    public float[][] restarMenorFilas(float matriz_ficticia[][], int filas_ficticias, int columnas_ficticias){
        float menor = 1000000000.0f;
        float menores_filas[] = new float[filas_ficticias];
        
        for(int i=0;i<filas_ficticias;i++){
            for(int j=0;j<columnas_ficticias;j++){                              
                if(matriz_ficticia[i][j] < menor){
                    menor = matriz_ficticia[i][j];
                    menores_filas[i] = menor;
                }              
            }
            //Melanie Martiez --GOD
            menor = 1000000000;
        }
        
        for(int i=0;i<filas_ficticias;i++){
            for(int j=0;j<columnas_ficticias;j++){                              
                   matriz_ficticia[i][j] -= menores_filas[i];          
            }
        }
        
        return matriz_ficticia;
    } 
    
    public float[][] restarMenorColumnas(float matriz_ficticia[][], int filas_ficticias, int columnas_ficticias){
        float menor = 1000000000.f;
        float menores_columnas[] = new float[columnas_ficticias];
        
        for(int i=0;i<filas_ficticias;i++){
            for(int j=0;j<columnas_ficticias;j++){                              
                if(matriz_ficticia[j][i] < menor){
                    menor = matriz_ficticia[j][i];
                    menores_columnas[i] = menor;
                }              
            }
            //Melanie Martiez --GOD
            menor = 1000000000;
        }
        
        for(int i=0;i<filas_ficticias;i++){
            for(int j=0;j<columnas_ficticias;j++){                              
                   matriz_ficticia[j][i] -= menores_columnas[i];          
            }
        }
        
        return matriz_ficticia;
    } 
    
    public float[][] matrizResultante(float matriz_ficticia[][], int filas_ficticias, int columnas_ficticias,MatrizOriginal matriz_original){
        int total_tachados = 0;
        float menor_libres = 10000000.0f;//menor de los valores que no fueron tachados
        boolean matriz_final = false;
        
        int filas_ceros[] = new int[filas_ficticias];
        int columnas_ceros[] = new int[columnas_ficticias];
        
        int filas_tachadas[] = new int[filas_ficticias];
        int columnas_tachadas[] = new int[columnas_ficticias];
        int columnas_tachadasFinales[] = new int[columnas_ficticias];
        
        int contFilas_tachadas = 0, contColumnas_tachadas = 0, contColumnas_tachadasFinales = 0;
        boolean matriz_visitados[][] = new boolean[filas_ficticias][columnas_ficticias];
        
        do{
            contFilas_tachadas = 0;
            contColumnas_tachadas = 0;
            contColumnas_tachadasFinales = 0;
            menor_libres = 1000000;
            
            for(int i=0;i<filas_ficticias;i++){
               filas_tachadas[i] = 0;
            }
            
            for(int i=0;i<columnas_ficticias;i++){
               columnas_tachadas[i] = 0;
            }
            
            for(int i=0;i<columnas_ficticias;i++){
               columnas_tachadasFinales[i] = 0;
            }
            
        for(int i=0;i<filas_ficticias;i++){
            filas_ceros[i] = 0;
        }
        
        for(int i=0;i<columnas_ficticias;i++){
            columnas_ceros[i] = 0;
        }
        
        for(int i=0;i<filas_ficticias;i++){
            for(int j=0;j<columnas_ficticias;j++){                              
                   if(matriz_ficticia[i][j] == 0){
                       filas_ceros[i]++;
                   }          
            }
        }
        
        for(int i=0;i<filas_ficticias;i++){
            for(int j=0;j<columnas_ficticias;j++){                              
                   if(matriz_ficticia[j][i] == 0){
                       columnas_ceros[i]++;    
                   }          
            }
        }
        
        for(int i=0;i<filas_ficticias;i++){
            if(filas_ceros[i] > 1){
                filas_tachadas[contFilas_tachadas] = i;
                contFilas_tachadas++;
            }
        }
        
        for(int i=0;i<columnas_ficticias;i++){
            if(columnas_ceros[i] > 0){
                columnas_tachadas[contColumnas_tachadas] = i;
                contColumnas_tachadas++;
            }
        }
        
        //Inicializar matriz visitados
        for(int i=0;i<filas_ficticias;i++){
            for(int j=0;j<columnas_ficticias;j++){                              
                matriz_visitados[i][j] = false;         
            }
        }
        
        for(int i=0;i<contFilas_tachadas;i++){
            for(int j=0;j<columnas_ficticias;j++){                              
                matriz_visitados[filas_tachadas[i]][j] = true;         
            }
        }
        
        for(int i=0;i<contColumnas_tachadas;i++){
            for(int j=0;j<columnas_ficticias;j++){                              
                if((matriz_ficticia[j][columnas_tachadas[i]] == 0) && (matriz_visitados[j][columnas_tachadas[i]] == false)){
                    for(int k=0;k<columnas_ficticias;k++){
                        matriz_visitados[k][columnas_tachadas[i]] = true;
                    }
                    j = 10;                    
                    columnas_tachadasFinales[contColumnas_tachadasFinales] = columnas_tachadas[i];
                    contColumnas_tachadasFinales++;
                }   
            }
        }
        
        if((contFilas_tachadas + contColumnas_tachadasFinales) == filas_ficticias){
            matriz_final = true;
            break;
        }
        
        for(int i=0;i<filas_ficticias;i++){           
            for(int j=0;j<contFilas_tachadas;j++){                              
                if(i != filas_tachadas[j]){
                   for(int k=0;k<columnas_ficticias;k++){
                      for(int z=0;z<contColumnas_tachadasFinales;z++){
                        if(k != columnas_tachadasFinales[z]){
                            if(matriz_ficticia[i][k] < menor_libres){
                                if((matriz_ficticia[i][k] != 0) && (matriz_visitados[i][k] == false)){
                                   menor_libres = matriz_ficticia[i][k];
                                }                                
                            }
                        }
                      }   
                   } 
                }
            }
        }
        
        for(int i=0;i<filas_ficticias;i++){           
            for(int j=0;j<contFilas_tachadas;j++){                              
                if(i != filas_tachadas[j]){
                   for(int k=0;k<columnas_ficticias;k++){
                      for(int z=0;z<contColumnas_tachadasFinales;z++){
                        if((k != columnas_tachadasFinales[z]) && (matriz_visitados[i][k] == false)){
                            if((matriz_ficticia[i][k] != 0) ){
                                matriz_ficticia[i][k] -= menor_libres;
                                matriz_visitados[i][k] = true;
                            }
                        }
                      }   
                   } 
                }
            }
        } 
                        
        for(int i=0;i<filas_ficticias;i++){           
            for(int j=0;j<contFilas_tachadas;j++){                              
                if(i == filas_tachadas[j]){
                   for(int k=0;k<columnas_ficticias;k++){
                      for(int z=0;z<contColumnas_tachadasFinales;z++){
                        if(k == columnas_tachadasFinales[z]){                            
                                matriz_ficticia[i][k] += menor_libres;                           
                        }
                      }   
                   } 
                }
            }
        }
        
        if((contFilas_tachadas + contColumnas_tachadasFinales) == filas_ficticias){
            break;
        }
            
        }while(matriz_final == false); 
        
        //Fase final, paso 6:
        //identificar: Escoger el número menor (siempre será 0) de cada fila, 
        //de tal manera que su columna no coincida con el número seleccionado de otra fila, es decir, 
        //el numero seleccionado de cada fila será único tanto en la fila como en la columna.
        
        int coordenadasFinales_filas[] = new int[filas_ficticias];
        boolean coordenadasFinales_filasVisitados[] = new boolean[filas_ficticias];       
        int coordenadasFinales_columnas[] = new int[columnas_ficticias];
        boolean coordenadasFinales_columnasVisitados[] = new boolean[filas_ficticias];
        boolean coordenadasFinales_visitados[] = new boolean[filas_ficticias];
        int contCoordenadasFinalesColumnas = 0;
        boolean matrizFinal_visitados[][] = new boolean[filas_ficticias][columnas_ficticias];
        
        int ceros_finales[] = new int[filas_ficticias];
        int cont_final = 0; 
        
        for(int i=0;i<filas_ficticias;i++){
            ceros_finales[i] = 0;
            coordenadasFinales_filas[i] = 0;
            coordenadasFinales_filasVisitados[i] = false;
            coordenadasFinales_columnas[i] = 0;
            coordenadasFinales_columnasVisitados[i] = false;
            coordenadasFinales_visitados[i] = false;                       
        }
        
        for(int i=0;i<filas_ficticias;i++){
            for(int j=0;j<columnas_ficticias;j++){                              
                   matrizFinal_visitados[i][j] = false;
            }
        }
        
        int contCoordenadasFinalesFilas = 0;
        
        float valores_finales[] = new float[filas_ficticias];
        float orden_salidaFilas[] = new float[filas_ficticias];
        int orden_salidaColumnas[] = new int[filas_ficticias];
        int contValores_finales = 0;
        
        System.out.println("");
        System.out.println("Sooooooooooooooooo   ");
        
        System.out.println("");    
        
        for(int i=0;i<filas_ficticias;i++){
            for(int j=0;j<columnas_ficticias;j++){
                if(i < 3){
                    System.out.print(matriz_ficticia[i][j] + " ");
                }else{
                    System.out.print(matriz_ficticia[i][j] + " ");
                }
            }
            System.out.println("");
        }
        
        for(int i=0;i<filas_ficticias;i++){
            for(int j=0;j<columnas_ficticias;j++){
                if(matriz_ficticia[i][j] < 0.009){
                    matriz_ficticia[i][j] = 0.0f;
                }
            }           
        }
        
        System.out.println("");
        
        for(int i=0;i<filas_ficticias;i++){
            for(int j=0;j<columnas_ficticias;j++){
                if(i < 3){
                    System.out.print(matriz_ficticia[i][j] + " ");
                }else{
                    System.out.print(matriz_ficticia[i][j] + " ");
                }
            }
            System.out.println("");
        }
       
        int cont_total = 0;
        boolean limite_iguales = false;
        float valor_menor = 100000000000.0f;
        
       do{
        valor_menor = 100000000000.0f;       
        
        if((limite_iguales == true) && (cont_total >= 2)){ 
               int fila_menor = 0, columna_menor = 0;
               for(int i=0;i<filas_ficticias;i++){
                  for(int j=0;j<filas_ficticias;j++){
                     if((matriz_ficticia[i][j] == 0) && (matrizFinal_visitados[i][j] == false) && (matriz_original.matriz_original[i][j] <= valor_menor)){
                         valor_menor = matriz_ficticia[i][j];
                         fila_menor = i;
                         columna_menor = j;             
                     }
                  } 
               }
               
               for(int k=0;k<filas_ficticias;k++){
                    matrizFinal_visitados[fila_menor][k] = true;                
               }
                         
               for(int k=0;k<filas_ficticias;k++){
                    matrizFinal_visitados[k][columna_menor] = true;  
               }
                         
               coordenadasFinales_filas[contCoordenadasFinalesFilas] = fila_menor;
               coordenadasFinales_columnas[contCoordenadasFinalesFilas] = columna_menor;
               cont_final++;
               valores_finales[contValores_finales] =  matriz_original.matriz_original[fila_menor][columna_menor];
               orden_salidaFilas[contValores_finales] = fila_menor;
               orden_salidaColumnas[contValores_finales] = columna_menor;
               contValores_finales++;
               
               limite_iguales = false;               
           }
        cont_total++;
                                                       
        for(int i=0;i<filas_ficticias;i++){
            ceros_finales[i] = 0;
        }
        
        for(int i=0;i<filas_ficticias;i++){
           for(int j=0;j<columnas_ficticias;j++){
               if((matriz_ficticia[i][j] == 0) && (matrizFinal_visitados[i][j] == false)){
                   ceros_finales[i]++;
               }
           } 
        }
        
        for(int i=0;i<filas_ficticias;i++){
            if(ceros_finales[i] >= 2){
                limite_iguales = true;
            }
        }
        
        for(int i=0;i<filas_ficticias;i++){
           if(ceros_finales[i] == 1){
               for(int j=0;j<columnas_ficticias;j++){                                    
                   if((matriz_ficticia[i][j] == 0) && (matrizFinal_visitados[i][j] == false)){
                       for(int k=0;k<columnas_ficticias;k++){
                           matrizFinal_visitados[k][j] = true;
                       }
                       coordenadasFinales_filas[contCoordenadasFinalesFilas] = i;
                       coordenadasFinales_columnas[contCoordenadasFinalesFilas] = j;
                       cont_final++;
                       valores_finales[contValores_finales] =  matriz_original.matriz_original[i][j];
                       orden_salidaFilas[contValores_finales] = i;
                       orden_salidaColumnas[contValores_finales] = j;
                       contValores_finales++;
                   }
                    matrizFinal_visitados[i][j] = true;
               }
           }
        }
                               
         if(limite_iguales == true){
               limite_iguales = false;
           }
             
        
        //Contar 0 columnas 
        valor_menor = 100000000000.0f;
        
        for(int i=0;i<filas_ficticias;i++){
            ceros_finales[i] = 0;
        }
        
        for(int i=0;i<filas_ficticias;i++){
           for(int j=0;j<columnas_ficticias;j++){
               if((matriz_ficticia[j][i] == 0) && (matrizFinal_visitados[j][i] == false)){
                   ceros_finales[i]++;
               }
           } 
        }
        
        for(int i=0;i<filas_ficticias;i++){
            if(ceros_finales[i] > 1){
                limite_iguales = true;
            }
        }
        
        for(int i=0;i<columnas_ficticias;i++){
           if(ceros_finales[i] == 1){
               for(int j=0;j<filas_ficticias;j++){                                     
                   if((matriz_ficticia[j][i] == 0) && (matrizFinal_visitados[j][i] == false)){
                       for(int k=0;k<columnas_ficticias;k++){
                           matrizFinal_visitados[j][k] = true;
                       }
                       coordenadasFinales_filas[contCoordenadasFinalesFilas] = j;
                       coordenadasFinales_columnas[contCoordenadasFinalesFilas] = i;
                       cont_final++;
                       valores_finales[contValores_finales] =  matriz_original.matriz_original[j][i];
                       orden_salidaFilas[contValores_finales] = j;
                       orden_salidaColumnas[contValores_finales] = i;
                       contValores_finales++;
                   }
                   matrizFinal_visitados[j][i] = true;
               }
           }
        } 
        
        
        if((limite_iguales == true) && (cont_total >= 2)){ 
               int fila_menor = 0, columna_menor = 0;
               for(int i=0;i<filas_ficticias;i++){
                  for(int j=0;j<filas_ficticias;j++){
                     if((matriz_ficticia[i][j] == 0) && (matrizFinal_visitados[i][j] == false) && (matriz_original.matriz_original[i][j] <= valor_menor)){
                         valor_menor = matriz_original.matriz_original[i][j];
                         fila_menor = i;
                         columna_menor = j;
                     }
                  } 
               }
               
               for(int k=0;k<filas_ficticias;k++){
                    matrizFinal_visitados[fila_menor][k] = true;                
               }
                         
               for(int k=0;k<filas_ficticias;k++){
                    matrizFinal_visitados[k][columna_menor] = true;  
               }
                         
               coordenadasFinales_filas[contCoordenadasFinalesFilas] = fila_menor;
               coordenadasFinales_columnas[contCoordenadasFinalesFilas] = columna_menor;
               cont_final++;
               valores_finales[contValores_finales] =  matriz_original.matriz_original[fila_menor][columna_menor];
               orden_salidaFilas[contValores_finales] = fila_menor;
               orden_salidaColumnas[contValores_finales] = columna_menor;
               contValores_finales++;
               
               limite_iguales = false;
               //dos_iguales = 0;
           }
        cont_total++;
        
        if(limite_iguales == true){
            limite_iguales = false;
        }
        
        //dos_iguales++;        
       }while(cont_final != filas_ficticias);

       System.out.println("");
        
       for(int i=0;i<filas_ficticias;i++){
          System.out.println(matriz_original.nombre_objeto + (orden_salidaFilas[i] + 1) + " " + (orden_salidaColumnas[i] + 1)+ " " + valores_finales[i] + " ");
       }
        
        return matriz_ficticia;
    }
}