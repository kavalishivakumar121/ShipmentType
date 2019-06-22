package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUomDao;
import com.app.model.Uom;
import com.app.service.IUomService;
@Service
public class UomSerivceImpl implements IUomService {
	@Autowired
	private IUomDao dao;
	@Transactional
	public Integer saveUom(Uom u) {
		return dao.saveUom(u);
	}

	@Transactional
	public void updateUom(Uom u) {

		dao.updateUom(u);
	}

	@Transactional
	public void deleteUom(Integer uomId) {
		dao.deleteUom(uomId);
	}

	@Transactional(readOnly=true)
	public Uom getOneUom(Integer uomId) {
		return dao.getOneUom(uomId);
	}

	@Transactional(readOnly=true)
	public List<Uom> getAllUom() {
		return dao.getAllUom();
	}

}
