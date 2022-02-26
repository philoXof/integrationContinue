package org.example;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    /**
     * 5 = 0.25
     * 4 = 0.2
     * 3 = 0.1
     * 2 = 0.05
     * 1 = 0.0
     * 0 = 0.0
     */

    @Test
    public void noBooksShouldCostZero(){
        int[] books = {};
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.setShoppingBasket(books);
        assertEquals(shoppingBasket.price(), 0.0);
    }


    //when only identical books
    @Test
    public void oneBookShouldCost8(){
        int[] books = {1};
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.setShoppingBasket(books);
        assertEquals(shoppingBasket.price(), 8.0);
    }

    @Test
    public void oneBookShouldCost8_2(){
        int[] books = {2};
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.setShoppingBasket(books);
        assertEquals(shoppingBasket.price(), 8.0);
    }

    @Test
    public void oneBookShouldCost8_3(){
        int[] books = {3};
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.setShoppingBasket(books);
        assertEquals(shoppingBasket.price(), 8.0);
    }

    @Test
    public void oneBookShouldCost8_4(){
        int[] books = {4};
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.setShoppingBasket(books);
        assertEquals(shoppingBasket.price(), 8.0);
    }

    @Test
    public void oneBookShouldCost8_5(){
        int[] books = {5};
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.setShoppingBasket(books);
        assertEquals(shoppingBasket.price(), 8.0);
    }


    @Test
    public void twoBooksShouldCost16(){
        int[] books = {1, 1};
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.setShoppingBasket(books);
        assertEquals(shoppingBasket.price(), 16.0);
    }

    @Test
    public void oneCollectionWithNoMoreBooks(){
        int[] books = {1, 2};
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.setShoppingBasket(books);
        assertEquals(shoppingBasket.price(), 15.2);
    }

    @Test
    public void oneCollectionWithNoMoreBooks2(){
        int[] books = {1, 2, 3};
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.setShoppingBasket(books);
        assertEquals(shoppingBasket.price(), 21.6);
    }

    @Test
    public void oneCollectionWithNoMoreBooks3(){
        int[] books = {1, 2, 3, 4};
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.setShoppingBasket(books);
        assertEquals(shoppingBasket.price(), 25.6);
    }

    @Test
    public void oneCollectionWithNoMoreBooks4(){
        int[] books = {1, 2, 3, 4, 5};
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.setShoppingBasket(books);
        assertEquals(shoppingBasket.price(), 30.0);
    }

    @Test
    public void whenBuyingMultipleCollections(){
        //buying a 3-books collection + a 2-books collection should cost 36.8e
        int[] books = {1, 2, 3, 1, 2};
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.setShoppingBasket(books);
        assertEquals(shoppingBasket.price(), 21.6 + 15.2);
    }

    @Test
    public void whenBuyingMultipleCollections2(){
        //buying one collection of each (2, 3, 4, 5) + one identical
        int[] books = {
                1, 2, 3, 4, 5,
                1, 2, 3, 4,
                1, 2, 3,
                1, 2,
                1
        };
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.setShoppingBasket(books);
        assertEquals(shoppingBasket.price(), 30 + 25.6 + 21.6 + 15.2 + 8);
    }

    @Test
    public void whenBuyingMultipleCollections3(){
        //prefers 2 4-books collections over a 5-books one + a 3-books one
        int[] books = {
                1, 2, 3, 4,
                2, 3, 4, 5
        };
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.setShoppingBasket(books);
        //assertEquals(potter.price(books3), 25.6 * 2); //avec opti
        assertEquals(shoppingBasket.price(), 30 + 21.6);

    }

    @Test
    public void whenBuyingMultipleCollections4(){
        //prefers 2 4-books collections over a 5-books one + a 3-books one
        int[] books = {
                1, 2, 3, 4,
                1, 2, 3, 4, 5
        };
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.setShoppingBasket(books);
        //assertEquals(potter.price(books3), 25.6 * 2); //avec opti
        assertEquals(shoppingBasket.price(), 25.6 + 30);

    }
}
