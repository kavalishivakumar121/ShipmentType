package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Uom;
import com.app.service.IUomService;
import com.app.view.UomExcelView;
import com.app.view.UomPdfView;


@Controller
@RequestMapping("/uom")
public class UomController {
	//private IUomService service;
	@Autowired
	private IUomService service;
	@RequestMapping("/reg")
	public String showUom(ModelMap map)
	{
		map.addAttribute("uom",new Uom());
		return "Uom_Registration";
	}
	
	//Inserting the Data.....
	
	@RequestMapping(value ="save",method=RequestMethod.POST)
	public String uomSave(@ModelAttribute Uom uom,ModelMap map)
	{
		Integer id=service.saveUom(uom);
		String message="Uom'"+id+"' Record added successfully...";
		map.addAttribute("uomMsg",message);
		return "Uom_Registration";
	}
	
	//fetching the Data....
	@RequestMapping("/show")
	public String fetchUom(ModelMap map)
	{
		List<Uom> obs=service.getAllUom();
		map.addAttribute("uomlist",obs);
		return "Uom_Data";
	}
	//delete the records
	@RequestMapping("/delete")
	public  String deletePage(@RequestParam Integer id,ModelMap map)
	{
		service.deleteUom(id);
		//after delete fetch data
		List<Uom> ulist=service.getAllUom();
		map.addAttribute("uomlist",ulist);
		String message="'"+id+"'---Record Deleted successfully";
		map.addAttribute("message1",message);
		return "Uom_Data";
	}
	//Edit records
	@RequestMapping("/edit")
	public String editUom(@RequestParam Integer id,ModelMap map)
	{
		Uom u=service.getOneUom(id);
		map.addAttribute("uom",u);
		return "Uom_EditData";
	}
	//update data
	@RequestMapping(value="update",method=RequestMethod.POST)
	public String udateUom(@ModelAttribute Uom uom,ModelMap map)
	{
		service.updateUom(uom);
		List<Uom> ulist=service.getAllUom();
		map.addAttribute("uomlist",ulist);
		String msg="Updated successfully completed";
		map.addAttribute("msg1",msg);
		return "Uom_Data";
	}
	@RequestMapping("/view")
	public String viewPage(@RequestParam Integer id,ModelMap map)
	{
		Uom u=service.getOneUom(id);
		map.addAttribute("v1",u);
		return "Uom_ViewPage";
	}
@RequestMapping("/excel")
	public ModelAndView showExcel()
	{
		//read all db rows
		List<Uom> obs=service.getAllUom();
		ModelAndView m=new ModelAndView();
		m.setView(new UomExcelView());
		m.addObject("list",obs);
		return m;
		
	}
	
	  @RequestMapping("/pdf") 
	  public ModelAndView showPdf() 
	  { 
		 
	  List<Uom> obs=service.getAllUom(); 
	  ModelAndView m=new ModelAndView();
	  m.setView(new UomPdfView());
	  m.addObject("list",obs); return m; }
	 }
