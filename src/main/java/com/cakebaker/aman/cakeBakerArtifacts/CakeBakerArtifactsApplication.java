package com.cakebaker.aman.cakeBakerArtifacts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CakeBakerArtifactsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CakeBakerArtifactsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Frosting frosting = new ChocolateFrosting();
		Syrup syrup = new StrawBerrySyrup();
		CakeBaker cakeBaker = new CakeBaker(frosting,syrup);
		cakeBaker.bakeCake();
	}
}
