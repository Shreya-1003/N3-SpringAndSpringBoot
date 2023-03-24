package org.tnsif.springmvc;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringMvcApplication {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext context = SpringApplication.run(SpringMvcApplication.class, args);
		Scanner s = new Scanner(System.in);
//		int x =s.nextInt();
//		System.out.println(x);
//		Employee e = context.getBean(Employee.class);
//		e.setEmpid(10123);
//		e.setEmpname("shreya");
//		e.print();
		
		HomeController h = context.getBean(HomeController.class);
		h.home();

	}
}
 