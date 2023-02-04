// <!-- Alternate Matrix Addition
// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are given a chessboard of size N x N, where the top left square is black. Each square contains a value. Find the sum of the values of all black squares and all white squares.

// Remember that in a chessboard black and white squares are alternate.
// Input
// The first line of input will be the N size of the matrix. Then next N lines will consist of elements of the matrix. Each row will contain N elements since it is a square matrix.

// Constraints:-
// 1 <= N <= 800
// 1 <= Matrix[i][j] <= 100000
// Output
// Print two lines, the first line containing the sum of black squares and the second line containing the sum of white squares.
// Example
// Input 1:
// 3
// 1 2 3
// 4 5 6
// 7 8 9

// Output 1:
// 25
// 20

// Sample Input 2:
// 4
// 1 2 3 4
// 6 8 9 10
// 11 12 13 14
// 15 16 17 18 -->

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

class Main {
    public static void main(String[] args) throws IOException {
        // Your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(input[j]);
            }
        }
        matSum(arr, n);

    }

    static void matSum(int arr[][], int n) {
        long sum = 0, sum1 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    sum += arr[i][j];

                } else {
                    sum1 += arr[i][j];
                }
            }
        }
        System.out.println(sum);
        System.out.println(sum1);
    }
}