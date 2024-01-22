package Aufgabe_05;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class VendingMachineImplTestMockito{

    private VendingMachineImpl vendingMachine;
    private CashBox cashBox;
    private Box[] boxes;

    @Before
    public void setUp() {
        cashBox = new CashBoxClass(); // Assuming CashBoxClass is a concrete implementation of CashBox
        boxes = new Box[1];

        // Mocking the Box class
        Box mockBox = Mockito.mock(Box.class);
        Mockito.when(mockBox.isEmpty()).thenReturn(false);
        Mockito.when(mockBox.getPrice()).thenReturn(100);

        boxes[0] = mockBox; // Using the mocked Box
        vendingMachine = new VendingMachineImpl(cashBox, boxes);
    }

    @Test
    public void testSelectItemPositive() {
        cashBox.withdraw(200); // Assuming a deposit method to add money
        boolean result = false;
        try {
            result = vendingMachine.selectItem(0);
        } catch (NotEnoughMoneyException | BoxEmptyException e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertTrue("Item selection should be successful", result);
    }
}
