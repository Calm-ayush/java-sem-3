package class2;

public class pattern5 {
    public static void main(String[] args){
        int n=7;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if((i+j)%2==0){
                    System.out.print("0");
                }
                else{
                System.out.print("1");}
                }
              System.out.println();
        }
    } 
}

//1010101
//0101010
//1010101