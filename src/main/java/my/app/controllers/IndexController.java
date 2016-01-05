package my.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.sql.SQLException;

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

	@RequestMapping(value = "/exception", method = RequestMethod.GET)
	public String exception(ModelMap model) throws Exception {
		throw new Exception("throw an exception");
	}

}