package com.globallogic.Model;

public class Entity {
private String from;
private String to;
private String subject;
private String msg;
public Entity() {
	super();
	// TODO Auto-generated constructor stub
}
public Entity(String from, String to, String subject, String msg) {
	super();
	this.from = from;
	this.to = to;
	this.subject = subject;
	this.msg = msg;
}
public String getFrom() {
	return from;
}
public void setFrom(String from) {
	this.from = from;
}
public String getTo() {
	return to;
}
public void setTo(String to) {
	this.to = to;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
@Override
public String toString() {
	return "Entity [from=" + from + ", to=" + to + ", subject=" + subject + ", msg=" + msg + "]";
}

}
