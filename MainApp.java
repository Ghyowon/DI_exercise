package ex1_xml3_list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ex1_xml3_list/applicationContext.xml");
		//스프링설정파일
		
		ListBean bean = (ListBean)context.getBean("bean");
		for(Integer i : bean.getIntList()){
			System.out.println(i);
		}
		for(MemberBean m : bean.getMemberList()){
			m.output();
		}
	}

}
