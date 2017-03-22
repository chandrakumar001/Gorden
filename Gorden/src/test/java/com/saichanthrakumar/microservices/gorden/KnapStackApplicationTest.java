package com.saichanthrakumar.microservices.gorden;

 import org.junit.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.saichanthrakumar.microservices.gorden.algorithm.EaterUtility;
import junit.framework.TestCase;

/**
 * @author SAI CHANTHRA KUMAR
 *
 */
public class KnapStackApplicationTest {
	@Test
	public void testReadFile() throws IOException {
		try (InputStream stream = new FileInputStream(getClass().getClassLoader().getResource("data.txt").getFile())) {
			TestCase.assertEquals(new Integer(2493893), new EaterUtility().perform(stream));
		}
	}
}
