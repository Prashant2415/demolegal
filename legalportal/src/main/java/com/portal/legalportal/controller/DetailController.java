package com.portal.legalportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portal.legalportal.model.Detail;
import com.portal.legalportal.model.Login;
import com.portal.legalportal.service.DetailService;

@RestController
@RequestMapping("/detail")
@CrossOrigin
public class DetailController {
	@Autowired
	private DetailService detailservice;
	@Autowired
	private DetailService loginservice;
	@PostMapping("/add")
	public String add(@RequestBody Detail detail)
	{
		System.out.print("options:"+detail.getOptions());
		detailservice.saveDetail(detail);
		return("New user added");
	}	
	@PostMapping("/login")
	public String login(@RequestBody Login login)
	{
		loginservice.saveLogin(login);
		return("New user logged in");
	}
	@GetMapping("/getAll")
	public List<Detail> getAllDetail()
	{
		return detailservice.getAllDetail();
	}
}
