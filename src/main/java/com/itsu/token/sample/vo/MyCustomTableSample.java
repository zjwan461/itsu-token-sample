package com.itsu.token.sample.vo;

import com.itsu.itsutoken.annotation.TableDesc;
import com.itsu.itsutoken.annotation.TableId;
import com.itsu.itsutoken.table.TableSample;

@TableDesc("tb_token")
public class MyCustomTableSample implements TableSample {

	@TableId
	private String id;
}
