package hw8;

import java.util.Objects;

public class Train implements Comparable<Train> {

	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	public Train() {
	}

	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public void setTrain(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public int getTrainNumber() {
		return number;
	}

	public String getTrainType() {
		return type;
	}

	public String getTrainStart() {
		return start;
	}

	public String getTrainDest() {
		return dest;
	}

	public double getTrainPrice() {
		return price;
	}

	public void display() {
		System.out.println(number + ", " + type + ", " + start + ", " + dest + ", " + price);
	}

	public int compareTo(Train aTrain) {

		if (this.number < aTrain.number) {
			return 1;
		} else if (this.number == aTrain.number) {
			return 0;
		} else {
			return -1;
		}

	}

	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}

}
