package cn.stylefeng.guns.modular.order.wrapper;

import cn.stylefeng.roses.core.base.warpper.BaseControllerWrapper;
import cn.stylefeng.roses.kernel.model.page.PageResult;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import java.util.List;
import java.util.Map;

/**
 * @author socik
 * @date 2019/12/20 15:38
 * @email socik@qq.com
 */
public class ScmPoItemWrapper  extends BaseControllerWrapper {
    public ScmPoItemWrapper(Map<String, Object> single) {
        super(single);
    }

    public ScmPoItemWrapper(List<Map<String, Object>> multi) {
        super(multi);
    }

    public ScmPoItemWrapper(Page<Map<String, Object>> page) {
        super(page);
    }

    public ScmPoItemWrapper(PageResult<Map<String, Object>> pageResult) {
        super(pageResult);
    }

    @Override
    protected void wrapTheMap(Map<String, Object> map) {

    }
}
