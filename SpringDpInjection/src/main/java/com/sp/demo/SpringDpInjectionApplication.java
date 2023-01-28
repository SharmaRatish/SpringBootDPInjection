package com.sp.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.demo.model.Employee;
import com.sp.demo.model.User;


public class SpringDpInjectionApplication {


		public static void main(String[] args) {
			ApplicationContext apContext=new ClassPathXmlApplicationContext("classpath:springContext.xml");
			User user=(User) apContext.getBean("userbean");
			System.out.println(user.show());
			
			Employee emp=(Employee) apContext.getBean("useremp");
			System.out.println(emp.show());
			
			Employee emp1=(Employee)apContext.getBean("useremp1");
			System.out.println(emp1.show());
			
		}

}	