package vlad.gift.hw;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sweet[] sweets = new Sweet[5];
		sweets[0] = new Candy("Mars");
		sweets[1] = new ChocolateBar("Milka");
		sweets[2] = new Lollipop("Chupa-chups");
		sweets[3] = new Candy("Lion");
		sweets[4] = new Lollipop("Chups");
		Gift gift = new Gift(sweets);
		System.out.println("Вес подарка: " + gift.getWeight());
		gift.sortBySugar();
		gift.findSweetBySugar(0, 100);
	}

}
