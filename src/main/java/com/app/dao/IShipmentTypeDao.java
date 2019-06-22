package com.app.dao;

import java.util.List;

import com.app.model.ShipmentType;

public interface IShipmentTypeDao {
	public Integer saveShipmentType(ShipmentType s);
	public void updateShipmentType(ShipmentType s);
	public void deleteShipmentType(Integer sId);
	public ShipmentType getOneShipmentType(Integer sId);
	public List<ShipmentType> getAllShipment();
}
