package edu.mum.cs425.project.eshoppers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileController {

	@RequestMapping(value = "/profile")
	public String contactus() {
		return "webapps/profile";
	}
}
