package us.ossowitz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanRunner {

    public static void main(String[] args) {
        var applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean bean = applicationContext.getBean("testBean", TestBean.class);
        System.out.println(bean.getName());
        applicationContext.close();
    }
}
