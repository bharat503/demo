package com.example.demo;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailAlert {

	public static void sendmail(String msg){
		 final String username = "rllgroupmphasis@gmail.com";
	        final String password = "Rll@1234";
	        Properties prop = new Properties();
	        prop.put("mail.smtp.host", "smtp.gmail.com");
	        prop.put("mail.smtp.port", "587");
	        prop.put("mail.smtp.auth", "true");
	        prop.put("mail.smtp.starttls.enable", "true"); 
	        Session session = Session.getInstance(prop,
	                new javax.mail.Authenticator() {
	                    protected PasswordAuthentication getPasswordAuthentication() {
	                        return new PasswordAuthentication(username, password);
	                    }
	                });
	        try {
	            Message message = new MimeMessage(session);
	            message.setFrom(new InternetAddress("rllgroupmphasis@gmail.com"));
	            message.setRecipients(
	                    Message.RecipientType.TO,
	                    InternetAddress.parse("bharatchopade2020@gmail.com")
	            );
	            message.setSubject("Testing RLL");
	            message.setText(msg);
	            Transport.send(message);
	            System.out.println("Done");
	        } catch (MessagingException e) {
	            e.printStackTrace();
	        }

	}
	
}

