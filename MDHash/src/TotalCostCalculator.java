
public class TotalCostCalculator {

	public static void main(String[] args) {

		Carpet carpet = new Carpet(20.0);
		Floor floor = new Floor(10.0, 12.0);

		PriceCalculator pc = new PriceCalculator(floor, carpet);

		System.out.println(pc.getTotalCost());
	}

}
