package com.itsu.token.sample.checker;

import javax.annotation.Resource;

import org.aspectj.lang.JoinPoint;
import org.springframework.jdbc.core.JdbcTemplate;

import com.itsu.itsutoken.checker.CusTokenChecker;
import com.itsu.itsutoken.exception.TokenCheckException;
import com.itsu.token.sample.vo.MyCustomTableSample;

public class MyCustomTokenChecker extends CusTokenChecker<MyCustomTableSample> {

	@Resource
	public JdbcTemplate jdbcTemplate;

	@Override
	public void check(JoinPoint joinPoint) throws TokenCheckException {
		// do some check here
		String name = this.getTableSample().getClass().getName();
		System.out.println(name);

	}

	@Override
	public MyCustomTableSample getTableSample() {
		return new MyCustomTableSample();
	}

}
