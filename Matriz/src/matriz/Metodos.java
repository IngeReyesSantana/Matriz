package matriz;

import java.util.Random;

/**
 * Clase Metodo
 * @autores Reyes Santana - Diana Pinzon
 * @version 1.0
 * 
 */
public class Metodos {
    Random rnd = new Random();
    Vista vis = new Vista();

    public int[][] CrearMatriz(int Filas, int Columnas) {
        int Matriz[][] = new int[Filas][Columnas];
        int x, y;
        for (x = 0; x < Filas; x++) {
            for (y = 0; y < Columnas; y++) {
                Matriz[x][y] = rnd.nextInt(8) + 1;
            }
        }
        Imprimir(Matriz);
        return Matriz;
    }

    public void Derecha(int MatrizPrincipal[][], int y, int x) {
        Metodos metodos = new Metodos();
        int Mat[][] = new int[x][y];
        int i, j;
        int aux1 = 0;
        int aux2 = 0;
        for (j = 0; j < x; j++) {
            aux2 = 0;
            for (i = y - 1; i >= 0; i--) {
                Mat[aux1][aux2] = MatrizPrincipal[i][j];
                aux2++;
            }
            aux1++;
        }
        //metodos.Imprimir(Mat, x, y);
    }

    public void Izquierda(int MatrizPrincipal[][], int y, int x) {
        Metodos metodos = new Metodos();
        int Mat[][] = new int[x][y];
        int i, j;
        int aux1 = 0;
        int aux2 = 0;
        for (j = x - 1; j >= 0; j--) {
            aux2 = 0;
            for (i = 0; i < y; i++) {
                Mat[aux1][aux2] = MatrizPrincipal[i][j];
                aux2++;
            }
            aux1++;
        }
        //metodos.Imprimir(Mat, x, y);
    }

    public int[][] Imprimir(int Matriz[][]) {
        int i, j;
        for (i = 0; i < Matriz.length; i++) {
            for (j = 0; j < Matriz[i].length; j++) {
                vis.txtmatriz.setText(Integer.toString(Matriz[i][j])+" ");
            }
        }
        return Matriz;
    }

}
