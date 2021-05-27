package activities;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;



public class Activity1 {
	
	//Test Fixtures
	static ArrayList<String>list;

	@BeforeEach
	 void setUp() throws Exception{
		list = new ArrayList<String>();
		list.add("Alpha");
		list.add("Beta");
		list.add("Delta");
	}
	
	@Test
	public void insertTest() {
		try {
		assertEquals(2, list.size(), "Wrong Size");
		list.add("Charlie");
		assertEquals(3, list.size(), "Wrong Size");
		
		// Assert individual elements
        /*assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("beta", list.get(1), "Wrong element");
        assertEquals("charlie", list.get(2), "Wrong element");*/
		}catch(Exception e) {
			e.getMessage();
		}
	}
	
	// Test method to test the replace operation
    @Test
    public void replaceTest() {
        // Replace new element
   try {
        list.set(1, "charlie");
         // Assert size of list
        assertEquals(2, list.size(), "Wrong size");
        // Assert individual elements
       /* assert("alpha", list.get(0), "Wrong element");
        assertEquals("charlie", list.get(1), "Wrong element");*/
   }
   catch(Exception e) {
	   System.out.println(e.getMessage());
   }
    }
}
