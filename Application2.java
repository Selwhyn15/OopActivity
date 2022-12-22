public class Appliances2
{
	public class MainProgram {
		public static void main(String[] args){
			Appliances appliances;
			Tv tv = new Tv("baby", 44500, "98inches");
			Fan fan = new Electricfan("wind", 7000, "50kg");

			appliances = Tv;
			System.out.println(Appliances.brand()  +  " "  + "My brand is"  + Appliances.getName());

			appliances = Fan;
			System.out.println(Appliances.brand()  +  " "  + "My brand is"  + Appliances.getName());
		}
	}
}
