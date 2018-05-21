package kesun.bll.web.impl;

import kesun.bll.SuperService;
import kesun.dao.IDoData;
import kesun.dao.web.INotice;
import kesun.dao.web.impl.DProduct;
import kesun.dao.web.impl.DStock;
import kesun.entity.web.Product;
import kesun.entity.web.Stock;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by heying on 2017/10/29.
 */
@Service("bStock")
public class StockServiceImpl extends SuperService implements INotice {
    @Resource(name = "dStock")
    private DStock dao;

    public StockServiceImpl() {
        setModel(new Stock());
    }

    public List<Map<String, Object>> getLoadoutExcelColumns() {
        return null;
    }

    public String getLoadoutExcelFileName() {
        return "产品库存信息";
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
