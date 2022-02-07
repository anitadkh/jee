package fr.formation.inti.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class Locale extends ActionSupport implements ServletRequestAware{

	private String urlReferer;

	private HttpServletRequest request;

	public String getUrlReferer() {
		return urlReferer;
	}


	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	@Override
	public String execute() throws Exception {
		urlReferer = request.getHeader("referer");
		return SUCCESS;
	}

}
