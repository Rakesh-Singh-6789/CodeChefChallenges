import java.io.*;
import java.util.*;

public class XORmint {
	
	//public static HashMap<Long,Boolean> map=new HashMap<>();
	
	static int size=100000000;
	static int bitArray[]=new int[size];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		
		/*for(int i=1;i<size;i++){		
				if(Integer.bitCount(i)%2==0){
					bitArray[i]=true;
				}
		}*/
		
		Reader scan=new Reader();
		
		
		
		PrintWriter out=new PrintWriter(System.out);
		int t=scan.nextInt();
		while(t-->0){
			int n=scan.nextInt();
			int q=scan.nextInt();
			
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++){
				arr[i]=scan.nextInt();
			}
			
			while(q-->0){
				int p=scan.nextInt();
				int num,countBit,even=0;
				for(int i=0;i<n;i++){
					num=arr[i]^p;
					
					if(bitArray[num]==0){
						countBit=Integer.bitCount(num);
						bitArray[num]=countBit;
					}else{
						countBit=bitArray[num];
					}
					if(countBit%2==0){
						even++;
					}
					
					
				}
				
				out.println(even+" "+(n-even));
				
			}
			out.flush();
		
		}
		scan.close();
	    
		out.close();
	}	
	
	 static class Reader 
	    { 
	        final private int BUFFER_SIZE = 1 << 16; 
	        private DataInputStream din; 
	        private byte[] buffer; 
	        private int bufferPointer, bytesRead; 
	  
	        public Reader() 
	        { 
	            din = new DataInputStream(System.in); 
	            buffer = new byte[BUFFER_SIZE]; 
	            bufferPointer = bytesRead = 0; 
	        } 
	  
	        public Reader(String file_name) throws IOException 
	        { 
	            din = new DataInputStream(new FileInputStream(file_name)); 
	            buffer = new byte[BUFFER_SIZE]; 
	            bufferPointer = bytesRead = 0; 
	        } 
	  
	        public String readLine() throws IOException 
	        { 
	            byte[] buf = new byte[64]; // line length 
	            int cnt = 0, c; 
	            while ((c = read()) != -1) 
	            { 
	                if (c == '\n') 
	                    break; 
	                buf[cnt++] = (byte) c; 
	            } 
	            return new String(buf, 0, cnt); 
	        } 
	  
	        public int nextInt() throws IOException 
	        { 
	            int ret = 0; 
	            byte c = read(); 
	            while (c <= ' ') 
	                c = read(); 
	            boolean neg = (c == '-'); 
	            if (neg) 
	                c = read(); 
	            do
	            { 
	                ret = ret * 10 + c - '0'; 
	            }  while ((c = read()) >= '0' && c <= '9'); 
	  
	            if (neg) 
	                return -ret; 
	            return ret; 
	        } 	        
	  
	        private void fillBuffer() throws IOException 
	        { 
	            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
	            if (bytesRead == -1) 
	                buffer[0] = -1; 
	        } 
	  
	        private byte read() throws IOException 
	        { 
	            if (bufferPointer == bytesRead) 
	                fillBuffer(); 
	            return buffer[bufferPointer++]; 
	        } 
	  
	        public void close() throws IOException 
	        { 
	            if (din == null) 
	                return; 
	            din.close(); 
	        } 
	    }
	
	
	

}