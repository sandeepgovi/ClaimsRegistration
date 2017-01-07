package com.lm.hackathon.dao;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;


public class JavaMailService {
	
	
	private static String USER_NAME = "lmctshackathon";  // GMail user name (just the part before "@gmail.com")
    private static String PASSWORD = "lmcts1234"; // GMail password
    private static String RECIPIENT ;
    
    
    public static void sendMail(String recipient) {
    	RECIPIENT=recipient;
        String from = USER_NAME;
        String pass = PASSWORD;
        System.out.println(from+pass);
        String[] to = { RECIPIENT }; // list of recipient email addresses
        String subject = "Liberty Mutual Claim Center";
        String body = "Claim is registered!";

        
        
			sendFromGMail(from, pass, to, subject, body);
		
    }

    private static void sendFromGMail(final String from, final String pass, String[] to, String subject, String body) {
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", pass);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        /*
        Session session =   Session.getInstance(props, new GMailAuthenticator(from, pass));
       // Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);*/
        
        
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication("lmctshackathon", "lmcts1234");
            }
        });
        javax.mail.internet.MimeMessage message = new javax.mail.internet.MimeMessage(session);
        try {
            message.setFrom(new InternetAddress(from));
            javax.mail.internet.InternetAddress[] toAddress = new InternetAddress[to.length];

            // To get the array of addresses
            for( int i = 0; i < to.length; i++ ) {
                toAddress[i] = new InternetAddress(to[i]);
            }

            for( int i = 0; i < toAddress.length; i++) {
                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }

            message.setSubject(subject);
            message.setText(body);
            javax.mail.Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }
        catch (AddressException ae) {
            ae.printStackTrace();
            
        }
        catch (MessagingException me) {
            me.printStackTrace();
        }
        
    }
	

}
