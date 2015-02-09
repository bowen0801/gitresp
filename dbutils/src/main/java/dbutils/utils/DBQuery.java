package dbutils.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("rawtypes")
public class DBQuery<T> {
	private static Logger logger = LoggerFactory.getLogger(DBQuery.class);
	private Class clazz;

	public DBQuery(Class clazz) {
		this.clazz = clazz;
	}

	public T query(String sql, String name) throws SQLException {
		return query(sql, null, name);
	}

	public T query(String sql, Object param, String name) throws SQLException {
		return query(sql, new Object[] { param }, name);
	}

	@SuppressWarnings("unchecked")
	public T query(String sql, Object[] params, String name)
			throws SQLException {
		log(sql, params, name);
		DataSource dataSource = DataSourceFactory.getDataSource(name);
		QueryRunner runner = new QueryRunner(dataSource);
		return (T) runner.query(sql, new BeanHandler(clazz), params);
	}

	private void log(String sql, Object[] params, String name) {
		if (logger.isDebugEnabled()) {
			logger.debug("sql:[" + sql + "] params:" + Arrays.toString(params)
					+ " datasource name is:" + name);
		}
	}

	public List<T> queryList(String sql, String name) throws SQLException {
		return queryList(sql, null, name);
	}

	public List<T> queryList(String sql, Object param, String name)
			throws SQLException {
		return queryList(sql, new Object[] { param }, name);
	}

	public Long getcount(String sql, String name) throws SQLException {
		DataSource dataSource = DataSourceFactory.getDataSource(name);
		QueryRunner runner = new QueryRunner(dataSource);
		Long count = runner.query(sql, new ResultSetHandler<Long>() {

			public Long handle(ResultSet rs) throws SQLException {
				if (rs.next()) {
					return rs.getLong(1);
				}
				return 0L;
			}

		});
		return count;

	}

	@SuppressWarnings("unchecked")
	public List<T> queryList(String sql, Object[] params, String name)
			throws SQLException {
		log(sql, params, name);
		DataSource dataSource = DataSourceFactory.getDataSource(name);
		QueryRunner runner = new QueryRunner(dataSource);
		return (List<T>) runner.query(sql, new BeanListHandler(clazz), params);
	}

}
