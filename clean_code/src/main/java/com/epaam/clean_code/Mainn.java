package com.epaam.clean_code;


	public class Mainn {
		public static void main(String[] args)
		{
			construction c=new construction();
			double cost_required=c.constructionCost(1500, 1000, "No");
			System.out.println("cost required for construction of house is "+cost_required);
		}

}
