package com.ms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ms.model.TaxEntity;
import com.ms.service.TaxService;


@org.springframework.stereotype.Controller
public class Controller {
		
		
		
		@RequestMapping("/testing")
		public void test() {
			System.out.println("test successfull");
		}
		
		@RequestMapping("/welcome")
		public void demo() {
			System.out.println("welcome successfull");
		}
		
		@RequestMapping("/findpage")
		public String taxFind(){
			return "Tax.jsp";
		}
		

		@Autowired
		private TaxService taxService;
		@RequestMapping("/compute")
		public ModelAndView  computeTax(@ModelAttribute("data") TaxEntity tx) throws IOException {
		taxService.taxCal(tx);
		
		
	
		
		// response return controller to servelet
		ModelAndView mv=new ModelAndView();
		mv.addObject("tx",tx);
		mv.setViewName("View.jsp");
		
		
		return mv;
	
		}
		
}
