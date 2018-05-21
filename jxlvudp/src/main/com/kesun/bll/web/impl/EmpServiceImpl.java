package kesun.bll.web.impl;

import kesun.bll.SuperService;
import kesun.bll.web.INotice;
import kesun.dao.IDoData;
import kesun.dao.web.impl.DEmp;
import kesun.dao.web.impl.DUsers;
import kesun.entity.web.Emp;
import kesun.entity.web.Users;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by 李凡 on 2018/4/25.
 */
@Service("bEmp")
public class EmpServiceImpl extends SuperService implements INotice{
  @Resource(name="dEmp")
  private DEmp dao;
  public EmpServiceImpl(){
      setModel(new Emp());
  }
    public List<Map<String, Object>> getLoadoutExcelColumns() {
        return null;
    }

    public String getLoadoutExcelFileName() {
        return "员工信息";
    }

    public IDoData getDAO() {
        return dao;
    }

    public List getSaveAll(String filePath) {
        return null;
    }
    @Override
    public Boolean isInUse() {
        return false;
    }
}
