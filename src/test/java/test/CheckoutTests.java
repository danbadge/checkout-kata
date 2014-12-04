package test;

import checkoutkata.Checkout;
import org.junit.Test;
import org.junit.Before;

public class CheckoutTests {
    private Checkout checkout;

    @Before
    public void Before(){
        checkout = new Checkout();
    }

    @Test
    public void itReturnsZeroWhenNothingIsCheckedOut(){
        assert checkout.price("") == 0;
    }

    @Test
    public void itReturnsTheCorrectPriceForIndividualItems(){
        assert checkout.price("A") == 50;
        assert checkout.price("B") == 30;
        assert checkout.price("C") == 20;
        assert checkout.price("D") == 15;
    }

    @Test
    public void itCalculatesTheTotalForMultipleItems(){
        assert checkout.price("AB") == 80;
        assert checkout.price("CDBA") == 115;
        assert checkout.price("ABC") == 100;
        assert checkout.price("BCD") == 65;
    }
}
