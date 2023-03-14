package org.tnsif.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileExecutor {

	public static void main(String[] args) {
//		Airtel a = new Airtel();
//		a.call();
//		a.messgae();
//		
//		Jio j = new Jio();
//		j.call();
//		j.messgae();
		
		ApplicationContext c = new ClassPathXmlApplicationContext(" beans.xml");
		System.out.println("cpnfig loaded...");
		
//		Airtel a = (Airtel) c.getBean("airtel");
//		a.call();
//		a.messgae();
		
		Sim s = c.getBean("sim",Sim.class);
		s.call();
		s.messgae();
		
		Sim s1 = c.getBean("sim1",Sim.class);
		s1.call();
		s1.messgae();
	}

}
