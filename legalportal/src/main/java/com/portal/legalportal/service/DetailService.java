package com.portal.legalportal.service;

import java.util.List;

import com.portal.legalportal.model.Detail;
import com.portal.legalportal.model.Login;

public interface DetailService {
	public Detail saveDetail(Detail detail);
	public Login saveLogin(Login login);
	public List<Detail> getAllDetail();
}

