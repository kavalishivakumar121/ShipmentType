package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.ShipmentType;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class ShipmentTypePdfView extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> model,
			Document document, PdfWriter writer,
			HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		//create file name +download
		response.addHeader("contenet-Disposition","attachment;filename=shipmentPdfView.pdf");
		//read data from model
		@SuppressWarnings("unchecked")
		List<ShipmentType> list=(List<ShipmentType>) model.get("list");
		Paragraph p1=new Paragraph("hello welcome to pdf Page....!");
		document.add(p1);
		PdfPTable p=new PdfPTable(6);
	}
}


