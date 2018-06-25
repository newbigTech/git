package com.hivescm.tms.api.dto.es.dispatcher.request;

import java.io.Serializable;
import java.util.List;

import com.hivescm.framework.logger.api.annotation.Logger;
import com.hivescm.framework.validation.annotation.Required;
import com.hivescm.tms.api.dto.es.waybill.component.TmsWaybillEsDTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * 派车单发车请求数据对象
 *
 * @author 李洪春
 * @since 2017/8/14 20:51
 */
@Data
@ToString
public class DispatcheStorageReqDTO implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -875225972115997910L;

    /**
     * 公司Id
     */
    @Required
    @ApiModelProperty(value = "公司Id", notes = "前端调用时不传")
    private Long companyId;

    /**
     * 操作用户ID
     */
    @Required
    @ApiModelProperty(value = "操作用户ID", notes = "前端调用时不传")
    private Integer opUserId;

    /**
     * 操作用户名称
     */
    @Required
    @ApiModelProperty(value = "操作用户名称", notes = "前端调用时不传")
    private String opUserName;

    /**
     * 派车单Id
     */
    @Logger
    @Required
    @ApiModelProperty("派车单Id")
    private Long dispatcherId;
    
    /**
     * 派车单Id
     */
    @Logger
    @Required
    @ApiModelProperty("派车单明细Id")
    private Long dispatcherDetailId;
    @Logger
    @Required
    @ApiModelProperty("运单Id")
    private Long waybillId;

    /**
     * 网点ID
     */
    @ApiModelProperty("网点ID")
    private Integer branchId;

    /**
     * 当前网点名称
     */
    @ApiModelProperty("网点名称")
    private String branchName;
    @Required
    @ApiModelProperty("操作类型（1.提货入库 2补录运单）")
    private Integer type;

    /**
     * 派车单明细ID列表
     */
    @ApiModelProperty(value = "运单基本信息", notes = "派车单提货入库时需传此参数")
    private TmsWaybillEsDTO waybillEsDto;
    
    
}
