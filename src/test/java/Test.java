import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

/**
 * @Description
 * @Author ZWen
 * @Date 2019/1/21 10:38 AM
 * @Version 1.0
 **/
public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("a.xml","b.xml");
		Object bean = applicationContext.getBean("");
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(null);
	}
}