package cn.stylefeng.guns.modular.order.controller;

import cn.stylefeng.guns.base.pojo.page.LayuiPageFactory;
import cn.stylefeng.guns.modular.order.service.impl.ScmPoItemServiceImpl;
import cn.stylefeng.guns.modular.order.wrapper.ScmPoItemWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 采购订单行项目(ScmPoItem)表控制层
 *
 * @author socik
 * @since 2019-12-20 13:24:46
 */
@Controller
@RequestMapping("/order")
public class ScmPoItemController {
    private static String PREFIX = "/modular/order";
    /**
     * 服务对象
     */
    @Resource
    private ScmPoItemServiceImpl scmPoItemService;

    /**
     * 跳转到订单查询列表页面
     *
     * @author fengshuonan
     * @Date 2018/12/23 6:30 PM
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "/manager"+".html";
    }


    /**
     *
     * @Description 获取订单列表数据
     * @Param [roleName]
     * @Return  java.lang.Object
     * @Author  socik
     * @Date 2019/12/20 15:40
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(@RequestParam(value = "poItemId", required = false) String poItemId) {
        Page<Map<String, Object>> roles = this.scmPoItemService.selectOrder(poItemId);
        Page<Map<String, Object>> wrap = new ScmPoItemWrapper(roles).wrap();
        return LayuiPageFactory.createPageInfo(wrap);
    }
}