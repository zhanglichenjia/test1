package kesun.bll.web.impl;

import kesun.bll.SuperService;
import kesun.dao.IDoData;
import kesun.dao.web.INotice;
import kesun.dao.web.impl.DBuyProduct;
import kesun.dao.web.impl.DProduct;
import kesun.entity.web.Buyproduct;
import kesun.entity.web.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by heying on 2017/10/29.
 */
@Service("bBuyProduct")
public class BuyProductServiceImpl extends SuperService implements INotice {
    @Resource(name = "dBuyProduct")
    private DBuyProduct dao;

    public BuyProductServiceImpl() {
        setModel(new Buyproduct());
    }

    public List<Map<String, Object>> getLoadoutExcelColumns() {
        return null;
    }

    public String getLoadoutExcelFileName() {
        return "购买产品信息";
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
