package com.hivescm.tms.api.dto.es.order.request;

import com.hivescm.framework.logger.api.annotation.Logger;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
/**
 * 承运商网点获取接单列表 请求体
 * @author Administrator
 *
 */
@Data
@ToString
public class GetBranchAcceptOrderListReq implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2842147249563617274L;

    /**
     * 操作用户ID
     */
    @ApiModelProperty(value = "操作用户ID", notes = "前端调用时不传")
    private Integer opUserId;

    /**
     * 操作用户名称
     */
    @ApiModelProperty(value = "操作用户名称", notes = "前端调用时不传")
    private String opUserName;
    
    /**
     * 操作网点Id
     */
    @ApiModelProperty(value = "操作网点Id", notes = "前端调用时不传")
    private Integer branchId;
    
    /**
     * 承运商ID
     */
    @Logger
    @ApiModelProperty(value = "承运商ID")
    private Integer carrierId;
    
    
    /**
     * 接单时间开始
     */
    @ApiModelProperty(value = "接单时间开始")
    private Long acceptTimeStart;
    
    /**
     * 接单时间结束
     */
    @ApiModelProperty(value = "接单时间结束")
    private Long acceptTimeEnd;
    
    /**
	 * 分页 - 每页显示数
	 */
	private @ApiModelProperty("分页 - 每页显示数") Integer pageSize;
	/**
	 * 分页 - 当前页数
	 */
	private @ApiModelProperty("分页 - 当前页数") Integer currentPage;
	
	/**
     * 仓线路ID
     */
	@Logger
    @ApiModelProperty(value = "仓线路ID")
    private Long warehouseLineId;
}
