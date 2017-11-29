package Strings;

public class DIffprblm {

	public static void main(String[] args) {
      
		for(int i=0;i<=100;i++)
		{
			
			if((i%(3*5))==0)
			{
				System.out.println("samram");
			}
			else
			if((i%3)==0){
				System.out.println("sam");
			}
				else
					if((i%5==0)){
					System.out.println("ram");
					}
						
						
						else
							System.out.println(i);
		}
	}

}
