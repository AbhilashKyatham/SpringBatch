package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/cts")
public class SpringBatchController {

	@RequestMapping(path="/abc",method=RequestMethod.GET)
	public String startJob(){
	
		return "index";
		
	}
}
