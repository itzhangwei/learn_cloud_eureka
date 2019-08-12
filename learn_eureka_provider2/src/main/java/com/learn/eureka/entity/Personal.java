package com.learn.eureka.entity;

import java.util.Date;

/**
 * @author zack.zhang
 * @projectName learn_cloud_eureka
 * @title Personal
 * @package com.learn.eureka.entity
 * @description
 * @date 2019-08-09 10:55
 */
public class Personal {
	
	private Date birth;
	
	private String name;
	
	public Date getBirth() {
		return birth;
	}
	
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
