package cn.xiaodong.domain;
/**
 * ����Ա��
 * 
 * @author ������
 *
 */
public class user {
	
	//����Ա���
	private int id;
	
	//����Ա�û���
	private char username;
	
	//����Ա��ȫ��֤����
	private char email;
	
	//��ȫ��֤��
	private char securityCode;

	//Get��Set����
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public char getUsername() {
		return username;
	}

	public void setUsername(char username) {
		this.username = username;
	}

	public char getEmail() {
		return email;
	}

	public void setEmail(char email) {
		this.email = email;
	}

	public char getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(char securityCode) {
		this.securityCode = securityCode;
	}

}
