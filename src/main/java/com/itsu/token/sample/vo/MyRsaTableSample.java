package com.itsu.token.sample.vo;

import com.itsu.itsutoken.annotation.PrivateKey;
import com.itsu.itsutoken.annotation.PublicKey;
import com.itsu.itsutoken.annotation.SysName;
import com.itsu.itsutoken.annotation.TableDesc;
import com.itsu.itsutoken.annotation.TableId;
import com.itsu.itsutoken.table.TableSample;

@TableDesc("sys_token")
public class MyRsaTableSample implements TableSample {
	@TableId
	private String id;
	
	@PrivateKey("private_t")
	private String privateKey;
	
	@PublicKey("public_t")
	private String publicKey;
	
	@SysName("name")
	private String name;
}
