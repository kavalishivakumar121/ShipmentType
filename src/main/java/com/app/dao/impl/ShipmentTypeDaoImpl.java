package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IShipmentTypeDao;
import com.app.model.ShipmentType;
@Repository
public class ShipmentTypeDaoImpl implements IShipmentTypeDao {
	@Autowired
	private HibernateTemplate ht;


	public Integer saveShipmentType(ShipmentType s) {
		return (Integer)ht.save(s);
	}

	public void updateShipmentType(ShipmentType s) {
		ht.update(s);
		
	}

	public void deleteShipmentType(Integer sId) {
		ShipmentType st=new ShipmentType();
		st.setId(sId);
		ht.delete(st);
	}

	public ShipmentType getOneShipmentType(Integer sId) {
		return ht.get(ShipmentType.class,sId);
	}

	public List<ShipmentType> getAllShipment() {
		return ht.loadAll(ShipmentType.class);
	}

}
