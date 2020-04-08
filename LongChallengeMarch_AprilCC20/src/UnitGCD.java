import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UnitGCD {

	static public void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());


		while(t-->0){
			solve(br);	
		}

	}

	private static void solve(BufferedReader br) throws Exception {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(br.readLine());
		ArrayList<Integer> primeList=new ArrayList<>();
		primeList.add(1);
		
		
		HashSet<Integer> set=new HashSet<>();
		set=getPrimes(n, primeList);
		
		
		
		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		HashSet<Integer> doneSet=new HashSet<>();
		
		int loop=n-primeList.size();
		while(doneSet.size()<loop){
			Set<Integer> tempSet=new HashSet<>(set);

			for(int element: tempSet){
				if(doneSet.contains(element)){
					continue;
				}
				//BigInteger biEle=BigInteger.valueOf(element);
				ArrayList<Integer> tempList=new ArrayList<>();

				tempList.add(element);
				//set.remove(element);
				doneSet.add(element);
                //tempSet=set;
				for(int secondElement: tempSet){
					if(doneSet.contains(secondElement)){
						continue;
					}
					//BigInteger biSec=BigInteger.valueOf(secondElement);
					int tempListSize=tempList.size();
					boolean isCoPrime=true;



					for(int i=0;i<tempListSize;i++){
						int tempNum=tempList.get(i);
						//BigInteger biNum=BigInteger.valueOf(tempNum);
						if(gcd(tempNum,secondElement)!=1){
							isCoPrime=false;
						}	    				
					}
					if(isCoPrime){
						tempList.add(secondElement);
						doneSet.add(secondElement);
					}
				}

				list.add(tempList);
				//tempSet=set;


			}



		}

		int listSize=list.size()+1;
		System.out.println(listSize);

		for(int prime:primeList){
			System.out.print(prime+" ");
		}
		System.out.println();
		for(ArrayList<Integer> lists: list){
			for(int number: lists){
				System.out.print(number+" ");
			}

			System.out.println();
		}


	}
	static int gcd(int a,int b){
		if(a==0)
			return b;
		
		return gcd(b%a,a);		
		
	}
	
	static HashSet<Integer> getPrimes(int n,ArrayList<Integer> primeList) 
	    { 
	        // Create a boolean array "prime[0..n]" and initialize 
	        // all entries it as true. A value in prime[i] will 
	        // finally be false if i is Not a prime, else true. 
		 
		   //ArrayList<Integer> primeList=new ArrayList<>();
		 HashSet<Integer> set=new HashSet<>();
	        boolean prime[] = new boolean[n+1]; 
	        for(int i=0;i<=n;i++) 
	            prime[i] = true; 
	          
	        for(int p = 2; p*p <=n; p++) 
	        { 
	            // If prime[p] is not changed, then it is a prime 
	            if(prime[p] == true) 
	            { 
	                // Update all multiples of p 
	                for(int i = p*p; i <= n; i += p) 
	                    prime[i] = false; 
	            } 
	        } 
	          
	        // Print all prime numbers 
	        for(int i = 2; i <= n; i++) 
	        { 
	            if(prime[i] == true) 
                primeList.add(i);
	            else
	            set.add(i);	
	         } 
	        
	        return set;
	    } 

}
