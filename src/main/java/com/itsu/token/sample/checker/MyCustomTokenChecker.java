package com.itsu.token.sample.checker;

import org.aspectj.lang.JoinPoint;

import com.itsu.itsutoken.checker.CusTokenChecker;
import com.itsu.itsutoken.exception.TokenCheckException;
import com.itsu.token.sample.vo.MyCustomTableSample;

public class MyCustomTokenChecker extends CusTokenChecker<MyCustomTableSample> {

	@Override
	public void check(JoinPoint joinPoint) throws TokenCheckException {
		// do some check here
	}

	@Override
	public MyCustomTableSample getTableSample() {
		return new MyCustomTableSample();
	}

}
