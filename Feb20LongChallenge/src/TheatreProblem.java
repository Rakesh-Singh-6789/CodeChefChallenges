
import java.io.*;
import java.util.*;

public class TheatreProblem {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int cases=Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		
		while(cases-->0){
			int n=Integer.parseInt(br.readLine());
			int arr[][]=new int[4][4];
			Integer singleArr[]=new Integer[16];
			while(n-->0){
				st= new StringTokenizer(br.readLine());
				String m=st.nextToken();
				String t=st.nextToken();
				
				int row,col;
				
				if(m.equals("A")){
					row=0;
				}else if(m.equals("B")){
					row=1;
				}else if(m.equals("C")){
					row=2;
				}else{
					row=3;
				}
				
				if(t.equals("12")){
					col=0;
				}else if(t.equals("3")){
					col=1;
				}else if(t.equals("6")){
					col=2;
				}else{
					col=3;
				}
				//System.out.print(" "+m+" "+t);
				arr[row][col]+=1;
				
				
				
			}
			int k=0;
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					singleArr[k++]=arr[i][j];
					}
			}
			
			Arrays.sort(singleArr,Collections.reverseOrder());
			
			/*for(int i=0;i<16;i++){
				System.out.print(singleArr[i]+ " ");
			}
			System.out.println();*/
			
			
			HashSet<Integer> rowSet=new HashSet<>();
			HashSet<Integer> colSet=new HashSet<>();
			
			
		}

	}

}
