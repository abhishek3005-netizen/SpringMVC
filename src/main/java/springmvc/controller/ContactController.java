package springmvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;
	@ModelAttribute
	public void common(Model model) {
		model.addAttribute("Header", "Website");
		model.addAttribute("Desc", "By Abhishek");
	}
	
	@RequestMapping(path = "/contact", method = RequestMethod.GET)
	public String showForm() {
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		this.userService.createUser(user);
		return "success";
	}

	/*
	 * @RequestMapping(path = "/processform", method = RequestMethod.POST) \
	 * public String handleForm(
	 * 
	 * @RequestParam(name = "email", required = true)String userEmail,
	 * 
	 * @RequestParam(name = "userName", required = true)String userName,
	 * 
	 * @RequestParam(name = "password", required = true)String userPassword, Model
	 * model) {
	 * 
	 * User user = new User(); user.setEmail(userEmail); user.setUserName(userName);
	 * user.setPassword(userPassword);
	 * 
	 * // send the data to the success page
	 * 
	 * model.addAttribute("name", userName); model.addAttribute("email", userEmail);
	 * model.addAttribute("password", userPassword);
	 * 
	 * 
	 * model.addAttribute("user", user);
	 * 
	 * return "success"; }
	 */

}
