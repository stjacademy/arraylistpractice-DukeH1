import java.util.ArrayList;

public class Arrayminilab {

	public static void main(String[] args) {
		ArrayList<Integer> roy = getListOfFactors(36);
		getListOfFactors(36);
		keepOnlyCompositeNumbers(roy);
		System.out.println(getListOfFactors(36));
		System.out.println(keepOnlyCompositeNumbers(roy));
		
		
		
		
		
	}
		public static ArrayList<Integer> getListOfFactors(int number)
		  {                                                                        	
			ArrayList<Integer> roy = new ArrayList<Integer>();
			for(int i = 2; i<number; i ++)
			{
				if (number%i == 0)
					roy.add(i);
				
				
			}
			return roy; 
			
			
			}
			
		
		  
		 
		  public static void keepOnlyCompositeNumbers( ArrayList<Integer> nums )
		  {
			  for(int i = 2; i<nums.size(); i ++) {
				  if(getListOfFactors(nums.get(i)).size()==0) {
					  nums.remove(i);
					  i--;
				  }
					  
			  }
		  }

		
	}


