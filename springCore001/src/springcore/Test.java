package springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource resource= new ClassPathResource("ApplicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Ram ram=(Ram)factory.getBean("ram");
		ram.eat();
		ram.sleep();
		Shyam shyam=(Shyam) factory.getBean("shyam");
		shyam.eat();
		shyam.sleep();     
		
	}

}
