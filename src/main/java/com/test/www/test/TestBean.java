package com.test.www.test;
/**
 * 测试BEAN
 * @author dabin
 * 2015年9月18日
 */
public class TestBean implements Cloneable {
	//姓名
	private String name;
	//性别
	private String sex;
	//年龄
	private String age;

	protected String high;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
    
	@Override
	protected Object clone()  {
		
		TestBean test = null;
		
		try {
			test = (TestBean) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return test;
	}
}
