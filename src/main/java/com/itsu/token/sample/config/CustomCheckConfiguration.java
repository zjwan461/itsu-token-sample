package com.itsu.token.sample.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.itsu.itsutoken.checker.CusTokenChecker;
import com.itsu.token.sample.checker.MyCustomTokenChecker;
import com.itsu.token.sample.vo.MyCustomTableSample;

@Configuration
@ConditionalOnProperty(name = "itsu-token.type", havingValue = "custom")
public class CustomCheckConfiguration {
	
	@Bean
	public CusTokenChecker<MyCustomTableSample> tokenCheckerGenerater() {
		MyCustomTokenChecker customTokenChecker = new MyCustomTokenChecker();
		return customTokenChecker;
	}
}
