package _01_java_Basics;

public class PrintingPatterns {
    public static void printNumberTriangle(int row){
        int n=1;
        for(int i = 1;i <= row;i++){
            for(int j=1;j<=i;j++){
            System.out.print(n);
            n++;
        }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PrintingPatterns.printNumberTriangle(5);
    }
}
