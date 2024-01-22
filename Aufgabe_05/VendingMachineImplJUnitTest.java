//package Aufgabe_05;
//
//import org.junit.Assert;
//import org.junit.Test;
//import static org.mockito.Mockito.*;
//
//public class VendingMachineImplTest {
//
//    @Test
//    public void test() {
//        // Setup
//        CashBox cashBox = new CashBoxImpl(amount: 10);
//        Box box1 = new Box(name: "apple", quantity: 6, price: 2);
//        Box box2 = new Box(name: "orange", quantity: 12, price: 3);
//        Box[] boxes = new Box[]{box1, box2};
//        VendingMachineImpl vendingMachine = new VendingMachineImpl(cashBox, boxes);
//        // Exercise
//        vendingMachine.selectItem(boxIndex: 1);
//        // Verify: one apple has been taken out of the box and 2 dollars are missing from the cashbox
//        Assert.assertEquals(expected: 11, box2.getQuantity());
//        Assert.assertEquals(expected: 7, cashBox.getCurrentAmount());
//        // Teardown: done by garbage Collector
//    }
//}
