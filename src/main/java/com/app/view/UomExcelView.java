package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.app.model.Uom;
@Component
public class UomExcelView extends AbstractXlsxView{

	@Override
	protected void buildExcelDocument(Map<String, Object> model, 
			   						  Workbook workbook, 
			   						  HttpServletRequest request,
			   						  HttpServletResponse response)throws Exception {
	
//set file name and download
		response.addHeader("content-Disposion","attachment;filename=Uom.xlsx");
		
//read data from model
		@SuppressWarnings("unchecked")
List<Uom> list=(List<Uom>)model.get("list");	
	
	//create one new Sheet
	
	Sheet sheet=workbook.createSheet("Uoms");
	
	//create Header
	setHead(sheet);
	setBody(sheet,list);
	}
	private void setHead(Sheet sheet)
	{

		Row row=sheet.createRow(0);
		row.createCell(0).setCellValue("Id");
		row.createCell(1).setCellValue("Type");
		row.createCell(2).setCellValue("Code");
		row.createCell(3).setCellValue("Email");
		row.createCell(4).setCellValue("Contact");
		row.createCell(5).setCellValue("IdType");
		row.createCell(6).setCellValue("IdNumber");
		}
	
     private void setBody(Sheet sheet, List<Uom> list) 
     {

		int rowNum=1;
		for(Uom u:list)
		{
		Row row=sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(u.getUomId().toString());
			row.createCell(1).setCellValue(u.getUomType());
			row.createCell(2).setCellValue(u.getUomCode());
			row.createCell(3).setCellValue(u.getUomEmail());
			row.createCell(4).setCellValue(u.getUomContact().toString());
			row.createCell(5).setCellValue(u.getUomIdType());
			row.createCell(6).setCellValue(u.getUomIdNumber().toString());
			
			
	}

}
	

}
