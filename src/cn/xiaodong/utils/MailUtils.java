package cn.xiaodong.utils;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

/**
 * mail������
 * ���ڷ����ʼ�ʱ������صĲ�����������
 * @author ������
 *
 */
public class MailUtils {

	public static void sendMail(String email, String emailMsg, String subject)
			throws AddressException, MessagingException {
		// 1.����һ���������ʼ��������Ự���� Session

		Properties props = new Properties();
		//���÷��͵�Э��
		props.setProperty("mail.transport.protocol", "SMTP");
		
		//���÷����ʼ��ķ�����
		props.setProperty("mail.host", "smtp.126.com");
		props.setProperty("mail.smtp.auth", "true");// ָ����֤Ϊtrue

		// ������֤��
		Authenticator auth = new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				//���÷����˵��ʺź�����
				return new PasswordAuthentication("choujiangxiang", "zxdwx19961018");
			}
		};

		Session session = Session.getInstance(props, auth);

		// 2.����һ��Message�����൱�����ʼ�����
		Message message = new MimeMessage(session);

		//���÷�����
		message.setFrom(new InternetAddress("choujiangxiang@126.com"));

		//���÷��ͷ�ʽ�������
		message.setRecipient(RecipientType.TO, new InternetAddress(email)); 

		//�����ʼ�����
		//message.setSubject("�û�����   �齱�����");
		message.setSubject(subject);
		
		// message.setText("�װ����û����ã�<br>���Ѿ��ɹ�ע���˳齱������<a href='#'>���</a>�����������˻�");

		//�����ʼ�����
		message.setContent(emailMsg, "text/html;charset=utf-8");

		// 3.���� Transport���ڽ��ʼ�����
		Transport.send(message);
	}
}
