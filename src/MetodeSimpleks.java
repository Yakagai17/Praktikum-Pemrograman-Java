/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Aganinggar
 */
public class MetodeSimpleks {
private static final int INFINITY = 999;
    private static int VK = 3;
    private static int M = 6;
    private static int N = 3;
     
    public static void entryAwal() {
        System.out.println("Max Z = C1X1 + C2X2 + C3X3 + ... + CnXn");
        System.out.println("A11X1 + A12X2 + A13X3 + ... + A1nXn <= B1");
        System.out.println("A21X1 + A22X2 + A23X3 + ... + A2nXn <= B2");
        System.out.println("A31X1 + A31X2 + A32X3 + ... + A3nXn <= B3");
        System.out.println("             ...");
        System.out.println("Am1X1 + Am1X2 + Xm2x3 + ... + AmnXn <= Bm\n");
         
        Scanner in = new Scanner(System.in);
        System.out.print("Jumlah variabel keputusan : ");
        VK = in.nextInt();
        System.out.print("Jumlah fungsi pembatas : ");

        N = in.nextInt();
        M = N + VK;
        
        if(N < VK) {
            System.out.println("\nJumlah fungsi pembatas harus lebih dari jumlah variabel keputusan!!\n");
            entryAwal();
        }

    }

    public static void main(String[] args) {
        entryAwal();
        float c[] = new float[M];
        float a[][] = new float[N][M];
        float b[] = new float[N];
        float temp[] = new float[M];
        int tempminpos;
        float miniratio[] = new float[N];
        int miniratiominpos;
        float key;
        int gooutcol = 0;
        float z;
        float x[] = new float[M];
        int basic[] = new int[N];
        int nonbasic[] = new int[N];
        int flag = 0;
        
        
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            basic[i] = (i + VK);
            nonbasic[i] = i;
        }
        System.out.println("\nMasukan nilai koefisien C untuk fungsi tujuan");
        for (int i = 0; i < VK; i++) {
            int num = i + 1;
            System.out.print("C[" + num + "] : ");
            c[i] = in.nextFloat();
        }
        System.out.println("\nMasukan nilai untuk ");
        for (int i = 0; i < N; i++) {
            int num = i + 1;
            System.out.println("Fungsi pembatas " + num);
            for (int j = 0; j < VK; j++) {
                int num2 = j + 1;
                System.out.print("A[" + num + "][" + num2 + "] : ");
                a[i][j] = in.nextFloat();
            }
            System.out.print("B[" + num + "] : ");
            b[i] = in.nextFloat();
            System.out.println();
        }
         
        for (int i = 0; i < N; i++) {
            a[i][i + VK] = 1;
        }

        while (flag == 0) {
            z = 0;

            for (int i = 0; i < M; i++) {
                temp[i] = 0;
                for (int j = 0; j < N; j++) {
                    temp[i] += c[basic[j]] * a[j][i];
                }
                temp[i] -= c[i];
            }
            System.out.println("\n");
            tempminpos = 0;
            for (int i = 1; i < M; i++) {
                if (temp[i] < temp[tempminpos]) {
                    tempminpos = i;
                }
            }
            System.out.print("\nBasis\t");
            for (int i = 0; i < M; i++) {
                int num = i + 1;
                if(i < VK) System.out.print("X" + num + "\t");
                else System.out.print("S" + (num - VK) + "\t");
            }

            System.out.println("B");
             
            for (int i = 0; i < N; i++) {
                if(basic[i] < VK) System.out.printf("\nX%d\t", basic[i] + 1);
                else System.out.printf("\nS%d\t", basic[i] + 1 - VK);
                for (int j = 0; j < M; j++) {
                    System.out.printf("%.4g\t", a[i][j]);
                }
                System.out.printf("%.4g", b[i]);
                System.out.println();
            }
            System.out.print("\nZj-Cj\t");
            for (int i = 0; i < M; i++) {
                System.out.printf("%.4g\t", temp[i]);
            }
            System.out.println("\n");
            for (int i = 0; i < N; i++) {
                x[basic[i]] = b[i];
                x[nonbasic[i]] = 0;
                if(basic[i] < VK) System.out.printf("X[%d]=%g\n", basic[i] + 1, b[i]);
                else System.out.printf("S[%d]=%g\n", basic[i] + 1 - VK, b[i]);
            }
            for (int i = 0; i < N; i++) {
                z = z + c[i] * x[i];
            }

            System.out.println("Maks(z) = " + z);

 
            for (int i = 0; i < N; i++) {
                if (a[i][tempminpos] == 0) {
                    miniratio[i] = INFINITY;
                    continue;
                }
                if (a[i][tempminpos] < 0) {
                    miniratio[i] = INFINITY;
                    continue;
                }
                miniratio[i] = b[i] / a[i][tempminpos];
            }
            miniratiominpos = 0;
            for (int i = 1; i < N; i++) {
                if (miniratio[i] < miniratio[miniratiominpos]) {
                    miniratiominpos = i;
                }
            }
            for (int i = 0; i < N; i++) {
                if (miniratiominpos == i) {
                    gooutcol = basic[i];
                }
            }
        
            basic[miniratiominpos] = tempminpos;
            nonbasic[tempminpos] = gooutcol;
            key = a[miniratiominpos][tempminpos];

            b[miniratiominpos] = b[miniratiominpos] / key;
            for (int i = 0; i < M; i++) {
                a[miniratiominpos][i] = a[miniratiominpos][i] / key;
            }
            for (int i = 0; i < N; i++) {
                if (miniratiominpos == i) {
                    continue;
                }
                key = a[i][tempminpos];
                for (int j = 0; j < M; j++) {
                    a[i][j] = a[i][j] - a[miniratiominpos][j] * key;
                }
                b[i] = b[i] - b[miniratiominpos] * key;
            }
            for (int i = 0; i < M; i++) {
                flag = 1;
                if (temp[i] < 0) {
                    flag = 0;
                    break;
                }
        }
        }
         
        System.out.print("\n\nUlangi (y/t)? ");
        char ulang = in.next().toUpperCase().charAt(0);
 
        if(ulang == 'Y') MetodeSimpleks.main(args);
    }
    
}
