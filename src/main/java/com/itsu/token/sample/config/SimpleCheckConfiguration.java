package com.itsu.token.sample.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.itsu.token.sample.vo.MySimpleTableSample;

@Configuration
@ConditionalOnProperty(name = "itsu-token.type", havingValue = "simple")
public class SimpleCheckConfiguration {

	@Bean
	@ConditionalOnProperty(name = "itsu-token.init.custom-schema", havingValue = "true")
	public MySimpleTableSample mySimpleTableSample() {
		return new MySimpleTableSample();
	}
}
