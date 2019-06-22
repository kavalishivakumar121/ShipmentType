package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.Uom;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class UomPdfView extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> model, 
							Document document, PdfWriter writer,
							HttpServletRequest request, 
							HttpServletResponse response) throws Exception {
		
		//filename +download
		response.addHeader("Content-Disposition","attachment;filename=Uoms.pdf");
		
		//read data from model
		@SuppressWarnings("unchecked")
		List<Uom> list=(List<Uom>)model.get("list");
		Paragraph p=new Paragraph("welcome to uom pdf file");
		document.add(p);
	
		PdfPTable table=new PdfPTable(8);
		table.addCell("Id");
		table.addCell("Type");
		table.addCell("uomCode");
		table.addCell("For");
		table.addCell("Email");
		table.addCell("Contact");
		table.addCell("IdType");
		table.addCell("IdNumber");
		for(Uom u:list)
		{
			table.addCell(u.getUomId().toString());
			table.addCell(u.getUomCode());
			table.addCell(u.getuomType());
			table.addCell(u.getUomFor());
			table.addCell(u.getUomEmail());
			table.addCell(u.getUomContact().toString());
			table.addCell(u.getUomIdType());
			table.addCell(u.getUomIdNumber().toString());
		}
		document.add(table);
		
	}

}
