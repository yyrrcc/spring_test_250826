package com.mycompany.studentself;

public class StudentDto {
	private String name;
	private int age;
	private String major;
	
	// (1) 기본 생성자 (setter 주입용)
	public StudentDto() {
	}

	// (2) 모든 필드 받는 생성자 (생성자 주입용)
	public StudentDto(String name, int age, String major) {
		this.name = name;
		this.age = age;
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
    @Override
    public String toString() {
        return "StudentDto{name='" + name + "', age=" + age + ", major='" + major + "'}";
    }
	

	
}
