package kesun.bll.web.impl;

import kesun.bll.SuperService;
import kesun.bll.web.INotice;
import kesun.dao.IDoData;


import kesun.dao.web.impl.DOrders;
import kesun.entity.web.Orders;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by 李凡 on 2018/4/25.
 */
@Service("bOrders")
public class OrdersServiceImpl extends SuperService implements INotice{
  @Resource(name="dOrders")
  private DOrders dao;
  public OrdersServiceImpl(){
      setModel(new Orders());
  }
    public List<Map<String, Object>> getLoadoutExcelColumns() {
        return null;
    }

    public String getLoadoutExcelFileName() {
        return "订单信息";
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
