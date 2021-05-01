package constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Appstud2 {
	public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("constructorinjection/configstud2.xml");
        Student2 stud2=(Student2)context.getBean("Stud");
        System.out.println(stud2.getId());
        System.out.println(stud2.getParents());
        System.out.println(stud2.getPhones());
        System.out.println(stud2.getSubject());
    }
}
