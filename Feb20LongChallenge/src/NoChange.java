import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NoChange {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int cases=Integer.parseInt(br.readLine());
		StringTokenizer st;


		while(cases-->0){
			st=new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			int p=Integer.parseInt(st.nextToken());
			
			st=new StringTokenizer(br.readLine());
			
			
			int arr[]=new int[n];
			int ans[]=new int[n];
			long sum=0;
			for(int i=0;i<n;i++){
				arr[i]=Integer.parseInt(st.nextToken());
				sum+=arr[i];
			}
			
			if()
			
			
		}
		}

	}


