package com.app.service;

import java.util.List;

import com.app.model.ShipmentType;

public interface IShipmentTypeService {
	public Integer saveShipmentType(ShipmentType s);
	public void updateShipmentType(ShipmentType s);
	public void deleteShipmentType(Integer sId);
	public ShipmentType getOneShipmentType(Integer Sid);
	public List<ShipmentType> getAllShipment();

}
