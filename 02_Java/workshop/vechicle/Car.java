package vechicle;

public class Car extends Vehicle {

	private double restOil;
	private int curWeight;
	
	public Car() {}
	public Car(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}
	
	//
	public void addOil(int oil) {
		//, 오일탱크크기를 넘어서면 안된다.
		if((restOil+oil) <=  getOilTankSize()) {
			restOil += oil;			
		}
	}
	public void moving(int distance ) {
		// distance / 연비
		restOil -= (distance/getEfficiency());
	}
	public void addWeight(int weight ) {
		// 최대적재중량을 넘어서면 안된다
		if((curWeight + weight) <= getMaxWeight()) {
		   curWeight += weight;
		}
	}
	public double getRestOil() {
		return restOil;
	}
	public void setRestOil(double restOil) {
		this.restOil = restOil;
	}
	public int getCurWeight() {
		return curWeight;
	}
	public void setCurWeight(int curWeight) {
		this.curWeight = curWeight;
	}
	@Override
	public String toString() {
		return super.toString()+"\t"+restOil+"\t"+curWeight;
	}

	
}
