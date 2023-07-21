package exerRandom;
public class RetornoNums {
	public static void main(String args[]) {
		  int  to[] = new int [10];
		  int total=0, par=0, impar=0, maior=0, menor=0;
		  
			for (int i=0 ; i<=to.length-1 ; i++){
		    	to [i]= (int) (Math.random()*50);
		    	total= total + to[i];
		    	System.out.print(to[i]+ " ");
               
		    	if(to[i]%2==0){
		    		par++;
		    	}else {
		    		impar++;
		    	}
		    	 
			} 
			
			for(int w=0 ; w<=to.length-1; w++) {
				if(to[w]>maior) {
					maior=to[w];
					if(w==0) {
						menor=to[w];
					}
				}else if(to[w]<menor){
					menor=to[w];
				}
			}
		    
			
			System.out.println("\nMaior número :"+maior); 
		    System.out.println("Menor número :"+menor);	
		    System.out.println("Total de números pares: "+par);
		    System.out.println("Total de números ímpares: "+impar);
		    System.out.println("A soma dos números é:"+total);
		    	
		
			
	
	}

}
