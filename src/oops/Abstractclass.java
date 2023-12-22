package oops;

abstract class Car {
	abstract public void enginespeed();
	abstract public void stereo();
	public void speedlimit()
	{
		System.out.println("car speed limit");
		
	}
}
	class Bmw extends Car
	{

		@Override
		public void stereo() {
			System.out.println("bmw stereo");
			
		}
		
		
		@Override
		public void enginespeed() {
		System.out.println("bmw engine speed");
		}


			
			
		}

	
		class kia extends Car
		
		{

			@Override
			public void enginespeed() {
				System.out.println("kia engine speed");
				
			}

			@Override
			public void stereo() {
				System.out.println("kia stereo");
				
			}
		
}
		public class Abstractclass{

	public static void main(String[] args) 
	{
		

		Bmw ob=new Bmw();
		ob.enginespeed();
		ob.stereo();
		kia m=new kia();
		m.enginespeed();
		m.stereo();
		
	}
		}



