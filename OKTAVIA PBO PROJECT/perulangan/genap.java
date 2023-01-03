
package perulangan;
public class genap {
    public static void main(String args[]){
        int a [][] = {{1,2,3,4,5},{6,7,8,9,10}};
        int j = 0;
        while(j <= 4)
        {
            int i = 0;
            while(i <= 1)
            {
                System.out.print(a[i][j]);
                i++;
            }
            System.out.println();
            j++;
        }   
    }
}
