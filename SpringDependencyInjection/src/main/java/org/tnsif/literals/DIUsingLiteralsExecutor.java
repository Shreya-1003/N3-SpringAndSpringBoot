package org.tnsif.literals;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIUsingLiteralsExecutor {

	public static void main(String[] args) {
		BeanFactory f = new ClassPathXmlApplicationContext("beans.xml");
		SwiftEngine e = (SwiftEngine) f.getBean("swift",SwiftEngine.class);
		System.out.println(e);
		System.out.println(e.cost());
		System.out.println(e.display());
		
		SwiftEngine e1 = (SwiftEngine) f.getBean("Renault",SwiftEngine.class);
		System.out.println(e1);
		System.out.println(e1.cost());
		System.out.println(e1.display());
	}

}
