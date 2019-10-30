package radnaeva.webapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import radnaeva.webapp.config.SpringConfig;
import radnaeva.webapp.service.TestBean;

import java.sql.SQLOutput;

public class TestSpring {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml"
//        );
//
//        TestBean testBean = context.getBean("testBean", TestBean.class);
//        System.out.println(testBean.getName());
//        context.close();


           AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
           TestBean bean = context.getBean(TestBean.class);
           String name = bean.getName();
           System.out.println(name);



    }
}
