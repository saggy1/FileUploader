package uploader;

import java.time.LocalDateTime;

public class Customer {
	/*public Customer(String customerName, int customerId, LocalDateTime employeeStart) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.employeeStart = employeeStart;
	}*/
	private String customerName;
	private int customerId;
	private LocalDateTime customerDate;
	private LocalDateTime employeeStartDate;
	private LocalDateTime employeeEndDate;
	public Customer(Builder builderCreateObject) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerDate = customerDate;
		this.employeeStartDate = employeeStartDate;
		this.employeeEndDate = employeeEndDate;
	}
	
	

}
