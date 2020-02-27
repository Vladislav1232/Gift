package vlad.gift.hw;

import java.util.Arrays;

public class Gift {
	
	private int weight;
	private Sweet[] sweets;
	
	public Gift(Sweet[] sweets) {
		this.sweets = sweets;
		calculateWeight();
	}
	
	public void sortBySugar() {
		Arrays.sort(sweets);
	}
	
	public void findSweetBySugar(int from, int to) {
		for (Sweet sweet: sweets) {
			if (sweet.getAmoutOfSugar() >= from && sweet.getAmoutOfSugar() <= to) {
				System.out.println("������� �������. ��������: " + sweet.getName() + ". ���������� ������: " + sweet.amountOfSugar);
				return;
			}
		}
		System.out.println("������� �� �������.");
	}
	
	private void calculateWeight() {
		for (Sweet sweet: sweets) {
			weight =+ sweet.getWeight();
		}
	}

	public int getWeight() {
		return weight;
	}
}
