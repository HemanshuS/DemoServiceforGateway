/**
 * 
 */
package com.demo.service.DemoService2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



/**
 * @author Himanshu
 *
 */
@Controller
public class DemoServiceREST {
	
	
	
	@GetMapping(path="/callService2")
	public String getAppliances() {
		

		
		
		return "ServiceCall2";
		
	}

}
