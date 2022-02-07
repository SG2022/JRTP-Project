
package com.springhibernate.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//import com.edit.model.EditModel;
import com.springhibernate.model.addEmployeeModel;
import com.springhibernate.service.addEmployeeService;

@Controller
public class addEmployeeController {
	
	@Autowired
	private addEmployeeService EmployeeService; 
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String listEmp() {
		
		return "welcome customer";
		
	}
	
	@RequestMapping(value="/editEmployees", method=RequestMethod.GET)
	public ModelAndView Employee(@ModelAttribute("command") addEmployeeModel empmodel,BindingResult bindingresult)
	{
		List<addEmployeeModel> list = EmployeeService.listEmp();
		/* ModelAndView model = new ModelAndView("listEmployee"); */
		ModelAndView model = new ModelAndView("editEmployees");
	        model.addObject("employees", list);
	        return model;	      		
	}
	 
	@RequestMapping(value="/edit.html",method=RequestMethod.GET)
	public ModelAndView editEmployee(@ModelAttribute("command") addEmployeeModel empmodel, BindingResult bindingresult)
	{
		List<addEmployeeModel> list = EmployeeService.listEmp();
		 ModelAndView model = new ModelAndView("editEmployees");
		 model.addObject("employee", EmployeeService.editgetid(empmodel.getId()));
	        model.addObject("employees", list);
	        return model;	      		
	}
	
	@RequestMapping(value="/save.html",method=RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute("command") addEmployeeModel empmodel,BindingResult bindingresult)
	{
		EmployeeService.saveEmployee(empmodel);
//		return new ModelAndView("redirect:/add.html");
//		ModelAndView model = new ModelAndView("redirect:/editEmployees");
		List<addEmployeeModel> list = EmployeeService.listEmp();
		ModelAndView model = new ModelAndView("listEmployee");
		model.addObject("employees",list); 
		return model;	 
		
	}
	
	@RequestMapping(value="/delete.html",method=RequestMethod.GET)
	public void deleteEmployee(@ModelAttribute("command") addEmployeeModel empmodel,BindingResult bindingresult)
	{
		EmployeeService.deleteEmp(empmodel);
		
	}
	
	
	
	
}
