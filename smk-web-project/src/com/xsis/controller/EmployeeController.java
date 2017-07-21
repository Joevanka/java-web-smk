package com.xsis.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xsis.entity.Employee;
import com.xsis.service.EmployeeService;
import com.xsis.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/employee")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private EmployeeService employeeService = new EmployeeServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if("save".equals(request.getParameter("submit"))){
			//setelah input post
			Employee emp = new Employee();
			emp.setName(request.getParameter("name"));
			emp.setNoHp(request.getParameter("nohp"));
			emp.setAddress(request.getParameter("address"));
			emp.setSalary(Double.parseDouble(request.getParameter("salary")));
			employeeService.save(emp);
		} else if(request.getParameter("delete") != null){
			employeeService.delete(Integer.parseInt(request.getParameter("delete")));
		}
		
		List<Employee> listEmp = employeeService.getAllEmployee();
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/index.jsp");
		request.setAttribute("listEmp", listEmp);
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
