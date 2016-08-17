package com.sngular.formacion.mobile;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

import com.sngular.formacion.mobile.dto.Mobile;

@Repository
public class MobileRepositoryImpl implements MobileRepository {

	@Inject
	private JdbcOperations jdbcOperations;
	
	public Mobile create(Mobile mobile) {
		
		return null;
	}
}
