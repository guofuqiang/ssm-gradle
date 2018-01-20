package com.ssm.controller.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.ssm.entity.PageBean;
import com.ssm.entity.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.stereotype.Controller;*/

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;


@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@ResponseBody
	@RequestMapping("/userlist")
	public String userlist(){


		return  "list";
	}






}
