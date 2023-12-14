package com.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.dao.Employee;
import com.edu.service.EmployeeService;


@RestController
public class EmployeeController {
	@Autowired
private EmployeeService employeeService;
	
	@PostMapping("/saveemployee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	

	//Employeeneed to assign department
	
	@PutMapping("/employeeassigndepartment/{empid}/department/{deptid}")
	public Employee employeeAssignDepartment(@PathVariable Integer empid, @PathVariable Long deptid) {
		return employeeService.employeeAssignDepartment(deptid,empid);
	}
	
	@GetMapping("/getallemployees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	//by email
	@GetMapping("/findbyemployeeemail/{email}")
	public Employee findByEmployeeEmail(@PathVariable("email") String employeeEmail) {
		return employeeService.findByEmployeeEmail(employeeEmail);
	}
	//by phone
	
	@GetMapping("/findbyemployeephone/{phone}")
	public Employee findByEmployeePhone(@PathVariable("phone") long employeePhone) {
		return employeeService.findByEmployeePhone(employeePhone);
	}
	
	//find employee by name
	@GetMapping("/findbyemployeename/{ename}")
    public List<Employee> findByEmployeeName(@PathVariable("ename") String employeeName){
		return employeeService.findByEmployeeName(employeeName);
	}
	
//	@GetMapping("/findByemployeeNameemployeeSalary/Dipali")
//	public Employee findByemployeeNameemployeeSalary(@PathVariable String employeeName,@PathVariable float employeeSalary )
//	{
//		return employeeService.findByemployeeNameemployeeSalary(employeeName, employeeSalary);
//	}
	
	
//	Employee findByUsername(String username); 
//	List<Employee> findByManagerId(int managerId);
//	List<Employee> findByJoiningDate(LocalDate date);
//	List<Employee> findByJoiningDateBetween(LocalDate from, LocalDate to);
	
	/*
	// getting Booking
			@GetMapping("/getbooking")
			public List<Booking> getAllBooking(){
				return bookingService.getAllBooking();
			}
			
			// Delete/cancle Booking
			@DeleteMapping("/deletebooking/{bookingid}")
			public List<Booking> deleteBooking(@PathVariable("bookingid") Integer bookingId) throws GlobalException {
				return bookingService.deleteBooking(bookingId);
			
			}
			
			// update Booking
			@PutMapping("/updatebooking/{bookingid}")
			public Booking updateBooking(@PathVariable("bookingid") Integer bookingId, @RequestBody Booking booking) throws GlobalException {
				return bookingService.updateBooking(bookingId,booking);
			}
			
			//get total booking
			@GetMapping("/gettotalbooking")
			public long  getTotalBooking(){
				return bookingService.getTotalBooking();
			}
			
			//getting upcoming booking
			 String today=java.time.LocalDate.now().toString();
			@GetMapping("/getupcomingbooking")
			public List<Booking> getUpcomingBooking(){
				return bookingService.getUpcomingBooking(today);
			}
			
			//getting total profit gain
			@GetMapping("/gettotalprofit")
			public Long getTotalProfit() {
				return bookingService.getTotalProfit();
			}
			//getbooking using userId
			@GetMapping("/getbookingbyuserid/{userid}")
			public List<Booking> fimdBookingByUserId(@PathVariable("userid") int userId){
				return bookingService.findgetBookingByUserId(userId);
			}
			
			//find booking between two date
			@GetMapping("/findbookingbetweendate/{sdate}/{edate}")
			public List<Booking> findBookingBetweenDate(@PathVariable("sdate") String sdate , @PathVariable("edate") String edate){
				return bookingService.findBookingBetweenDate(sdate,edate);
			}
			
			//find by booking id
			@GetMapping("/findbybookingid/{bookingid}")
			public Booking findByBookingId(@PathVariable("bookingid") int bookingId) {
				return bookingService.findByBookingId(bookingId);
			}
			
			//find booking exits or not
			@GetMapping("/findbookingexits/{eid}/{vid}/{bdate}")
			public List<Booking> findBookingexits(@PathVariable("eid") int eventId ,@PathVariable("vid") int venueId , @PathVariable("bdate") String bookingDate){
				return bookingService.findBookingexits(eventId,venueId,bookingDate);
			}
			*/
}
