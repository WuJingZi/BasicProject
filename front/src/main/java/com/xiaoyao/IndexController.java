package com.xiaoyao;

import com.xiaoyao.hy.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@Autowired
	private UserService userService;



	@GetMapping("index")
	public String index(){


		return  "index";
	}

	
	
	

}
