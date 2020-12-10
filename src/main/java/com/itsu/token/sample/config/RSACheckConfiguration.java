package com.itsu.token.sample.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.itsu.token.sample.vo.MyRsaTableSample;

@Configuration
@ConditionalOnProperty(name = "itsu-token.type", havingValue = "rsa")
public class RSACheckConfiguration {

	@Bean
	@ConditionalOnProperty(name = "itsu-token.init.custom-schema", havingValue = "true")
	public MyRsaTableSample myRsaTableSample() {
		return new MyRsaTableSample();
	}
}
