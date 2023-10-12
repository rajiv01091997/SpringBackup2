package com.globallogic.email.service;


import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Component;

import com.globallogic.email.Model.Entity;



@Component
public class ServiceImpl {

	public boolean sendMail(Entity entity)
	{ boolean flag=false;
	
	String host="smtp.gmail.com";
	
	Properties properties=System.getProperties();
	
	properties.setProperty("mail.smtp.host", host);
	properties.setProperty("mail.smtp.port", "465");
	properties.setProperty("mail.smtp.ssl.enable", "true");
	properties.setProperty("mail.smtp.auth", "true");
	
	Session session =Session.getInstance(properties, new Authenticator() {
		protected PasswordAuthentication getPasswordAuthentication()
		{
			return new PasswordAuthentication("rajiv01091997@gmail.com", "uverbojyyuwabypt");
		}
	});
	
	session.setDebug(true);
	
	MimeMessage m=new MimeMessage(session);
	
	try {
		
		m.setFrom("rajiv01091997@gmail.com");
		
		m.addRecipient(Message.RecipientType.TO, new InternetAddress(entity.getTo()));
		
		m.setSubject(entity.getSubject());
		
		m.setText(entity.getMsg());
		
		Transport.send(m);
		
		System.out.println("Sent Successfully------");
		
		return true;
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	return flag;
	}
	
	
	
}
