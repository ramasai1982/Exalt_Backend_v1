package com.producerconsumer.exalt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExaltApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExaltApplication.class, args);

/*		SinglePassGenerator singlepassGenerator = new SinglePassGenerator();

		BatchPassGenerator batch = new BatchPassGenerator();*/


/*		batch.start();
		batch.generatePassBatch(5);
		batch.interrupt();*/
	}

}
