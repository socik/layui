package cn.stylefeng.guns.modular.order.service.impl;

import cn.stylefeng.guns.base.pojo.page.LayuiPageFactory;
import cn.stylefeng.guns.modular.order.mapper.ScmPoItemMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 采购订单行项目(ScmPoItem)表服务实现类
 *
 * @author socik
 * @since 2019-12-20 13:24:46
 */
@Service("scmPoItemService")
public class ScmPoItemServiceImpl {
    @Resource
    private ScmPoItemMapper scmPoItemMapper;


    /**
     * 根据条件查询角色列表
     *
     * @return
     * @date 2017年2月12日 下午9:14:34
     */
    public Page<Map<String, Object>> selectOrder(String poItemId) {
        Page page = LayuiPageFactory.defaultPage();
        return this.scmPoItemMapper.selectOrder(page, poItemId);
    }
}