package Model.OutputProcessor;

import AbstractFactory.AbstractFactory;
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

/*
    This class is the general output processor for the gas pump system.
    It must be initialized with the proper action implementations for the specific
    gas pump that is desired. This is done thorough the Abstract Factory design pattern.

    Each meta-action in this class calls the platform specific implementation of the action

    This class acts as the "Client" class in the strategy design pattern
 */
public class OutputProcessor {
    private CancelMsg cancelMsg;
    private DisplayMenu displayMenu;
    private GasPumpedMsg gasPumpedMsg;
    private PayMsg payMsg;
    private PrintReceipt printReceipt;
    private PumpGasUnit pumpGasUnit;
    private ReadyMsg readyMsg;
    private RejectMsg rejectMsg;
    private ReturnCash returnCash;
    private SetInitialValues setInitialValues;
    private SetPrice setPrice;
    private StopMsg stopMsg;
    private StoreCash storeCash;
    private StoreData storeData;

    public OutputProcessor(AbstractFactory af) {
        this.cancelMsg = af.getCancelMsg();
        this.displayMenu = af.getDisplayMenu();
        this.gasPumpedMsg = af.getGasPumpedMsg();
        this.payMsg = af.getPayMsg();
        this.printReceipt = af.getPrintReceipt();
        this.pumpGasUnit = af.getPumpGasUnit();
        this.readyMsg = af.getReadyMsg();
        this.rejectMsg = af.getRejectMsg();
        this.returnCash = af.getReturnCash();
        this.setInitialValues = af.getSetInitialValues();
        this.setPrice = af.getSetPrice();
        this.stopMsg = af.getStopMsg();
        this.storeCash = af.getStoreCash();
        this.storeData = af.getStoreData();
    }

    /*
     *  Meta-actions (implemented using Strategy pattern)
     */

    public void CancelMsg() {
        this.cancelMsg.cancelMsg();
    }

    public void DisplayMenu() {
        this.displayMenu.displayMenu();
    }

    public void GasPumpedMsg() {
        this.gasPumpedMsg.gasPumpedMsg();
    }

    public void PayMsg() {
        this.payMsg.payMsg();
    }

    public void PrintReceipt() {
        this.printReceipt.printReceipt();
    }

    public void PumpGasUnit() {
        this.pumpGasUnit.pumpGasUnit();
    }

    public void ReadyMsg() {
        this.readyMsg.readyMsg();
    }

    public void RejectMsg() {
        this.rejectMsg.rejectMsg();
    }

    public void ReturnCash() {
        this.returnCash.returnCash();
    }

    public void SetInitialValues() {
        this.setInitialValues.setInitialValues();
    }

    public void SetPrice(int g) {
        this.setPrice.setPrice(g);
    }

    public void StopMsg() {
        this.stopMsg.stopMsg();
    }

    public void StoreCash() {
        this.storeCash.storeCash();
    }

    public void StoreData() {
        this.storeData.storeData();
    }

}
