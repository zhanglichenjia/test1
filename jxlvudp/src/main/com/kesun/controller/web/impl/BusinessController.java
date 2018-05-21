package kesun.controller.web.impl;

import kesun.bll.SuperService;
import kesun.bll.web.impl.BusinessServiceImpl;
import kesun.bll.web.impl.ProductServiceImpl;
import kesun.controller.SuperController;
import kesun.util.JSONAndObject;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import shiro.TokenManage;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther 张丽
 * @Date 2018/4/25 15:17
 * version 1.0.0
 */
@Controller
@RequestMapping("Business")
public class BusinessController extends SuperController{
    @Resource(name = "bBusiness")
    private BusinessServiceImpl bll;
    public SuperService getService() {

        return bll;
    }

    public Map<String, Object> getConditionParam(JSONObject param) {
        if (param==null) return  null;//判断条件是否为空param是页面传递的值
        Map<String,Object> values=new HashMap<String, Object>();
        if (JSONAndObject.GetJsonStringValue(param,"condition")!=null)
        {
            values.put("id", JSONAndObject.GetJsonStringValue(param,"condition"));
            values.put("name",JSONAndObject.GetJsonStringValue(param,"condition"));
        }
        return values;
    }
    public Map<String, Object> setFindFilter(JSONObject param) {
        return null;
    }
    @RequestMapping("/index")
    public String index(){
        return "web/Business/BusinessManage";
    }

}
