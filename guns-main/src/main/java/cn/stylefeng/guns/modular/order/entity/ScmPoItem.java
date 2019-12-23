package cn.stylefeng.guns.modular.order.entity;

import java.util.Date;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
/**
 * 采购订单行项目(ScmPoItem)实体类
 *
 * @author socik
 * @since 2019-12-20 13:24:46
 */
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("scm_po_item")
public class ScmPoItem implements Serializable {
    private static final long serialVersionUID = -90886978390646815L;
    /**
    * 行项目ID
    */
    private String poItemId;
    /**
    * 行项目号
    */
    private String itemNo;
    /**
    * 项目类别
    */
    private String projectCategory;
/*    *//**
    * 科目分配类别
    *//*
    private String subjectCategory;
    *//**
    * 物料编码
    *//*
    private String materialCode;
    *//**
    * 物料描述
    *//*
    private String materialDesc;
    *//**
    * 工厂
    *//*
    private String factory;
    *//**
    * 库存地点
    *//*
    private String storageLocation;
    *//**
    * 物料组
    *//*
    private String materialGroup;
    *//**
    * 采购信息记录的编号
    *//*
    private String purchInfoRecordCode;
    *//**
    * 需求者/请求者姓名
    *//*
    private String requester;
    *//**
    * 采购订单数量
    *//*
    private Double poCount;
    *//**
    * 采购订单的计量单位
    *//*
    private String poUnit;
    *//**
    * 含税单价
    *//*
    private Double poPrice;
    *//**
    * 价格单位
    *//*
    private String priceUnit;
    *//**
    * 订单价格单位(采购)
    *//*
    private String poPriceUnit;
    *//**
    * 税码
    *//*
    private String taxCode;
    *//**
    * 以采购订单货币计的订单总价值
    *//*
    private Double totalPrice;
    *//**
    * 发票收据标识
    *//*
    private String receiveFlag;
    *//**
    * 标识：基于收货的发票验证
    *//*
    private String invoiceFlag;
    *//**
    * 重要的采购协议号
    *//*
    private String agreementNo;
    *//**
    * 主要采购协议的项目编号
    *//*
    private String agreementItemNo;
    *//**
    * 采购申请编号
    *//*
    private String prNo;
    *//**
    * 采购申请的项目编号
    *//*
    private String prItemNo;
    *//**
    * 退货项目
    *//*
    private String returnProject;
    *//**
    * 标识：相关项目免费
    *//*
    private String freeFlag;
    *//**
    * 交货日期
    *//*
    private Date deliveryDate;
    *//**
    * 供应商回复交期
    *//*
    private Date replyDate;
    *//**
    * 成本中心
    *//*
    private String costCenter;
    *//**
    * 固定资产号
    *//*
    private String fixedAssetsNo;
    *//**
    * 固定资产次级号
    *//*
    private String fixedAssetsSubno;
    *//**
    * 订单号
    *//*
    private String poNo;
    *//**
    * 内部订单号
    *//*
    private String internalPoNo;
    *//**
    * 备注
    *//*
    private String remark;
    *//**
    * 附件
    *//*
    private String attachment;
    *//**
    * 行项目UUID
    *//*
    private String itemUuid;
    *//**
    * 0草稿,1已经确认，-1取消,2分批发货,3订单发货完毕
    *//*
    private String itemStatus;
    *//**
    * 是否已收货
    *//*
    private String receiptedFlag;
    *//**
    * 删除标志
    *//*
    private String deleteFlag;
    *//**
    * 创建人
    *//*
    private String createdBy;
    *//**
    * 创建日期
    *//*
    private Date creationDate;
    *//**
    * 修改人
    *//*
    private String lastUpdatedBy;
    *//**
    * 修改日期
    *//*
    private Date lastUpdateDate;
    *//**
    * 建议交期
    *//*
    private Date suggestDate;
    *//**
    * 二维码图片
    *//*
    private String url;
    *//**
    * 待发货数量
    *//*
    private Double backOrders;
    *//**
    * 信息记录编码
    *//*
    private String infoCode;
    *//**
    * 是否来自配额，true/false
    *//*
    private String fromQuotaFlag;*/
}