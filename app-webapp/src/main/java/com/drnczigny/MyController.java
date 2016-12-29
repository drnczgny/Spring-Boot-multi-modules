package com.drnczigny;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.drnczigny.domain.User;

@Controller
public class MyController {

	@RequestMapping("/")
	@ResponseBody
	public String home() {
		User user = new User("Test User");

		return user.getName();
	}

}
