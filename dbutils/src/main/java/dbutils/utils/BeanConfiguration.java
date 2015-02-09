package dbutils.utils;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 加载所有可配置的bean
 * 
 * @author grady.song
 * 
 */
public class BeanConfiguration {
	private static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
			new String[] { "configuration.xml" });

	public static <T> T getBean(Class<T> clazz) {
		return context.getBean(clazz);
	}

	public static Object getBean(String name) {
		return context.getBean(name);
	}

	public static <T> T getBean(String name, Class<T> clazz) {
		return context.getBean(name, clazz);
	}
}
