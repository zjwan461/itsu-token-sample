package com.itsu.token.sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.itsu.itsutoken.table.TableSample;
import com.itsu.token.sample.vo.MySimpleTableSample;

@Configuration
public class ItsuTokenConfiguration {

	@Bean
	public TableSample tableSample() {
		return new MySimpleTableSample();
	}
}
