package sii.maroc;

public class Ticket {

	private String dish_name;
	private int dish_number;

	public Ticket() {
	}

	public Ticket(String dish_name, int number) {
		this.dish_name = dish_name;
		this.dish_number = number;
	}

	public String getDish_name() {
		return dish_name;
	}

	public void setDish_name(String dish_name) {
		this.dish_name = dish_name;
	}

	public int getDish_number() {
		return dish_number;
	}

	public void setDish_number(int dish_number) {
		this.dish_number = dish_number;
	}

	public Ticket and(String string) {
		String[] array_order = string.split(" ");

		if (string.contains("Pizza")) {
			int dish_number = Integer.parseInt(array_order[0]);
			String dish_name = "Pizza";
			Ticket ticket = new Ticket(dish_name, dish_number);
			return ticket;

		} else if (string.contains("Tomato Mozzarella Salad")) {
			int dish_number = Integer.parseInt(array_order[0]);
			String dish_name = "Tomato Mozzarella Salad";
			Ticket ticket = new Ticket(dish_name, dish_number);
			return ticket;

		}
		return null;
	}

}
