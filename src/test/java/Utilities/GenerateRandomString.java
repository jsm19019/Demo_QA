package Utilities;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomString {

	public String random_string()
	{
		String random = RandomStringUtils.randomAlphanumeric(10, 15);
		return random;
	}
	
}
