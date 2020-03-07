import java.io.*;
import java.util.*;

public class XORmint {
	
	static int[] BitsSetTable256 = new int[256]; 
	  
    
    public static void initialize() 
    { 
        BitsSetTable256[0] = 0; 
        for (int i = 0; i < 256; i++) { 
            BitsSetTable256[i] = (i & 1) + BitsSetTable256[i / 2]; 
        } 
    } 
    public static int countSetBits(int n) 
    { 
        return (BitsSetTable256[n & 0xff] 
                + BitsSetTable256[(n >> 8) & 0xff] 
                + BitsSetTable256[(n >> 16) & 0xff] 
                + BitsSetTable256[n >> 24]); 
    } 

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		int t=Integer.parseInt(br.readLine());
		StringTokenizer st;
		initialize();
		
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
				int num,countBit,odd=0,even=0;
				for(int i=0;i<n;i++){
					num=arr[i]^p;
					countBit=countSetBits(num);
					
					if(countBit%2==0){
						even++;
					}else{
						odd++;
					}
					
				}
				
				
				out.println(even+" "+odd);
				
			}
			out.flush();
		
		}
		out.close();
	}

}
