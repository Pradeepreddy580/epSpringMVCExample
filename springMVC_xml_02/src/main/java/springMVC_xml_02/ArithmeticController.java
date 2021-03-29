package springMVC_xml_02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ArithmeticController {
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
		int res = num1 + num2;
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("result",res);
		mv.setViewName("result.jsp");
		
		return mv;
	}
	
	@RequestMapping("/mul")
	public ModelAndView mul(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
		int res = num1 * num2;
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("result",res);
		mv.setViewName("result.jsp");
		
		return mv;
	}
	
	@RequestMapping("/sub")
	public ModelAndView sub(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
		int res = num1 - num2;
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("result",res);
		mv.setViewName("result.jsp");
		
		return mv;
	}
	
	@RequestMapping("/div")
	public ModelAndView div(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
		int res = num1 / num2;
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("result",res);
		mv.setViewName("result.jsp");
		
		return mv;
	}

}
