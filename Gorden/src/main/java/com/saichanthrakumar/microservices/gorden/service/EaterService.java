package com.saichanthrakumar.microservices.gorden.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saichanthrakumar.microservices.gorden.algorithm.EaterUtility;
import com.saichanthrakumar.microservices.gorden.exception.InvalidInputSourceException;

/**
 * @author SAI CHANTHRA KUMAR
 * Exception Customized for GordenException
 */
@Service
public class EaterService  {

	@Autowired
	EaterUtility eateryUtility;
	public Integer perform(File file) {
		try (InputStream stream = new FileInputStream(file)) {
			return eateryUtility.perform(stream);
		} catch (IOException e) {
			throw new InvalidInputSourceException(e);
		}
	}
}
