import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {

	GradeBook gradeBook1; 
	GradeBook gradeBook2;
	@BeforeEach
	void setUp() throws Exception {
		//task #3
		gradeBook1=new GradeBook(2);
		gradeBook2=new GradeBook(2);
		gradeBook1.addScore(91);
		gradeBook1.addScore(62);
		gradeBook2.addScore(87);
		gradeBook2.addScore(55);
	}

	@AfterEach
	void tearDown() throws Exception {
		//task #3: set the two GradeBook objects to null
		gradeBook1=null;
		gradeBook2=null;
	
	}

	@Test
	void testAddScore() {
		//test if the toString() method prints correctly the contents of the scores array
		assertTrue(gradeBook1.toString().equals("91.062.0"));
		assertTrue(gradeBook2.toString().equals("87.055.0"));
		
		//test the sizes of the scores arrays
		assertEquals(2, gradeBook1.getScoreSize());
		assertEquals(2, gradeBook2.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(153, gradeBook1.sum(), .0001);
		assertEquals(142, gradeBook2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(62, gradeBook1.minimum(), .001);
		assertEquals(55, gradeBook2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(91, gradeBook1.finalScore(), .001);
		assertEquals(87, gradeBook2.finalScore(), .001);
	}

	@Test
	void testGetScoreSize() {
		//test the sizes of the scores arrays
		assertEquals(2, gradeBook1.getScoreSize());
		assertEquals(2, gradeBook2.getScoreSize());
	}

	@Test
	void testToString() {
		//test if the toString() method prints correctly the contents of the scores array
		assertTrue(gradeBook1.toString().equals("91.062.0"));
		assertTrue(gradeBook2.toString().equals("87.055.0"));
		
	}

}
