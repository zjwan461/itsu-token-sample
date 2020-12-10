package com.itsu.token.sample.vo;

import com.itsu.itsutoken.annotation.SimpleToken;
import com.itsu.itsutoken.annotation.SysName;
import com.itsu.itsutoken.annotation.TableDesc;
import com.itsu.itsutoken.annotation.TableId;
import com.itsu.itsutoken.table.TableSample;

@TableDesc("sys_token")
public class MySimpleTableSample implements TableSample {

	@TableId
	private String id;
	
	@SimpleToken("simple_token")
	private String token;
	
	@SysName("name")
	private String name;
	
	
}
