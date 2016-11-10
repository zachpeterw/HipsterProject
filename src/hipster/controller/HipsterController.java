package hipster.controller;

import hipster.model.hipster;
//import hipster.view.hipsterFrame;


public class HipsterController
{
	private int [] numbers;
	private String [] words = {"This ","is the","Seco hipster","level: ","initialization","lists"};;
	private hipster [] hipsters;

		public HipsterController()
		{
		numbers = new int [20];
		
		hipsters = new hipster[6];
		
		}
		public void start()
		{
			for(int index = 0; index < hipsters.length; index++)
			{
				hipsters[index] = new hipster("Hipster # " + index);
			}
			
			for(hipster currentHipster : hipsters)
			{
				System.out.println(currentHipster + ", ");
			}
			System.out.println("next");
			for(String currentWord : words)
			{
				System.out.print(currentWord + ", ");
			}
			System.out.println("Next");
			for(int tempInt : numbers)
			{
				System.out.print(tempInt + ", ");
			}
		}
}
