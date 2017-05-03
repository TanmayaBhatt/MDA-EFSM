package PlatformData;

/*
    GasPump1 data storage object responsible for storing key platform-specific data that must be shared between
    system components

    NOTE: For the sake of shorter code and simplicity, fields are accessed directly, instead of through getters and setters
 */
public class DataGasPump1 extends Data {
    public String   gasType;
    public float    R_price;
    public float    S_price;
    public float    price;
    public int      G;
    public float    total;

    // temporary variables
    public float a;
    public float b;
	
    public String getGasType() {
		return gasType;
	}
	public void setGasType(String gasType) {
		this.gasType = gasType;
	}
	public float getR_price() {
		return R_price;
	}
	public void setR_price(float r_price) {
		R_price = r_price;
	}
	public float getS_price() {
		return S_price;
	}
	public void setS_price(float s_price) {
		S_price = s_price;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getG() {
		return G;
	}
	public void setG(int g) {
		G = g;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public float getA() {
		return a;
	}
	public void setA(float a) {
		this.a = a;
	}
	public float getB() {
		return b;
	}
	public void setB(float b) {
		this.b = b;
	}
 

}
