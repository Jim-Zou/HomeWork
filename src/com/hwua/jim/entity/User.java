package com.hwua.jim.entity;

public class User {
private int id;
private String name;
private String pass;
private int age;
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", pass=" + pass + ", age=" + age + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}


}
