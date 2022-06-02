package springmvc.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("first")
public class HomeController {
	
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		
		System.out.println("This is the home page");
		model.addAttribute("name", "Abhishek Sharma");
		model.addAttribute("id", 1221);
		List<String> friends = new ArrayList<String>();
		friends.add("Vandan");
		friends.add("Kaustubh");
		friends.add("Uttam");
		model.addAttribute("f",friends);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is the about page");
		return "about";
		
	}
	
	@RequestMapping("/help")	
	public ModelAndView help() {
		
		System.out.println("This is help page");
		
//		creating the modelAndView object
		ModelAndView modelAndView = new ModelAndView();

//		setting the data
		modelAndView.addObject("name", "Akshat");
		modelAndView.addObject("rollnumber", 12312);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(3434);
		list.add(2134);
		list.add(2345);
		
		modelAndView.addObject("marks", list);
//		setting the view where we want to send all this data
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
	
}
