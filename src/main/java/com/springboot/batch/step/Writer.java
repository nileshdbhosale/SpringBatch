package com.springboot.batch.step;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class Writer implements ItemWriter<String> {

	@Override
	public void write(List<? extends String> messages) throws Exception {
		// TODO Auto-generated method stub
		// System.out.println(" ============= Writing data Start ================ ");
		for(String msg : messages) {
			System.out.println(msg);
		}
		// System.out.println(" ============= Writing data End ================ ");
		
	}

}
