package kesun.bll.web.impl;

import kesun.bll.SuperService;
import kesun.dao.IDoData;
import kesun.dao.web.INotice;
import kesun.dao.web.impl.DProduct;
import kesun.dao.web.impl.DTest;
import kesun.entity.web.Product;
import kesun.entity.web.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by heying on 2017/10/29.
 */
@Service("bProduct")
public class ProductServiceImpl extends SuperService implements INotice {
    @Resource(name = "dProduct")
    private DProduct dao;

    public ProductServiceImpl() {
        setModel(new Product());
    }

    public List<Map<String, Object>> getLoadoutExcelColumns() {
        return null;
    }

    public String getLoadoutExcelFileName() {
        return "产品信息信息";
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
