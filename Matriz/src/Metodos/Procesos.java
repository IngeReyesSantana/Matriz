package Metodos;

import Vista.Vista;
import java.util.Random;
/**
 *
 * @author Reyes Hernando Santana - Diana Pilar Pinzon
 */
public class Procesos {
    
    public static Random rnd = new Random();
    
    public static int[][] CrearMatriz (int Filas, int Columnas){
        for (int i = 0; i < Filas; i++) {
            for (int j = 0; j < Columnas; j++) {
                Vista.tblMatrizOri.setValueAt((rnd.nextInt(8)+1), i, j);
            }
        }
        return null;
    }
    
    public static int[][] Derecha (int Filas, int Columnas){
        int aux1 = 0;
        int aux2 = Columnas-1;
        for (int i = 0; i < Filas; i++) {
            for (int j = 0; j < Columnas; j++) {
                int Cuadro = (int) Vista.tblMatrizOri.getValueAt(aux2, aux1);
                aux2--;
                Vista.tblMatrizRot.setValueAt(Cuadro, i, j);  
            }
            aux2 = Columnas-1;
            aux1++;
        }
        return null;  
    } 
    
    public static int[][] Izquierda (int Filas, int Columnas){
        int aux1 = Filas-1;
        int aux2 = 0;
        for (int i = 0; i < Filas; i++) {
            for (int j = 0; j < Columnas; j++) {
                int Cuadro = (int) Vista.tblMatrizOri.getValueAt(aux2, aux1);
                aux2++;
                Vista.tblMatrizRot.setValueAt(Cuadro, i, j);  
            }
            aux2 = 0;
            aux1--;
        }
        return null;  
    }
    
    public static int[][] Espejo (int Filas, int Columnas){
        int aux1 = Filas-1;
        int aux2 = Columnas-1;
        for (int i = 0; i < Filas; i++) {
            for (int j = 0; j < Columnas; j++) {
                int Cuadro = (int) Vista.tblMatrizOri.getValueAt(aux1, aux2);
                aux2--;
                Vista.tblMatrizRot.setValueAt(Cuadro, i, j);  
            }
            aux2 = Columnas-1;
            aux1--;
        }
        return null;  
    }
    
}
