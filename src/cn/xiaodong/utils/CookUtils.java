package cn.xiaodong.utils;

//�ֶ�ɾ�������Ĵ���

//��һ�д����PC2����д���ǲ�һ���ģ��϶��г�ͻ

import javax.servlet.http.Cookie;

public class CookUtils {
	/**
	 * ͨ��������cookie�����ȡָ����cookie
	 * @param name cookie����
	 * @param cookies  cookie����
	 * @return
	 */
	public static Cookie getCookieByName(String name, Cookie[] cookies) {
		if(cookies!=null){
			for (Cookie c : cookies) {
				//ͨ�����ƻ�ȡ
				if(name.equals(c.getName())){
					//����
					return c;
				}
			}
		}
		return null;
	}
}


//���ı���ĩβ����PC1����ӱ��д��룬����PC2����û�б��д����