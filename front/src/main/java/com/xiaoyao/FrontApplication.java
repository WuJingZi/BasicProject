package com.xiaoyao;

import org.apache.commons.lang3.StringUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
@MapperScan(basePackages = "com.xiaoyao")  //统一扫描dao
public class FrontApplication {
	public static void main(String[] args) {
		try{
			SpringApplication.run(FrontApplication.class, args);
		}catch(Exception e){
			if(StringUtils.isNotBlank(e.getMessage())){
				System.out.println(e.getMessage());
			}
		}

	}
	
	
	

}
