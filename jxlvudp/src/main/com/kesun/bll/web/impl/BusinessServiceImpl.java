package kesun.bll.web.impl;

import kesun.bll.SuperService;
import kesun.dao.IDoData;
import kesun.dao.web.INotice;
import kesun.dao.web.impl.DBusiness;
import kesun.dao.web.impl.DProduct;
import kesun.entity.web.Business;
import kesun.entity.web.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by heying on 2017/10/29.
 */
@Service("bBusiness")
public class BusinessServiceImpl extends SuperService implements INotice {
    @Resource(name = "dBusiness")
    private DBusiness dao;

    public BusinessServiceImpl() {
        setModel(new Business());
    }

    public List<Map<String, Object>> getLoadoutExcelColumns() {
        return null;
    }

    public String getLoadoutExcelFileName() {
        return "加盟商管理信息";
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
