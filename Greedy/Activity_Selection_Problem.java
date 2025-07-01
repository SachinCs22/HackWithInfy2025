import java.util.Arrays;

public class Activity_Selection_Problem {
    public static int answer(int [][]arr){
        Arrays.sort(arr,(a,b)->a[1]-b[1]);
        int curr=arr[0][1],ans=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]>curr){
                ans++;
                curr=arr[i][1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Activity_Selection_Problem.answer(new int[][] {{1,3},{2,4},{3,5},{0,6},{5,7},{8,9}}));
    }
}
