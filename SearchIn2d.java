import java.util.*;
public class SearchIn2d {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int [][]arr=new int[r][c];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=s.nextInt();
            }
        }
        int x=s.nextInt();
        int i=0;
        int j=arr[0].length-1;
        while(i<arr.length && j>=0){
            if(x==arr[i][j]){
                System.out.println(arr[i][j]);
                return;
            }
            else if(x<arr[i][j]){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("not found");
    }
}
