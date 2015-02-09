package dbutils.utils;

import javax.sql.DataSource;

public class DataSourceFactory {
	public static DataSource getDataSource(String name) {
		DataSource dataSource = (DataSource) BeanConfiguration.getBean(name);
		if (dataSource == null) {
			dataSource = (DataSource) BeanConfiguration.getBean(name);
		}
		return dataSource;
	}

}
