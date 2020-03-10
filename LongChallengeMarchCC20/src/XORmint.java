import java.io.*;
import java.util.*;

public class XORmint {
	
	public static HashMap<Long,Boolean> map=new HashMap<>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		
		int size=100000000;
		boolean bitArray[]=new boolean[size];
		
		for(int i=1;i<size;i++){		
				if(Integer.bitCount(i)%2==0){
					bitArray[i]=true;
				}
		}
		System.out.println("stop");
		
		int t=Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		while(t-->0){
			st=new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			int q=Integer.parseInt(st.nextToken());
			
			int arr[]=new int[n];
			st=new StringTokenizer(br.readLine());
			for(int i=0;i<n;i++){
				arr[i]=Integer.parseInt(st.nextToken());
			}
			
			while(q-->0){
				int p=Integer.parseInt(br.readLine());
				int countBit,odd=0,even=0;
				long num;
				for(int i=0;i<n;i++){
					num=arr[i]^p;					
					if(num>size){
						if(map.containsKey(num)){
							if(map.get(num)){
								even++;
							}
						}else{
							countBit=Long.bitCount(num);
							if(countBit%2==0){
								map.put(num, true);
								even++;
							}else{
								map.put(num, false);
							}
						}
						
					}else{
						if(bitArray[(int) num]){
							even++;
						}
						}
					
					
				}
				
				
				out.println(even+" "+(n-even));
				
			}
			
		
		}
		out.flush();
		out.close();
	}

}
