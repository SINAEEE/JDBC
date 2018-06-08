package jdbc.hr.employees.dao;

import java.util.List;
import jdbc.hr.employees.vo.EmployeeVo;

public interface IEmployeeDao {
	// 규약
	public List<EmployeeVo> getList();
	public List<EmployeeVo> getListByName(String keyword); //키워드로 넘어간 값을 가지고 이름에서 검색해 리스트를 넘겨준다.
	

}
