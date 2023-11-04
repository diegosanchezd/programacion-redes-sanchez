package DTO;

import java.util.Objects;

public class stockDTO implements generalDTO {
	
	private int id;
	private String name;
	private String description;
	private double price_buy;
	private double price_sell;
	private int cant;
	private boolean isDiscontinuous;
	public int getId() {
		return id;
	}
	
	
	public stockDTO(int id, String name, String description, double price_buy, double price_sell, int cant, boolean isDiscontinuous) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price_buy = price_buy;
		this.price_sell = price_sell;
		this.cant = cant;
		this.isDiscontinuous = isDiscontinuous;
	}
	public stockDTO(String name, String description, double price_buy, double price_sell, int cant, boolean isDiscontinuous) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price_buy = price_buy;
		this.price_sell = price_sell;
		this.cant = cant;
		this.isDiscontinuous = isDiscontinuous;
	}
	
	public stockDTO() {}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice_buy() {
		return price_buy;
	}
	public void setPrice_buy(double price_buy) {
		this.price_buy = price_buy;
	}
	public double getPrice_sell() {
		return price_sell;
	}
	public void setPrice_sell(double price_sell) {
		this.price_sell = price_sell;
	}
	public int getCant() {
		return cant;
	}
	public void setCant(int cant) {
		this.cant = cant;
	}
	public boolean getIsDiscontinuous() {
		return isDiscontinuous;
	}
	public void setIsDiscontinuous(boolean isDiscontinuous) {
		this.isDiscontinuous = isDiscontinuous;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cant, description, isDiscontinuous, id, name, price_buy, price_sell);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		stockDTO other = (stockDTO) obj;
		return cant == other.cant && Objects.equals(description, other.description)
				&& isDiscontinuous == other.isDiscontinuous && id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price_buy) == Double.doubleToLongBits(other.price_buy)
				&& Double.doubleToLongBits(price_sell) == Double.doubleToLongBits(other.price_sell);
	}
	
	@Override
	public String toString() {
		String str = "\n";
		str += "\nCodigo de producto: "+this.id;
		str += "\nname: "+this.name;
		str += "\ndescription: "+this.description;
		str += "\nPrecio de compra: "+this.price_buy;
		str += "\nPrecio de venta: "+this.price_sell;
		str += "\nStock cant: "+this.cant;
		str += "\nEstado: ";
		if(this.isDiscontinuous){
			str += "Descontinuado";
		}else {
			str += "En venta";
		}
		
		return str;
	

	}
}