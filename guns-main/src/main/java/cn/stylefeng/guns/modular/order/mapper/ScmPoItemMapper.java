package cn.stylefeng.guns.modular.order.mapper;

import cn.stylefeng.guns.modular.order.entity.ScmPoItem;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * 采购订单行项目(ScmPoItem)表数据库访问层
 *
 * @author socik
 * @since 2019-12-20 13:24:46
 */
public interface ScmPoItemMapper extends BaseMapper<ScmPoItem> {
    /**
     * 根据条件查询角色列表
     *
     * @return
     * @date 2017年2月12日 下午9:14:34
     */
    Page<Map<String, Object>> selectOrder(@Param("page") Page page, @Param("poItemId") String poItemId);
}