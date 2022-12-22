public class Appliances1
{
	public class Fan extends Appliances{
		private String weight;

		public Fan(String name, double price, String weight) {
			super(name,price);
			this.weight=weight;
		}

		@Override
		public String brand() {
			return "Hanabishi";
		}

		public String weight() {
			return weight;
		}
		public void setWeight(String weight) {
			this.weight=weight;
		}
	}
}
