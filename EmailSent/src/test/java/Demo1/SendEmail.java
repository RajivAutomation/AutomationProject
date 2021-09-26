package Demo1;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {

	public static void main(String[] args) throws EmailException {
		
		Email mail = new SimpleEmail();
		mail.setHostName("smtp.gmail.com");
		mail.setSmtpPort(465);
		mail.setAuthenticator(new DefaultAuthenticator("rajivkukreti1@gmail.com", "rajivgmail"));
		mail.setSSLOnConnect(true);
		mail.setFrom("rajivkukreti1@gmail.com");
		mail.setSubject("Test Mail from Rajiv");
		mail.setMsg("This is a test mail ... body...");
		mail.addTo("kukreti_rajiv@yahoo.co.in");
		mail.send();
		
	}
	
}
