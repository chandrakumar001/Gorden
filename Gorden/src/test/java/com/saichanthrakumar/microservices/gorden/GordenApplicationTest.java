package com.saichanthrakumar.microservices.gorden;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.File;

import org.junit.BeforeClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.saichanthrakumar.microservices.gorden.service.EaterService;

import junit.framework.TestCase;



/**
 * @author SAI CHANTHRA KUMAR
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GordenApplicationTest {
	@Autowired
	EaterService eaterService;
	static String abosultePath=null;
	
	@BeforeClass
	public static void init() {
		abosultePath =GordenApplication.class.getClassLoader().getResource("data.txt").getFile();
	}
	@Test
	public void testReadFile() {
		TestCase.assertEquals(new Integer(2493893), eaterService.perform(new File(abosultePath)));
	}

}
