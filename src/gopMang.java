import java.util.Arrays;
import java.util.Scanner;

public class gopMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] mang1=new int[3];
        for (int i=0; i<mang1.length; i++) {
            System.out.println("nhap phan tu mang1 thu "+i);
            mang1[i]=input.nextInt();
        }
        System.out.println(" phan tu trong mang 1 la: ");
        for (int hienThiMang1: mang1) {
            System.out.print((hienThiMang1)+"\t");
        }
        int [] mang2 = new int[3];
        for (int i=0; i<mang2.length; i++){
            System.out.println("nhap phan tu mang2 thu "+ i);
            mang2[i]=input.nextInt();
        }
        System.out.println("phan thu trong mang 2la: ");
        for (int i= 0; i<mang2.length; i++) {
            System.out.print(mang2[i]+"\t");
        }
        int lenght=mang1.length+mang2.length;
        int[] mang3= new int[lenght];
        int viTri=0;
        for (int element : mang1){
            mang3[viTri]=element;
            viTri++;
        }
        for (int elment:mang2){
            mang3[viTri]=elment;
            viTri++;
        }
        System.out.println("cac phan tu trong mang 3 la: ");
        System.out.println(Arrays.toString(mang3));

    }
}
