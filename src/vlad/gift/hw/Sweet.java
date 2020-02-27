package vlad.gift.hw;

public  abstract class  Sweet implements Comparable<Sweet> {
	protected String name; 
	protected int amountOfSugar;
	protected int weight;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmoutOfSugar() {
		return amountOfSugar;
	}
	public void setAmoutOfSugar(int amoutOfSugar) {
		this.amountOfSugar = amoutOfSugar;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public int compareTo(Sweet o) {
		if (this.amountOfSugar == o.getAmoutOfSugar()) {
			return 0;
		} else if(this.amountOfSugar < o.getAmoutOfSugar()) {
			return -1;
		} else {
			return 1;
		}
	}		
}
