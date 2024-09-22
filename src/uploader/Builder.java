package uploader;

import java.time.LocalDateTime;

public class Builder {
	private String customerName;
	private int customerId;
	private LocalDateTime customerDate;
	private LocalDateTime employeeStartDate;
	private LocalDateTime employeeEndDate;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public LocalDateTime getCustomerDate() {
		return customerDate;
	}
	public void setCustomerDate(LocalDateTime customerDate) {
		this.customerDate = customerDate;
	}
	public LocalDateTime getEmployeeStartDate() {
		return employeeStartDate;
	}
	public void setEmployeeStartDate(LocalDateTime employeeStartDate) {
		this.employeeStartDate = employeeStartDate;
	}
	public LocalDateTime getEmployeeEndDate() {
		return employeeEndDate;
	}
	public void setEmployeeEndDate(LocalDateTime employeeEndDate) {
		this.employeeEndDate = employeeEndDate;
	}
	

}
