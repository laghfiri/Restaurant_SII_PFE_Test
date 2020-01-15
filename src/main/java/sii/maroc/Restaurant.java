package sii.maroc;

public class Restaurant {

	private String mozzarella;
	private String tomatos;
	private String olive_oil;
	private String salt;
	private String pepper;
	private String flour_amount;
	private String water;

	public Restaurant() {
	}

	public Restaurant(String mozzarella, String tomatos, String olive_oil, String salt) {
		super();
		this.mozzarella = mozzarella;
		this.tomatos = tomatos;
		this.olive_oil = olive_oil;
		this.salt = salt;
	}

	public Restaurant(String flour_amount, String tomatos, String salt, String mozzarella, String olive_oil,
			String water) {
		super();
		this.mozzarella = mozzarella;
		this.tomatos = tomatos;
		this.olive_oil = olive_oil;
		this.salt = salt;
		this.flour_amount = flour_amount;
		this.water = water;
	}

	public String getMozzarella() {
		return mozzarella;
	}

	public void setMozzarella(String mozzarella) {
		this.mozzarella = mozzarella;
	}

	public String getTomatos() {
		return tomatos;
	}

	public void setTomatos(String tomatos) {
		this.tomatos = tomatos;
	}

	public String getOlive_oil() {
		return olive_oil;
	}

	public void setOlive_oil(String olive_oil) {
		this.olive_oil = olive_oil;
	}

	public String getsalt() {
		return salt;
	}

	public void setsalt(String salt) {
		this.salt = salt;
	}

	public String getFlour_amount() {
		return flour_amount;
	}

	public void setFlour_amount(String flour_amount) {
		this.flour_amount = flour_amount;
	}

	public String getWater() {
		return water;
	}

	public void setWater(String water) {
		this.water = water;
	}

	public Ticket order(String string) {
		// This table contains customers orders

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

	public Meal retrieve(Ticket ticket) {

		Meal meal = new Meal();

		int timeOfCooking = 0;
		int preparationTomatoMozarella = 6;
		int timeOfCookingPizza = 10;

		if (ticket.getDish_name().equals("Pizza")) {
			timeOfCooking = timeOfCookingPizza * ticket.getDish_number();
		}

		if (ticket.getDish_name().equals("Tomato Mozzarella Salad")) {
			timeOfCooking = preparationTomatoMozarella * ticket.getDish_number();
		}

		meal.setCookingDuration(timeOfCooking);
		meal.setServedDishes(ticket.getDish_number());
		return meal;
	}

}
