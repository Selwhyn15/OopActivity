public class Appliances
{
	public class Tv extends Appliances{
		private String inches;

		public Tv(String name, double price, String inches) {
			super(name,price);
			this.inches=inches;
		}

		@Override
		public String brand() {
			return "Panasonic";
		}

		public String inches() {
			return inches;
		}
		public void setInches(String inches) {
			this.inches=inches;
		}
	}
}
