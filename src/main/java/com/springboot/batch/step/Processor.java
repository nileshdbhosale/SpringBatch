package com.springboot.batch.step;

import org.springframework.batch.item.ItemProcessor;

public class Processor implements ItemProcessor<String, String> {

	@Override
	public String process(String Data) throws Exception {
		return Data.toUpperCase();
		
	}
}
