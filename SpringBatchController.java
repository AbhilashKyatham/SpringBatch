package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cts")
public class SpringBatchController {

	@RequestMapping(path="/index",method=RequestMethod.GET)
	public String startJob(){
	
		return "home";
		
	}
}
