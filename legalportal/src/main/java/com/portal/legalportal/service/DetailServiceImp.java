package com.portal.legalportal.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.legalportal.model.Detail;
import com.portal.legalportal.model.Login;
import com.portal.legalportal.repository.DetailRepository;
import com.portal.legalportal.repository.LoginRepository;
@Service
public class DetailServiceImp implements DetailService{
	@Autowired
	private DetailRepository detailrepo;
	@Autowired
	private LoginRepository loginrepo;
	@Override
	public Detail saveDetail(Detail detail)
	{
		return detailrepo.save(detail);
	}
	@Override
	public Login saveLogin(Login login) 
	{
		return loginrepo.save(login);
	}
	@Override
	public List<Detail> getAllDetail()
	{
		return detailrepo.findAll();
	}
	
}