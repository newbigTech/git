package com.hivescm.tms.api.dto.es.distribution.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author  boqiang.deng
 * @company 蜂网供应链管理（上海）有限公司
 * @since   2017/8/11
*/
@Data
@ToString
public class PublishHistoryReqDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	@ApiModelProperty("公司ID")
	private Long companyId;
	@ApiModelProperty("司机ID")
	private Long driverId;
	@ApiModelProperty("每页大小")
	private Integer pageSize;
	@ApiModelProperty("当前页")
	private Integer currentPage;

}

