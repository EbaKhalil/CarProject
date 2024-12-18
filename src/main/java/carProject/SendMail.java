package carProject;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SendMail {
    private SendMail(){}
    public static void getSendEmail(String toUserMessage,String email){
        Logger logger = LogManager.getLogger(SendMail.class);
        String to = email;

        final String from = "carcompany78@gmail.com";

        // Assuming you are sending email from through gmails smtp
        String host = "smtp.gmail.com";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.put("mail.smtp.host",host);

        properties.put("mail.smtp.port","465");

        properties.put("mail.smtp.ssl.enable","true");

        properties.put("mail.smtp.auth","true");

        // Get the Session object.// and pass username and password
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication(from, "izzd lqip iayx ndwf");

            }

        });

        // Used to debug SMTP issues
        session.setDebug(false);

        try

        {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));


            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("Your Order Status!!");

            // Now set the actual message
            message.setText("Your Order Status is : \n "+toUserMessage);

            logger.log (Level.INFO,"sending...");
            // Send message
            Transport.send(message);
            logger.log(Level.INFO,"Sent message successfully....,We will contact you");

        }  catch(Exception e) {
   
            logger.log(Level.ERROR, "Error sending email: " + e.getMessage());
      
        }
}

    }



