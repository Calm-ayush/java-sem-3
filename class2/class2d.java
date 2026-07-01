package class2;

public class class2d {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}


//1 2 3 4 5
// 2 3 4 5
//  3 4 5
//   4 5
//    5