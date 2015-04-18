package com.yali.liferay.sample;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.log4j.Logger;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.sample.model.Employee;
import com.liferay.sample.model.impl.EmployeeImpl;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.yali.liferay.sample.delegate.LocalServiceClient;

/**
 * Portlet implementation class ManageEmployee
 */
public class ManageEmployee extends MVCPortlet {
	Logger log=Logger.getLogger(ManageEmployee.class);
	private LocalServiceClient localServiceClient;
	@Override
	public void init() throws PortletException {
	localServiceClient=new LocalServiceClient();
		super.init();
	}
	@Override
	public void render(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {		
		List<Employee> employees=localServiceClient.getEmployees();
		request.setAttribute("employees", employees);
		log.info("Render method");
		super.render(request, response);
	}
	@ProcessAction(name="saveEmployee")
	public void processAction(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		String saveMode=ParamUtil.getString(actionRequest, "saveMode", "");
		String userName=ParamUtil.getString(actionRequest, "username", "");
		Employee emp=new EmployeeImpl();		
		emp.setUserName(userName);
		localServiceClient.saveEmployee(emp);
		log.info("Save Employee "+userName+" .. "+saveMode);
		
	}

}
