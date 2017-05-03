package PlatformData;

/*
    This class groups all DataStore classes under 1 abstract superclass to be utilized as a polymorphic
    data structure for each specific GasPump component
*/
public abstract class Data {
	public abstract String getGasType();
	public abstract void setGasType(String gasType);
}
