import java.util.*;

public class Main
{
	public abstract class Account {
		protected String name;
		protected double price;

		public Account(String name, double price) {
			this.name=name;
			this.price=price;
		}

		public abstract String brand();

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}

		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price=price;
		}
	}
}
