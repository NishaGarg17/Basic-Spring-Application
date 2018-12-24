package com.luv2code.springapp;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	private String[] str = {"Today is your Lucky Day!","Tomorrow will be your Lucky Day!","Yesterday was your lucky day!"};
	Random random = new Random();

	@Override
	public String getFortune() {
		int index = random.nextInt(str.length); 
		return str[index];
	}

}
