import java.io.*;
import java.util.*;

public class CodeGladiatorQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      int t=scan.nextInt();
      while(t-->0){
    	  int n=scan.nextInt();
    	  ArrayList<Integer> arr=new ArrayList<>();
    	  int brr[]=new int[n];
    	  for(int j=0;j<n;j++){
    		  arr.add(scan.nextInt());
    	  }
    	  for(int j=0;j<n;j++){
    		  brr[j]=scan.nextInt();
    	  }
    	  
    	 Collections.sort(arr);
    	  
    	  int ans=0;
    	  
    	  for(int i=0;i<n;i++){
    		  int index=next(arr,brr[i]);
    		  if(index==-1){
    			  continue;
    		  }
    		  
    		 arr.remove(index);
    		 ans++;  		  
    		  
    		  
    		  
    	  }
    	  
    	  
    	 System.out.println(ans); 
    	  
      }
	}
	
	

	private static int next(ArrayList<Integer> arr, int target)  
    {  
        int start = 0, end = arr.size() - 1;  
    
        int ans = -1;  
        while (start <= end) {  
            int mid = (start + end) / 2;  
    
            // Move to right side if target is  
            // greater.  
            if (arr.get(mid) <= target) {  
                start = mid + 1;  
            }else {  
                ans = mid;  
                end = mid - 1;  
            }  // Move left side.  
        }  
        return ans;  
    }

}
