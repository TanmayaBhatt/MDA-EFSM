package AbstractFactory;

import ActionStrategy.CancelMsg;
import ActionStrategy.DisplayMenu;
import ActionStrategy.GasPumpedMsg;
import ActionStrategy.PayMsg;
import ActionStrategy.PrintReceipt;
import ActionStrategy.PumpGasUnit;
import ActionStrategy.ReadyMsg;
import ActionStrategy.RejectMsg;
import ActionStrategy.ReturnCash;
import ActionStrategy.SetInitialValues;
import ActionStrategy.SetPrice;
import ActionStrategy.StopMsg;
import ActionStrategy.StoreCash;
import ActionStrategy.StoreData;
import PlatformData.Data;

/*
    This class groups all ConcreteFactory classes under 1 abstract superclass
    It defines the methods that return the GasPump specific action components which
    all ConcreteFactories need to implement

 */
public abstract class AbstractFactory {

    public abstract Data getDataObj();

    public abstract CancelMsg getCancelMsg();

    public abstract DisplayMenu getDisplayMenu();

    public abstract GasPumpedMsg getGasPumpedMsg();

    public abstract PayMsg getPayMsg();

    public abstract PrintReceipt getPrintReceipt();

    public abstract PumpGasUnit getPumpGasUnit();

    public abstract ReadyMsg getReadyMsg();

    public abstract RejectMsg getRejectMsg();

    public abstract ReturnCash getReturnCash();

    public abstract SetInitialValues getSetInitialValues();

    public abstract SetPrice getSetPrice();

    public abstract StopMsg getStopMsg();

    public abstract StoreCash getStoreCash();

    public abstract StoreData getStoreData();

}