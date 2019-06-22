package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IShipmentTypeDao;
import com.app.model.ShipmentType;
import com.app.service.IShipmentTypeService;
@Service
public class ShipmentTypeServiceImpl implements IShipmentTypeService {
	@Autowired
	private IShipmentTypeDao dao;
	
	@Transactional
	public Integer saveShipmentType(ShipmentType s) {
		return dao.saveShipmentType(s);
	}

	@Transactional()
	public void updateShipmentType(ShipmentType s) {
	
	dao.updateShipmentType(s);
	}

	@Transactional
	public void deleteShipmentType(Integer sId) {
		dao.deleteShipmentType(sId);
	}

	@Transactional(readOnly=true)
	public ShipmentType getOneShipmentType(Integer sId) {
		return dao.getOneShipmentType(sId);
		
	}

	@Transactional(readOnly=true)
	public List<ShipmentType> getAllShipment() {
		return dao.getAllShipment();
	}

}
