package hipster.controller;

import hipster.model.hipster;
import hipster.view.HipsterFrame;


public class HipsterController
{
	private int [] numbers;
	private String [] words = {"This ","is the","Second hipster","level: ","initialization","lists"};;
	private hipster [] hipsters;

		public HipsterController()
		{
			thirdLevelHipster();
			numbers = new int [20];
		
			hipsters = new hipster[6];
			appFrame = new hipsterFramethis);
		
		}
		private void thirdLevelHipster()
		{
			numbers = new int [] {0,1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1,0};
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
			public String [] getWords()
			{
				return Words;
			}
			public int [] getNumbers()
			{
				return Numbers;
			}
			public Hipster []getHipsters()
			{
				return Hipsters;
			}
		}
}
