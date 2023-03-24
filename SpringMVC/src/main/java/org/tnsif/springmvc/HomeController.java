package org.tnsif.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//it will snd necessary reqst to the server
@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home()
	{
		System.out.println("code to demonsgtrate on simple" +"web application");
		return "home.jsp";

	}
}
