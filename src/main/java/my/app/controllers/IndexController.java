package my.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {

	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap model) {
		model.addAttribute("message", "Index page!");
		return "index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap model) {
		model.addAttribute("message", "Login page!");
		return "login";
	}

	@RequestMapping(value = "/404", method = RequestMethod.GET)
	public String notFound(ModelMap model) {
		model.addAttribute("message", "Not found!");
		return "404";
	}

}