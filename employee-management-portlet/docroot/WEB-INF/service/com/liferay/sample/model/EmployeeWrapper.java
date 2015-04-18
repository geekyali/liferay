/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.sample.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Employee}.
 * </p>
 *
 * @author yali dev
 * @see Employee
 * @generated
 */
public class EmployeeWrapper implements Employee, ModelWrapper<Employee> {
	public EmployeeWrapper(Employee employee) {
		_employee = employee;
	}

	@Override
	public Class<?> getModelClass() {
		return Employee.class;
	}

	@Override
	public String getModelClassName() {
		return Employee.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("empId", getEmpId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("field1", getField1());
		attributes.put("field2", getField2());
		attributes.put("field3", getField3());
		attributes.put("field4", getField4());
		attributes.put("field5", getField5());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long empId = (Long)attributes.get("empId");

		if (empId != null) {
			setEmpId(empId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String field1 = (String)attributes.get("field1");

		if (field1 != null) {
			setField1(field1);
		}

		Boolean field2 = (Boolean)attributes.get("field2");

		if (field2 != null) {
			setField2(field2);
		}

		Integer field3 = (Integer)attributes.get("field3");

		if (field3 != null) {
			setField3(field3);
		}

		Date field4 = (Date)attributes.get("field4");

		if (field4 != null) {
			setField4(field4);
		}

		String field5 = (String)attributes.get("field5");

		if (field5 != null) {
			setField5(field5);
		}
	}

	/**
	* Returns the primary key of this employee.
	*
	* @return the primary key of this employee
	*/
	@Override
	public long getPrimaryKey() {
		return _employee.getPrimaryKey();
	}

	/**
	* Sets the primary key of this employee.
	*
	* @param primaryKey the primary key of this employee
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_employee.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the emp ID of this employee.
	*
	* @return the emp ID of this employee
	*/
	@Override
	public long getEmpId() {
		return _employee.getEmpId();
	}

	/**
	* Sets the emp ID of this employee.
	*
	* @param empId the emp ID of this employee
	*/
	@Override
	public void setEmpId(long empId) {
		_employee.setEmpId(empId);
	}

	/**
	* Returns the group ID of this employee.
	*
	* @return the group ID of this employee
	*/
	@Override
	public long getGroupId() {
		return _employee.getGroupId();
	}

	/**
	* Sets the group ID of this employee.
	*
	* @param groupId the group ID of this employee
	*/
	@Override
	public void setGroupId(long groupId) {
		_employee.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this employee.
	*
	* @return the company ID of this employee
	*/
	@Override
	public long getCompanyId() {
		return _employee.getCompanyId();
	}

	/**
	* Sets the company ID of this employee.
	*
	* @param companyId the company ID of this employee
	*/
	@Override
	public void setCompanyId(long companyId) {
		_employee.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this employee.
	*
	* @return the user ID of this employee
	*/
	@Override
	public long getUserId() {
		return _employee.getUserId();
	}

	/**
	* Sets the user ID of this employee.
	*
	* @param userId the user ID of this employee
	*/
	@Override
	public void setUserId(long userId) {
		_employee.setUserId(userId);
	}

	/**
	* Returns the user uuid of this employee.
	*
	* @return the user uuid of this employee
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employee.getUserUuid();
	}

	/**
	* Sets the user uuid of this employee.
	*
	* @param userUuid the user uuid of this employee
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_employee.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this employee.
	*
	* @return the user name of this employee
	*/
	@Override
	public java.lang.String getUserName() {
		return _employee.getUserName();
	}

	/**
	* Sets the user name of this employee.
	*
	* @param userName the user name of this employee
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_employee.setUserName(userName);
	}

	/**
	* Returns the create date of this employee.
	*
	* @return the create date of this employee
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _employee.getCreateDate();
	}

	/**
	* Sets the create date of this employee.
	*
	* @param createDate the create date of this employee
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_employee.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this employee.
	*
	* @return the modified date of this employee
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _employee.getModifiedDate();
	}

	/**
	* Sets the modified date of this employee.
	*
	* @param modifiedDate the modified date of this employee
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_employee.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the field1 of this employee.
	*
	* @return the field1 of this employee
	*/
	@Override
	public java.lang.String getField1() {
		return _employee.getField1();
	}

	/**
	* Sets the field1 of this employee.
	*
	* @param field1 the field1 of this employee
	*/
	@Override
	public void setField1(java.lang.String field1) {
		_employee.setField1(field1);
	}

	/**
	* Returns the field2 of this employee.
	*
	* @return the field2 of this employee
	*/
	@Override
	public boolean getField2() {
		return _employee.getField2();
	}

	/**
	* Returns <code>true</code> if this employee is field2.
	*
	* @return <code>true</code> if this employee is field2; <code>false</code> otherwise
	*/
	@Override
	public boolean isField2() {
		return _employee.isField2();
	}

	/**
	* Sets whether this employee is field2.
	*
	* @param field2 the field2 of this employee
	*/
	@Override
	public void setField2(boolean field2) {
		_employee.setField2(field2);
	}

	/**
	* Returns the field3 of this employee.
	*
	* @return the field3 of this employee
	*/
	@Override
	public int getField3() {
		return _employee.getField3();
	}

	/**
	* Sets the field3 of this employee.
	*
	* @param field3 the field3 of this employee
	*/
	@Override
	public void setField3(int field3) {
		_employee.setField3(field3);
	}

	/**
	* Returns the field4 of this employee.
	*
	* @return the field4 of this employee
	*/
	@Override
	public java.util.Date getField4() {
		return _employee.getField4();
	}

	/**
	* Sets the field4 of this employee.
	*
	* @param field4 the field4 of this employee
	*/
	@Override
	public void setField4(java.util.Date field4) {
		_employee.setField4(field4);
	}

	/**
	* Returns the field5 of this employee.
	*
	* @return the field5 of this employee
	*/
	@Override
	public java.lang.String getField5() {
		return _employee.getField5();
	}

	/**
	* Sets the field5 of this employee.
	*
	* @param field5 the field5 of this employee
	*/
	@Override
	public void setField5(java.lang.String field5) {
		_employee.setField5(field5);
	}

	@Override
	public boolean isNew() {
		return _employee.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_employee.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _employee.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_employee.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _employee.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _employee.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_employee.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _employee.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_employee.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_employee.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_employee.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EmployeeWrapper((Employee)_employee.clone());
	}

	@Override
	public int compareTo(com.liferay.sample.model.Employee employee) {
		return _employee.compareTo(employee);
	}

	@Override
	public int hashCode() {
		return _employee.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.sample.model.Employee> toCacheModel() {
		return _employee.toCacheModel();
	}

	@Override
	public com.liferay.sample.model.Employee toEscapedModel() {
		return new EmployeeWrapper(_employee.toEscapedModel());
	}

	@Override
	public com.liferay.sample.model.Employee toUnescapedModel() {
		return new EmployeeWrapper(_employee.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _employee.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _employee.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_employee.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeeWrapper)) {
			return false;
		}

		EmployeeWrapper employeeWrapper = (EmployeeWrapper)obj;

		if (Validator.equals(_employee, employeeWrapper._employee)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Employee getWrappedEmployee() {
		return _employee;
	}

	@Override
	public Employee getWrappedModel() {
		return _employee;
	}

	@Override
	public void resetOriginalValues() {
		_employee.resetOriginalValues();
	}

	private Employee _employee;
}