import java.util.Scanner;

public class SumInColumn {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Width Matrix and then Enter Height Matrix:");
        int width=scanner.nextInt();
        int height=scanner.nextInt();
        int[][] matrix=new int[height][width];
        System.out.println("Enter Element Matrix:");
        for (int i=0;i<height;i++){
            for (int j=0;j<width;j++){
                System.out.print("Element "+i+"-"+j+":");
                matrix[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Matrix:");
        for (int i=0;i<height;i++){
            System.out.println();
            for (int j=0;j<width;j++){
                System.out.print(matrix[i][j]);
            }
        }
        System.out.println("What column you want sum:");
        int col=scanner.nextInt();
        int sum=0;
        if (col<0||col>width){
            System.out.println("Enter again:");
        }else {
            for (int i=0;i<height;i++){
                sum=sum+matrix[i][col-1];
            }
        }
        System.out.println(sum);
    }
}
