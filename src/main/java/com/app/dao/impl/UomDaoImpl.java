package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IUomDao;
import com.app.model.Uom;
@Repository
public class UomDaoImpl implements IUomDao

{
	@Autowired
	private HibernateTemplate ht;
	@Override
	public Integer saveUom(Uom u) {
		return (Integer) ht.save(u);
	}

	@Override
	public void updateUom(Uom u) {
         ht.update(u);		
	}

	@Override
	public void deleteUom(Integer uomId) {
		Uom u=new Uom();
		u.setUomId(uomId);
		ht.delete(u);
	}

	@Override
	public Uom getOneUom(Integer uomId) {
	
		return ht.get(Uom.class,uomId);
	}

	@Override
	public List<Uom> getAllUom() {
		
		return ht.loadAll(Uom.class);
	}

}
