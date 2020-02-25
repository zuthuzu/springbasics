package ua.kpi.tef.zu.springbasics;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Anton Domin on 2020-02-25
 */
public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

		SomeBean tmp = context.getBean("someBean", SomeBean.class);

		System.out.println(tmp);

		context.close();
	}
}
