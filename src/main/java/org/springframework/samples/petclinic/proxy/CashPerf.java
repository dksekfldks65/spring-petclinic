package org.springframework.samples.petclinic.proxy;

import org.springframework.util.StopWatch;

public class CashPerf implements Payment{

	Payment cash = new Cash();

	@Override
	public void pay(int amout){

		StopWatch stopWatch = new StopWatch();
		stopWatch.start();

		cash.pay(amout);

		stopWatch.stop();
		System.out.println(stopWatch.prettyPrint());
	}

}
