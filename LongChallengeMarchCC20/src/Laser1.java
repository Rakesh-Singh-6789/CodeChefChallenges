
import java.io.*;
import java.util.*;

public class Laser1 {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int cases=Integer.parseInt(br.readLine());
		StringTokenizer st;


		while(cases-->0){
			st=new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			int q=Integer.parseInt(st.nextToken());
            int yPoints[]=new int[n+1];
            st=new StringTokenizer(br.readLine());
            
            for(int i=1;i<n+1;i++){
            	
            	yPoints[i]=Integer.parseInt(st.nextToken());
            	
            }
            
            while(q-->0){
            	int intersect=0;
            	st=new StringTokenizer(br.readLine());
            	int x1=Integer.parseInt(st.nextToken());
            	int x2=Integer.parseInt(st.nextToken());
            	int y=Integer.parseInt(st.nextToken());
            	int xInc=x1;
            	
            	        	
            	while(true){
            		if(xInc>n || xInc>=x2){
            			break;
            		}
            		
            		if(((y-yPoints[xInc])*(y-yPoints[xInc+1]))<0){
            			if((xInc==x2 && y==yPoints[x2]) || (xInc==x1 && y==yPoints[x1] && xInc==n)){
            				
            			}else{
            				intersect++;
            				//System.out.println(xInc);
            			}
            			
            			
            			
            		}else if(((y-yPoints[xInc])*(y-yPoints[xInc+1]))==0){
            			
            			if(y-yPoints[xInc]==0 && (y-yPoints[xInc+1]!=0)){
            				
            				
            				
            				
            			}else if(y-yPoints[xInc]!=0 && (y-yPoints[xInc+1]==0)){
            				
            			}else{
            				
            			}
            			
            		}
            		
            		xInc++;
            		
            	}
            	System.out.println("ans"+intersect);
            	
            	
            	
            	
            	
            	
            }
            
            
            
	}
	}

}