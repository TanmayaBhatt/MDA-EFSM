package PlatformData;

/*
    GasPump2 data storage object responsible for storing key platform-specific data that must be shared between
    system components

    NOTE: For the sake of shorter code and simplicity, fields are accessed directly, instead of through getters and setters
 */
public class DataGasPump2 extends Data {
    public String   gasType;
    public int      R_price;
    public int      S_price;
    public int      P_price;
    public float    cash;
    public int      price;
    public int      L;
    public int      total;

    // temporary variables
    public int a;
    public int b;
    public int c;
    public float temp_cash;
	
    public String getGasType() {
		return gasType;
	}
	public void setGasType(String gasType) {
		this.gasType = gasType;
	}
	public int getR_price() {
		return R_price;
	}
	public void setR_price(int r_price) {
		R_price = r_price;
	}
	public int getS_price() {
		return S_price;
	}
	public void setS_price(int s_price) {
		S_price = s_price;
	}
	public int getP_price() {
		return P_price;
	}
	public void setP_price(int p_price) {
		P_price = p_price;
	}
	public float getCash() {
		return cash;
	}
	public void setCash(float cash) {
		this.cash = cash;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getL() {
		return L;
	}
	public void setL(int l) {
		L = l;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public float getTemp_cash() {
		return temp_cash;
	}
	public void setTemp_cash(float temp_cash) {
		this.temp_cash = temp_cash;
	}
    
}
