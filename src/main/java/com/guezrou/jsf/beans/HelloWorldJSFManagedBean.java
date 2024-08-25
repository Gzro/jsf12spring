package com.guezrou.jsf.beans;

import java.io.Serializable;

import javax.inject.Inject;

import com.guezrou.jsf.services.EmployeService;

public class HelloWorldJSFManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private UserFormView userFormView;

	@Inject
	private EmployeService empService;

	public void setEmpService(EmployeService empService) {
		this.empService = empService;
	}

	public HelloWorldJSFManagedBean() {
		this.userFormView = new UserFormView();
	}

	public UserFormView getUserFormView() {
		return userFormView;
	}

	public void setUserFormView(UserFormView userFormView) {
		this.userFormView = userFormView;
	}

	public String showUserDetails() {
		System.out.println("The Name Of the user is :" + this.userFormView.getUserName());
		return "welcomePage";
	}
	
	public String printMsgFromSpring() {
		return empService.getMessage();
	}
}