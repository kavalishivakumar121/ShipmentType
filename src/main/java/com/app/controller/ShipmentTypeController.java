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

import com.app.model.ShipmentType;
import com.app.service.IShipmentTypeService;
import com.app.view.ShipmentTypeExcelView;
import com.app.view.ShipmentTypePdfView;

@Controller
@RequestMapping("/shipment")
public class ShipmentTypeController {
	@Autowired
	private IShipmentTypeService service;
	
  @RequestMapping("/reg")
  public String showPage(ModelMap map)
  {
	  map.addAttribute("shipmentType", new ShipmentType());
	  return "Shipment_Registration";
  }
  @RequestMapping(value="save",method=RequestMethod.POST)
  public String saveShipmentType(@ModelAttribute ShipmentType shipmentType,ModelMap map)
  {
	  Integer id=service.saveShipmentType(shipmentType);
	  String message="shipment is successfully added"+id;
	  map.addAttribute("message1",message);
	return "Shipment_Registration";
	  
  }
  @RequestMapping("/all")
  public String getAllShipment(ModelMap map)
  {
	  List<ShipmentType> obj=service.getAllShipment();
	  map.addAttribute("list",obj);
	  return "ShipmentType_Data";
  }
  @RequestMapping("/delete")
  public String deleteShipment(@RequestParam Integer id,ModelMap map)
  {
	  service.deleteShipmentType(id);
	  //get all records after deletion
	  List<ShipmentType> obs=service.getAllShipment();
	  map.addAttribute("list",obs);
	  map.addAttribute("msg","shipmentType record is deleted '"+id+"' successfully");
	  return "ShipmentType_Data";
  }
  @RequestMapping("/edit")
  public String showEdit(@RequestParam Integer id,ModelMap map)
  {
	ShipmentType st=service.getOneShipmentType(id);
	map.addAttribute("shipmentType",st);
	  return "ShipmentType_Edit";
  }
  //updating the data
 @RequestMapping(value ="update",method=RequestMethod.POST)
  public String doUpdate(@ModelAttribute ShipmentType shipmentType,ModelMap map)
  {
	 //call service for update 
	 
	service.updateShipmentType(shipmentType);
	 //call service for Rows
	 List<ShipmentType> abs=service.getAllShipment();
	 map.addAttribute("list",abs);
	 String message2="Updated sucessfully...";
	 map.addAttribute("msg2",message2);
	 return "ShipmentType_Data";
  }
 @RequestMapping("/view")
 public String viewShipment(@RequestParam Integer id,ModelMap map)
 {
	ShipmentType shipmentType=service.getOneShipmentType(id); 
	map.addAttribute("v1",shipmentType);
	
	 return "ShipmentTypeViewOne";
 }
 @RequestMapping("/excel")
 public ModelAndView exportExcel(ShipmentType shipmentType,ModelMap map)
 {
	 List<ShipmentType> obs=service.getAllShipment();
	ModelAndView m=new ModelAndView();
	m.setView(new ShipmentTypeExcelView());
	m.addObject("list",obs);
	 return m;
 }
 @RequestMapping("/pdf")
 public ModelAndView exportPdf(ShipmentType shipmentType,ModelMap map)
 {
	 List<ShipmentType> obs1=service.getAllShipment();
	 ModelAndView m=new ModelAndView();
	 m.setView(new ShipmentTypePdfView());
	 m.addObject("list",obs1);
	 return m;
 }
}
