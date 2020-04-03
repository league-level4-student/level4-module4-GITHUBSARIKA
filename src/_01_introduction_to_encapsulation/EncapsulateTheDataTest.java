package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncapsulateTheDataTest {
	EncapsulateTheData data=new EncapsulateTheData();
	
	@Test
	void testItemsReceived() {
		data.setItemsReceived(-93);
		assertEquals(0, data.getItemsReceived());
	}
	
	@Test
	void testDegreesTurned() {
		data.setDegreesTurned(10);
		assertEquals(0, data.getDegreesTurned());
	}
	@Test
	void testNomenclature() {
		data.setNomenclature("");
		assertEquals(" ", data.getNomenclature());
	}
	@Test
	void testMemberObj() {
		data.setMemberObj("stringgg");
		
	}
	

}
