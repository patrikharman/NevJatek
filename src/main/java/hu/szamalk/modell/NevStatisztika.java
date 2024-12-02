package hu.szamalk.modell;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NevStatisztika {

    private String jel;
    private char kezdobetu;
    private char[][] matrix;


    public NevStatisztika(String jel, String nev) {
        this.jel = jel;
        this.kezdobetu = nev.charAt(0);
        this.matrix = matrixLetrehozasa();
    }


    private char[][] matrixLetrehozasa() {
        char[][] matrix = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = ' ';
            }
        }

        matrix[0][0] = kezdobetu;
        matrix[0][1] = kezdobetu;
        matrix[0][2] = kezdobetu;
        matrix[1][0] = kezdobetu;
        matrix[1][2] = kezdobetu;
        matrix[2][0] = kezdobetu;
        matrix[2][1] = kezdobetu;
        matrix[2][2] = kezdobetu;
        matrix[3][0] = kezdobetu;
        matrix[4][0] = kezdobetu;
        return matrix;
    }


    public void kirajzol() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == kezdobetu) {
                    System.out.print(jel);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public int hanyJelVanSorban(int sor) {
        int count = 0;
        for (int j = 0; j < matrix[sor].length; j++) {
            if (matrix[sor][j] == kezdobetu) {
                count++;
            }
        }
        return count;
    }


    public int hanyJelVanOszlopban(int oszlop) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][oszlop] == kezdobetu) {
                count++;
            }
        }
        return count;
    }


    public boolean teliVanSor(int sor) {
        for (int j = 0; j < matrix[sor].length; j++) {
            if (matrix[sor][j] != kezdobetu) {
                return false;
            }
        }
        return true;
    }



    public void fajlbaIr(String fajlnev) throws IOException {
        File file = new File(fajlnev);
        FileWriter writer = new FileWriter(file);
        for (int k = 0; k < 100; k++) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == kezdobetu) {
                        writer.write(jel);
                    } else {
                        writer.write(" ");
                    }
                }
                writer.write("\n");
            }
            writer.write("\n");
        }
        writer.close();
    }
}