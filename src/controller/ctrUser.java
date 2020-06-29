package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ctrUser {
	
	@RequestMapping("/registrar")
	public ModelAndView register () {
		return register();
	}

}
