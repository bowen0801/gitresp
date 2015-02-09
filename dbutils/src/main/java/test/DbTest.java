package test;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import dbutils.utils.DBQuery;
/**
 * DBUtils单元测试类
 * 测试功能如下：
 * 新增：使用参数
 * 修改：使用参数
 * 删除：根据id删除和批量删除
 * 查询：无条件查询和有条件查询，分页查询
 * @author admin
 *
 */
public class DbTest {
	@Test
	public void testDbQuery(){
		DBQuery<CateBean> dbQuery = new DBQuery<CateBean>(CateBean.class);
		
		try {
			
			/*dbQuery.query("select line_name.line_name_en from td_prodline", "category");*/
			List<CateBean> list = dbQuery.queryList("select line_name as lineName,line_name_cn as lineNameEn from td_prodline", "category");
			
			System.out.println(list);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 测试参数使用
	 */
	@Test
	public void testQueryByParam(){
		DBQuery<CateBean> dbQuery = new DBQuery<CateBean>(CateBean.class);
		try {
			List<CateBean> list = dbQuery.
					queryList("select line_name as lineName,line_name_cn as lineNameEn " +
							"from td_prodline where prod_line_id=?", new Object[]{1410331340972093L}, "category");
		for (CateBean cateBean : list) {
			System.out.println("------"+cateBean.getLineName());
		}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	

}
