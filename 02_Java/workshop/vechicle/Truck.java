package vechicle;

public class Truck extends Car {

	public Truck() {
	}

	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}

	//
//	현재 적재 중량 5Kg 당 연비
//	0.2Km 감소시킨 값을 리턴한다
	@Override
	public double getEfficiency() {
		return super.getEfficiency()-(getCurWeight()/5)*0.2;
	}
			
	@Override
	public void moving(int distance) {
		double oil = calcOil(distance);
		double oil2 = getRestOil()-oil;
		setRestOil(oil2);
	}
	private double calcOil(int distance) {
		return distance/getEfficiency();
	}
	public int getCost(int distance) {
		double oil = calcOil(distance);
		int cost = (int)(oil*3000);
		return cost;
	}

	@Override
	public String toString() {
		return super.toString()+"\t"+getEfficiency();
	}

}





